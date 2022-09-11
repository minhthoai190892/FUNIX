"use strict";
function longger() {
  console.log(`my nam is Jonas`);
}
/**
 *
 * @param {*} apples là 2 tham số của hàm có thể là number, string, array, object
 * @param {*} oranges là 2 tham số của hàm có thể là number, string, array, object
 * @param {*} return trả về kết quả của hàm
 */
function fruitProcessor(apples, oranges) {
  console.log(apples, oranges);
  const juice = `Juice with ${apples} apples and ${oranges} oranges`;
  return juice;
}
// TODO: khi hàm có return phải lưu giá trị của hàm vào một biến để hiển thị trên "console.log()"
//gọi lại hàm
fruitProcessor(2, 3);
// khi báo biến chứa giá trị của hàm
const fruitJuice = fruitProcessor(5, 3); // "5,3" là đối số nhập vào hàm thông qua "tham số" "apples, oranges"
console.log(fruitJuice);
//ghi trực tiếp vào hàm
console.log(fruitProcessor(2, 3));

//khai bao ham
function calcAge1(birthYear) {
  //tao bien
  const age = 2037 - birthYear;
  //tra ve gia tri cua ham
  return `age is ${age}`;
}
console.log(calcAge1(2000));
//bieu thuc ham
const calcAge2 = function (birthYear) {
  return 2037 - birthYear;
};
const age2 = calcAge2(2000);
console.log(age2);

const age3 = (birthYear) => {
  2037 - birthYear;
  console.log("asdqweqwe");
};
age3(2000);

const yearUntilRetirement = (birthYear, year) => {

  const sum = birthYear + year;
  return `sum is ${birthYear} and year ${year}`;
};
console.log(yearUntilRetirement(21, 23));
