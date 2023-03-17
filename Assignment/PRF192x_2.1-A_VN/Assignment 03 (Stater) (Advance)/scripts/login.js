"use strict";
const inputUserName = document.getElementById("input-username");
const inputPassword = document.getElementById("input-password");
const btnSubmit = document.getElementById("btn-submit");
// TODO: Bắt sự kiện click "Login"

btnSubmit.addEventListener("click", function () {
  const isValidate = validate();
  if (isValidate) {
    // tìm kiếm trong mảng "userArr" thông tin user người dùng nhập vào "form" không
    const user = userArr.find(
      (item) =>
        item.userName === inputUserName.value &&
        item.password === inputPassword.value
    );
    //==>trả về một "user"
    console.log(user);
    //kiểm tra "user" đúng
    if (user) {
      alert("Đăng nhập thành công");
      // TODO: lưu thông tin user đăng nhập. Khi login thành công sẽ lưu currentUser vào localStorage.
        saveToStorage("currentUser",user)
    //chuyển sang trang "home"
    window.location.href = '../index.html';

    }
     else {
      alert("Đăng nhập không thành công");
    }
  }
});
// TODO: kiểm tra người dùng nhập thông tin có để trống không
/**
 * 
 * @returns kiểm tra người dùng nhập thông tin có để trống không
 */
function validate() {
  let isValidate = true;
  if (inputUserName.value === "") {
    alert("Nhập User Name");
    isValidate = false;
  }
  if (inputPassword.value === "") {
    alert("Nhập Password");
    isValidate = false;
  }
  return isValidate;
}
