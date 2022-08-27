"use strict";
// TODO: value va  reference
let id = "P0";
const pettest = {
  id: "P001",
  name: "lucky",
};
function editPet(petObj, newId) {
  (newId += "Ok"), (petObj.id = newId);
}

editPet(pettest, id);
console.log(id);
console.log(pettest);
console.log(
  "=========================First-Class FUnction and Higher-Order Function============================================"
);
const pet = {
  id: "P001",
  name: "Tom",
  birthYear: 2013,
  // TODO: . lưu trữ hàm vào 1 biến hoặc thuộc tính
  calcAge: function () {
    const year = new Date();
    return year.getFullYear - this.birthYear;
  },
};
// TODO: . lưu trữ hàm vào 1 biến hoặc thuộc tính

const f = pet.calcAge;
console.log(f);
console.log(pet.calcAge);
// TODO:  truyền các function làm đối số
const getSum = (num1, num2) => num1 + num2;
function myFun(f) {
  const a = 10;
  const b = 10;
  console.log("sum " + f(a, b));
}
myFun(getSum);
// TODO: function trả về một function khác
function count() {
  let count = 0;
  return function () {
    console.log(count++);
  };
}
const func = count();
func();
func();
func();
func();
func();
// TODO: Các hàm nhận hàm CallBack

console.log(
  "============================Các hàm nhận hàm CallBack========================================="
);
function a() {
  console.log("ham a");
}
function a2() {
  console.log("ham a2");
}
function b(f) {
  console.log("ham b");
  f();
}
b(a);
// TODO: hàm trả về hàm
console.log(
  "============================Hàm trả về hàm========================================="
);
function show() {
  //obj là tham số
  return function (obj) {
    console.log(`toi la ${obj.name} toi ${obj.age}`);
  };
}
const sv1 = {
  name: "Thoia",
  age: 21,
};
const showinf = show();
showinf(sv1); //sv1 là đối số
// TODO: phương thức call và apply
console.log(
  "============================phương thức call và apply========================================="
);
const sv2 = {
  name: "Nguyen Minh Thoai",
  birthYear: 1999,
  getInfo: function (gioiTinh, tenTruong) {
    console.log(
      `toi ten la ${this.name}, gioi tinh la ${gioiTinh}, nam nay toi ${
        2020 - this.birthYear
      }, toi hoc tai ${tenTruong} `
    );
  },
};
const showinfo = sv2.getInfo;
showinfo.call(sv2, "nam", "funix");

const sv3 = {
  name: "Nguyen Minh Thanh",
  birthYear: 2000,
};
const sv4 = {
  name: "Nguyen Minh minh",
  birthYear: 1988,
};
showinfo.call(sv3, "nu", "FPT");
// TODO: phương thức apply
showinfo.apply(sv4, ["nam", "Hutech"]);

const arr1 = [1, 2, 3, 4, 5, 6, 7, 8, 9];
const arr2 = [11, 21, 31, 41, 51, 61, 71, 81, 91];
const arr3 = [13, 23, 33, 43, 53, 63, 73, 83, 93];

function getSumm() {
  let sum = 0;
  for (let index = 0; index < arguments.length; index++) {
    sum += arguments[index];
  }
  console.log(`tong cac so la: ${sum}`);
}
getSumm.apply(null, arr1);
getSumm.apply(null, arr2);
getSumm.apply(null, arr3);
// TODO: phương thức bind
console.log(
  "============================ phương thức bind ========================================="
);
const sv5 = {
  name: "Nguyen Minh Ngoc",
  birthYear: 2020,
};

// const showinfo = sv2.getInfo
const funcBindd = showinfo.bind(sv2);

const h1El = document.querySelector("h1");
const btnEl = document.querySelector("button");
const user ={
  name:"asdf",age:123
}
btnEl.addEventListener("click", testEl.bind(user));

function testEl() {
  console.log("Asda");
  console.log(this);
  alert(`xin chao ${this.name} va toi ${this.age}`)
  // this.style.backgroundColor = "red";
  // this.style.color="white"
}
console.log(
  "============================End========================================="
);

// asdqweqweqweasd
// //xoa khoang trang va chu thuongw
// function oneWord(str) {
//   return str.replace(/ /g, "").toLowerCase();
// }

// const str = "Javascript is the best";
// function upperFirsWord(str) {
//   const [first, ...others] = str.split(" ");
//   return [first.toUpperCase(), ...others].join(" ");
// }

// function transformer(str, fn) {
//   console.log(`Original string: ${str}`);
//   console.log("----");
//   console.log(`Transformer: ${fn(str)}`);
//   console.log("----");
//   console.log(`Transformer: ${fn.name}`);
//   console.log("----");
// }
// transformer(str, oneWord);

// function hight5() {
//   console.log(`🥱`);
// }
// document.body.addEventListener("click", hight5);

// //   function greet(greeting) {
// //     return function (name) {
// //         console.log(`${greeting} ${name}`);
// //     }
// //   }
// // const greethey = greet("hey")
// // greethey("thoia")
// // greethey("asd")
// // greethey("asdasd")
// // greethey("qwe")
// // greet("hello")("Doan")

// const greet = (greeting) => (name) => (yeu) =>
//   console.log(`${greeting} ${name} ${yeu}`);
// greet("hello")("Doan")("yeu nhieu");

// const lufthansa = {
//   airline: "Lufthasa",
//   iataCode: "LH",
//   bookings: [],
//   book(flightNum, name) {
//     console.log(
//       `${name} booked a seat on ${this.airline} flight ${this.iataCode}${flightNum}`
//     );
//     this.bookings.push({ flight: `${this.iataCode}${flightNum}`, name });
//   },
// };
// console.log(lufthansa);
// lufthansa.book(239, "Thoai");
// lufthansa.book(639, "Doan");
// lufthansa.book(639, "Doan2");
// const eurowings = {
//   airline: "Eurowings",
//   iataCode: "EW",
//   bookings: [],
// };

// const book = lufthansa.book;
// //call
// book.call(eurowings, 23, "Sarah");
// book.call(eurowings, 24, "Sarahw");
// console.log(eurowings);

// const wings = {
//   airline: "sadfsadf",
//   iataCode: "WI",
//   bookings: [],
// };
// book.call(wings, 259, "duong");
// console.log(wings);
// //apply

// const flightData = [698, "safasdfsa"];
// book.apply(wings, flightData);
// console.log(wings);
// console.log("------");
// book.call(wings, ...flightData);

// //bind
// const eurowingsEW = book.bind(eurowings);
// const eurowingsEW23 = book.bind(eurowings, 23);

// eurowingsEW(123, "asdf");
// eurowingsEW23("thoia");
// console.log(eurowings);

// //them thong tin
// lufthansa.planes = 300;
// lufthansa.buyPlane = function () {
//   console.log(this);
//   this.planes++;
//   console.log(this.planes);
// };

// // document.querySelector(".buy").addEventListener("click", lufthansa.buyPlane);
// document
//   .querySelector(".buy")
//   .addEventListener("click", lufthansa.buyPlane.bind(lufthansa));

// ///partial application
// function addTax(rate, value) {
//   value = value + value * rate;
//   console.log(value);
// }
// addTax(10, 200);

// const addVAT = addTax.bind(null, 0.23);
// addVAT(100);
// addVAT(23);

// function addTaxRate(rate) {
//   return function (value) {
//     return value + value * rate;
//   };
// }
// const addVAT2 = addTaxRate(0.23);
// console.log(addVAT2(100));
// console.log(addVAT2(23));

// console.log("=============Closures============");
// function secureBook() {
//   let passengerCount = 0;
//   return function () {
//     passengerCount++;
//     console.log(`${passengerCount} passenger`);
//   };
// }

// const booker = secureBook();
// booker();
// booker();
// booker();
// booker();

// console.log("=============Example Closures============");
// let ff;
// const g = function () {
//   const a = 23;
//   console.log("g " + a);
//   ff = function () {
//     console.log(a * 2);
//   };
// };

// g();
// ff();

// const h = function () {
//   const ba = 233;
//   console.log("h " + ba);
//   ff = function () {
//     console.log(ba * 2);
//   };
// };

// h();
// ff();

// function boardPassenger(n, wait) {
//   const perGroup = n / 3;
//   setTimeout(function () {
//     console.log(`we are now boarding all ${n} passengers`);
//     console.log(`There are 3 group, each with ${perGroup} passengers`);
//   }, wait * 1000);
//   console.log(`Will start boarding in ${wait} seconds`);
// }

// boardPassenger(180, 3);
