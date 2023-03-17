"use strict";
//kiểm tra xem có đăng nhập không
if (currentUser) {
  const inputPageSize = document.getElementById("input-page-size");
  const inputCategory = document.getElementById("input-category");
  const btnSubmit = document.getElementById("btn-submit");
  // TODO: bắt sự kiện "submit"
  btnSubmit.addEventListener("click", function () {
    const isvalidate = validate();
    if (isvalidate) {
      //cập nhật lại các thuộc tính "currentUser" mà người dùng nhập vào từ "form"
      currentUser.pageSize = Number.parseInt(inputPageSize.value);
      currentUser.category = inputCategory.value;
      //cập nhật lại dưới "localStorega"
      saveToStorage("currentUser", currentUser);
      //TODO: sau khi cập nhât "currentUser" tiếp theo ta cập nhật lại "userArr"
      //tìm vị trí của "user" được "setting"
      const index = userArr.findIndex(
        (userItem) => userItem.userName === currentUser.userName
      ); //=> trả về 1 index
      //sau khi có "index" ta gán lại với "currentUser"
      userArr[index] = currentUser;
      //lưu dữ liệu xuống "localStorage"
      saveToStorage("userArr", userArr);
      alert("Thay đổi thành công");
      //xóa dữ liệu đã nhập ở "form"
      inputPageSize.value = "";
      inputCategory.value = "General";
    }
  });
  // TODO: kiểm tra dữ liệu
  function validate() {
    let isValidate = true;
    //kiểm tra người dùng nhập vào có phải là số không || là số < 0
    if (
      Number.parseInt(inputPageSize.value) < 0 ||
      Number.isNaN(Number.parseInt(inputPageSize.value))
    ) {
      alert("News per page không hợp lệ");
      isValidate = false;
    }
    if (inputCategory.value === "") {
      alert("Category không hợp lệ");
      isValidate = false;
    }

    return isValidate;
  }
} else {
  alert("Vui lòng đăng nhập /  đăng ký để truy vập vào ứng dụng");
  window.location.href = "../index.html";
}
