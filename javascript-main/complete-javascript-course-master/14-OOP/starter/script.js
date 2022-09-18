'use strict';
/**
 *
 * @param {*} fristName nhận tham số
 * @param {*} birthYear nhận tham số
 */
const Person = function (fristName, birthYear) {
  //tạo thuộc tính
  this.fristName = fristName;
  this.birthYear = birthYear;
};

const person = new Person('thoai', 23);
console.log(person);
//thêm thuộc tính bằng "prototype"
Person.prototype.calcAge = function () {
  console.log(2037 - this.birthYear);
};
person.calcAge();

// const arr = [1, 5, 2, 6, 8, 7];
// const arr1 = arr.map(item => item);
// console.log(arr1);
// const arr2 = arr1.filter(item => item % 2 === 0);
// console.log(arr2);

class PersonCl {
  constructor(fristName, birthYear) {
    this.fristName = fristName;
    this.birthYear = birthYear;
  }
  calcAge() {
    console.log(2037 - this.birthYear);
  }
}
const personCl = new PersonCl('Thoai', 1999);
console.log(personCl);
personCl.calcAge()