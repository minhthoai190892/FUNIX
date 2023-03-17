"use strict";

//dữ liệu test

// const data1 = {
//   firstName: "Nguyen",
//   lastName: "Thoai",
//   userName: "thoainguyen",
//   password: "thoainguyen",
// };
// const data2 = {
//   firstName: "Nguyen2",
//   lastName: "Thoai2",
//   userName: "thoainguyen2",
//   password: "thoainguyen2",
// };
// TODO: Hàm lưu dữ liệu
function saveToStorage(key, value) {
  localStorage.setItem(key, JSON.stringify(value));
}
// TODO: Hàm lấy dữ liệu
function getFormStorage(key) {
  return JSON.parse(localStorage.getItem(key));
}

// TODO: Lấy dữ liệu userArr từ LocalStorage
const users = getFormStorage("userArr") ? getFormStorage("userArr") : [];
//    kiểm tra xem localStorage có mảng "userArr" không, nếu có thì in ra mảng "userArr" không thì in mảng rỗng

// saveToStorage("userArr", [data1, data2]); //test

console.log(users);

// TODO: Lấy dữ liệu user đăng nhập
let currentUser = getFormStorage("currentUser")
  ? parseUser(getFormStorage("currentUser"))
  : null;


// TODO: Hầm chuyển đổi JS Object về dạng class instance
function parseUser(userData) {
  const user = new User(
    userData.firstName,
    userData.lastName,
    userData.userName,
    userData.password,

    userData.pageSize,
    userData.category
  );

  return user;
}

// TODO: chuyển đổi về dạng class instance
//==>trả về một mảng chứa các instance của class user
const userArr = users.map((user) => parseUser(user));
console.log(userArr);

// TODO: Lấy dữ liệu "todoArr" từ LocalStorage
// const todo1 = {
//   task:"qưeqweqwe",
//   owner:"qưeqweqwe",
//   isDone:"qưeqweqwe",
// };
// saveToStorage("todoArr",todo1)
const todos = getFormStorage("todoArr")?getFormStorage("todoArr"):[]
console.log(todos);
// TODO: Hầm chuyển đổi JS Object về dạng "class instance"
function parseTask(taskData) {
  const todo = new Task(
    taskData.task,
    taskData.owner,
    taskData.isDone,

  );

  return todo;
}

// TODO: chuyển đổi "Object" về dạng" class instance"
//==>trả về một mảng chứa các instance của class Task
const todoArr = todos.map((todo) => parseTask(todo)); //==> trả về mảng todo
console.log(todoArr);