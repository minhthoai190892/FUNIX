"use strict";
const data1 = {
  name: "asd",
  age: 9,
  add: "qweqwe",
};
const data2 = {
  name: "asddddddd",
  age: 90,
  add: "qweqwedddddd",
};

const arr = [];
arr.push(data1, data2);
console.log(arr);
arr.forEach(function (item) {
  console.log(item.name, item.add);
});
const arr1 = arr.map((item) => item.add);
console.log(arr1);

console.log("===============");
function Person(name, birthYear, add) {
  this.name = name;
  this.birthYear = birthYear;
  //tạo bên trong đối tượng

  this.add = add;
}

//tạo bên ngoài đối tượng
Person.prototype.truong = function (truong) {
  this.truong = truong;
};
Person.prototype.age = function () {
  console.log(`tuoi cua ${this.name} la: ${2022 - this.birthYear}`);
};
const obj = new Person("sadfasdf", 2000, "qweqweq", "Funix");

// cách 3 tạo thuộc tính hoặc phương thức trên đối tượng đã được tạo ra "obj"
obj.__proto__.test = function () {
  console.log("asdasdqweqweadsqwe");
};
obj.test();
// tạo riêng trên từng đối tượng
obj.id = 123;

console.log(obj);

console.log("============= Class ===============");
class PersonCl {
  constructor(name, birthYear) {
    (this.name = name),
      (this.birthYear = birthYear),
      //cach 1
      (this.method1 = function () {
        console.log("asdqweqwe");
      });
  }
  getAge1() {
    return 2022 - this.birthYear;
  }
}

const objCla1 = new PersonCl("asdasd", 1999);
const objCla2 = new PersonCl("asssssssdasd", 19299);
//cach 2
PersonCl.prototype.getAge = function () {
  console.log("sdfasf");
};
objCla1.getAge1();
console.log(objCla1);
console.log(objCla2);
console.log("============= Kế Thừa Function ===============");

const Student = function (name, birthYear, id) {
  Person.call(this, name, birthYear);
  this.id = id;
};
Student.prototype = Object.create(Person.prototype);
Student.prototype.age = function () {
  console.log("-k");
};

const student1 = new Student("sadfaaa", 2000, 123);

obj.age();
student1.age();
console.log(obj);
student1.age;
console.log(student1);
console.log("============= Kế Thừa Class ===============");

console.log(objCla1);

//kế thừa class "PersonCL"
class StudentCl extends PersonCl {
  constructor(name, birthYear, id) {
    super(name, birthYear); // giống với phương thức "call"
    this.id = id;
  }
  getAge1() {
    console.log(`tuoi cua ${this.name} la: ${2022 - this.birthYear}`);
  }
}
const studentCL1 = new StudentCl("asdaaaaa",1999,232);
console.log(studentCL1);
studentCL1.getAge1()