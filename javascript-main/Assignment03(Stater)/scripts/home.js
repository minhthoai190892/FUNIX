'use strict'
const loginModal= document.getElementById('login-modal');
const mainContent= document.getElementById('main-content');
const welcomeMessage= document.getElementById('welcome-message');
const btnLogout= document.getElementById('btn-logout');

/**
 * 
 * @param {*} displayHome hiển thị thông tin người dùng đã đăng nhập hay chưa 
 */
function displayHome() {
    //kiêm tra người dùng đăng nhập thì ẩn 'login-modal' và hiện 'main-content'
    if (currentUser) {
        loginModal.style.display="none"
        mainContent.style.display="block"
        //Hiển thị tên người dùng
        welcomeMessage.textContent =`Welcome ${currentUser.firstName}`

    }else{
        //không có ai đăng nhập
        loginModal.style.display="block"
        mainContent.style.display="none"
    }
}
displayHome()
// TODO: Bắt sự kiện "Logout"
btnLogout.addEventListener('click', function () {
  if (confirm("Bạn có muốn thoát không?")) {
    //gán giá trị "currentUser" về "null" để hiển thị không có người đăng nhập
    currentUser =null
    // cập nhật dữ liệu xuống "localStorage"
    saveToStorage("currentUser",currentUser)
    displayHome()
  }
});