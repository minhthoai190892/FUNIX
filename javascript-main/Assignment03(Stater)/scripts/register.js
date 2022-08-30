"use strict";
const inputFirstName = document.getElementById("input-firstname");
const inputLastName = document.getElementById("input-lastname");
const inputUserName = document.getElementById("input-username");
const inputPassword = document.getElementById("input-password");
const inputPasswordConfirm = document.getElementById("input-password-confirm");
const btnSubmit = document.getElementById("btn-submit");
// TODO: Bắt sự kiện click "Register"
btnSubmit.addEventListener("click", function () {
  // lấy dữ liệu nhập từ "form"
  //tạo đối tượng "user"
  const user = new User(
    inputFirstName.value,
    inputLastName.value,
    inputUserName.value,
    inputPassword.value
  );
  const validate = validateDate(user);
  if (validate) {
    //thêm vào mảng "userArr"
    userArr.push(user);
    //cập nhập lại mảng "userArr" dưới localStorage
    saveToStorage("userArr", userArr);
    alert("Đăng ký thành công")
    //chuyển đến trang "Login" sau khi "Register" thành công
    window.location.href = '../pages/login.html';
  }
  console.log(validate);
  console.log(user);
});
//Gọi hàm validate để kiểm tra form hợp lệ
/**
 * 
 * @param {*} user kiểm tra người dùng có điển đầy đủ thông tin không
 * @returns trả về "true" khi người dùng điền đúng yêu cầu 
 * trả vè "false" khi người dùng nhập sai yêu cầu
 */
function validateDate(user) {
  let isValidate = true;
  //kiểm tra các trường Không có trường nào bị bỏ trống.
  if (user.firstName.trim().length === 0) {
    alert("Nhập First Name");
    isValidate = false;
  }
  if (user.lastName.trim().length === 0) {
    alert("Nhập Last Name");
    isValidate = false;
  }
  if (user.userName.trim().length === 0) {
    alert("Nhập User Name");
    isValidate = false;
  }
  if (user.password.trim().length === 0) {
    alert("Nhập Password");
    isValidate = false;
  }
  if (inputPasswordConfirm.value === "") {
    alert("Nhập Password Confirm");
    isValidate = false;
  }
  //Username không được trùng với Username của các người dùng trước đó.
  // TODO:cách 1
  if (
    !userArr.every((item) => (item.userName !== user.userName ? true : false))
  ) {
    alert("Username đã tồn tại.");
    isValidate = false;
  }

  // TODO:cách 2

  // for (let index = 0; index < userArr.length; index++) {
  //   console.log(userArr[index]);
  //   if (userArr[index].userName === user.userName) {
  //     alert("Username đã tồn tại.");
  //     isValidate = false;
  //     break;
  //   }
  // }

  // Password và Confirm Password phải giống nhau.
  if (user.password !== inputPasswordConfirm.value) {
    alert("Password và Confirm Password phải giống nhau.");
    isValidate = false;
  }
  // Password phải có nhiều hơn 8 ký tự.
  if (user.password.length <= 8) {
    alert("Password phải có nhiều hơn 8 ký tự.");
    isValidate = false;
  }
  return isValidate;
}
