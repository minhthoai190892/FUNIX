'use strict'

//dữ liệu test
// const data1 = {
//   id: "P001",
//   petName: "Tom",
//   age: 3,
//   type: "Cat",
//   weight: 5,
//   length: 50,
//   color: "#dd0e0e",
//   breed: "Tabby",
//   vaccinated: true,
//   dewormed: true,
//   sterilized: true,

//   date: new Date(19-7-2022),
// };
// TODO: Hàm lưu dữ liệu
function saveToStorage(key,value) {
    localStorage.setItem(key,JSON.stringify(value))
}
// TODO: Hàm lấy dữ liệu
function getFormStorage(key) {
    return JSON.parse(localStorage.getItem(key))
}
// TODO: Lấy dữ liệu userArr từ LocalStorage
// saveToStorage("userArr",data1)
        //    kiểm tra xem localStorage có mảng "userArr" không, nếu có thì in ra mảng "userArr" không thì in mảng rỗng
const users = getFormStorage("userArr")?getFormStorage("userArr"):[]
console.log(users);
// TODO: chuyển đổi về dạng class instance
const userArr =users.map(user => parseUser(user))
