"use strict";
const jonas = {
  fristName: "Jonas",
  lastName: "Schmedtmann",
  age: 2022 - 1991,
  job: "teacher",
  friend: ["Mike", "petter", "Steven"],
};
console.log(jonas.age);
console.log(jonas["job"]);
console.log(
  `${jonas["fristName"]} has ${jonas["friend"].length} friends, and his best friend is called ${jonas["friend"][0]}`
);

const nameKey = "Name";
console.log(jonas["frist" + nameKey]);
console.log(jonas["last" + nameKey]);
console.log("---------------------------");
/*
const fristName = prompt("Enter frist name:")
const lastName = prompt("Enter last name:")
const age = prompt("Enter age:")
const job = prompt("Enter job:")
const user ={
    fristName:fristName,
    lastName:lastName,
    age:age,
    job:job
}

console.log(`${user.fristName} ${user.lastName} ${user.age} ${user.job}`);
// search
// const search = prompt("Enter Search fristname, lastName, age, job:")
// console.log(user[search]);
// user.location =prompt("add : ")
user['location']=prompt("add : ")
console.log(user);
*/
console.log("=====================");
const jonass = {
  fristName: "Jonas",
  lastName: "Schmedtmann",
  birthYeah: 1991,
  hasDriverLicense: false,
  job: "teacher",
  friend: ["Mike", "petter", "Steven"],
  calcAge: function () {
    this.age = 2037 - this.birthYeah;
    return this.age
  },
  getSummary:function () {
    return `${this.fristName} is a ${this.calcAge()}-year old ${this.job}, and he has ${this.hasDriverLicense?'yes driverlicense':'no driverlicense'}`
  }
};
console.log(jonass.calcAge());
console.log(jonass.getSummary());
console.log("==========For===========");
for (let index = 0; index < 10; index++) {
  console.log(index);
  
}
console.log("===========Lặp trong array, break và continue==========");
const jonasArray = [
   "Jonas",
   "Schmedtmann",
   1991,
   false,
   "teacher",
   ["Mike", "petter", "Steven"],
  
];
for (let index = 0; index < jonasArray.length; index++) {
  console.log(jonasArray[index]);
  
}
console.log("=====================");

const years =[1992,1995,1998,2000,2002]
const agee=[]
for (let index = 0; index < years.length; index++) {
  console.log(index,years[index]);
  agee.push(2022-years[index])
}
console.log(agee);
console.log("===========break và continue==================");
const jonasArray1 = [
  "Jonas",
  "Schmedtmann",
  1991,
  false,
  "teacher",
  ["Mike", "petter", "Steven"],
 
];
console.log("=========String============");
for (let index = 0; index < jonasArray1.length; index++) {
 
  if (typeof jonasArray1[index]!=="string") {
    continue
  } 
  console.log(jonasArray1[index],typeof jonasArray1[index]);
  
}
console.log("=========Number============");
for (let index = 0; index < jonasArray1.length; index++) {
 
  if (typeof jonasArray1[index]==="number") {
    break
  } 
  console.log(jonasArray1[index],typeof jonasArray1[index]);
  
}
console.log("=========Vòng lặp ngược và vòng lặp trong vòng lặp============");
for (let index = jonasArray1.length-1;index>=0; index--) {
  console.log(jonasArray1[index]);
  
}
console.log("=========vòng lặp trong vòng lặp============");
for (let exercise = 1; exercise < 4; exercise++) {
  console.log(`=========Starting exercise ${exercise} ============`);
  for (let rep = 1; rep < 6; rep++) {
    console.log(`========= rep ${rep} ============`);
    for (let bai = 1; bai < 3; bai++) {
      console.log(`========= bai ${bai} ============`);
    
    }
  }
}
console.log("=========Vòng lặp while============");
let a=1
while (a<=10) {
  console.log(a);
  a++
}

console.log(b);