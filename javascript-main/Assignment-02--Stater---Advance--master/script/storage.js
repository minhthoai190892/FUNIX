"use strict";
// TODO: 1. Bổ sung Animation cho Sidebar
const navEl = document.getElementById("sidebar");
// TODO: bắt sự kiện click
navEl.addEventListener("click", function () {
  this.classList.toggle("active");
});

//dữ liệu test
const data1 = {
  id: "P001",
  petName: "Tom",
  age: 3,
  type: "Cat",
  weight: 5,
  length: 50,
  color: "#dd0e0e",
  breed: "Tabby",
  vaccinated: true,
  dewormed: true,
  sterilized: true,

  date: new Date(19-7-2022),
};
const data2 = {
  id: "P002",
  petName: "Tyke",
  age: 5,
  type: "Dog",
  weight: 3,
  length: 40,
  color: "#dd0e0e",
  breed: "Mixed Breed",
  vaccinated: false,
  dewormed: false,
  sterilized: false,


  date: new Date(),
};

const breed1 = {
  breed: "Mixed Breed",
  type: "Dog",
};
const breed2 = {
  breed: "Tabby",
  type: "Cat",
};
const breed3 = {
  breed: "Pull",
  type: "Dog",
};
const breed4 = {
  breed: "Meo muop",
  type: "Cat",
};
// TODO: Hàm lưu dữ liệu
function saveToStorage(key,value) {
    localStorage.setItem(key,JSON.stringify(value))
}
// TODO: Hàm lấy dữ liệu
function getFormStorage(key) {
    return JSON.parse(localStorage.getItem(key))
}
// nếu chưa có key petArr thì sẽ tiến hành lưu petArr
if (!getFormStorage('petArr')) {
    // lưu petArr
    saveToStorage('petArr',[data1,data2])
}
const petArr = getFormStorage('petArr')
// console.log(petArr);
if (!getFormStorage('breedArr')) {
    saveToStorage('breedArr',[breed1,breed2,breed3,breed4])
}
const breedArr = getFormStorage('breedArr')

// TODO: Hàm hiển thị thời gian
function displayTime(date) {
  if (typeof date ==="string") {
    return date
  }else if (typeof date ==="object") {
    return JSON.parse(JSON.stringify(date))
  }
}

