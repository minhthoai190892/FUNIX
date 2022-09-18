"use strict";
const julia = [3, 5, 2, 12, 7];
const kate = [4, 1, 15, 8, 3];

const julia2 = [9, 16, 6, 8, 3];
const kate2 = [10, 5, 6, 1, 4];

function checkDogs(dogJulia, dogKate) {
  //sao chép 1 mảng mới và lại bỏ 2 phần tử đầu và cuối
  const newDogJulia = dogJulia.slice(1, julia.length - 1);
  // console.log(newDogJulia);
  //tạo mảng mới với mảng julia và kate
  const dogData = newDogJulia.concat(dogKate);
  // console.log(dogData);
  dogData.forEach((element, index) => {
    element >= 3
      ? console.log(
          `Dog number ${index + 1} is an adult, and is ${element} years old`
        )
      : console.log(`Dog number ${index + 1} is still a puppy`);
  });
}
checkDogs(julia, kate);
console.log("Truong hop 2");
checkDogs(julia2, kate2);

console.log("============ Lab 12.2: Chuyển đổi tuổi thú cưng ==========");
const dulieu1 = [5, 2, 4, 1, 15, 8, 3];
const dulieu2 = [16, 6, 10, 5, 6, 1, 4];
function calcAverageHumanAge(age) {
  //dùng map để tạo mảng tính tuổi chó
  const humanAge = age.map((dogAge) =>
    dogAge <= 2 ? 2 * dogAge : 16 + dogAge * 4
  );
  console.log(humanAge, "asdas");
  //dùng filter để lọc tuổi chó >18
  const humanAgeNew = humanAge.filter((humanAge) => humanAge >= 18);
  console.log(humanAgeNew, "qweqwe");

  return (
    humanAgeNew.reduce(
      (previousValue, currentValue) => previousValue + currentValue
    ) / humanAgeNew.length
  ).toFixed(2);
}

console.log(calcAverageHumanAge(dulieu1));
console.log(calcAverageHumanAge(dulieu2));
console.log("============ Lab 12.3: Sử dụng Arrow Function ==========");

function calcAverageHumanAge2(age) {
  return (
    age
      .map((age) => (age <= 2 ? 2 * age : 16 + age * 4))//tạo 1 mảng mới với map
      .filter((age) => age >= 18)//lọc những chú chó trên 18 tuổi
      .reduce((previousValue, currentValue) => previousValue + currentValue) / //tính tổng tuổi của các con chó 
    age
      .map((age) => (age <= 2 ? 2 * age : 16 + age * 4))//tạo 1 mảng mới với map
      .filter((age) => age >= 18).length //lọc những chú chó trên 18 tuổi để lấy số lượng các con chó >18 tuổi
  ).toFixed(2);
}

console.log(calcAverageHumanAge2(dulieu1));
console.log(calcAverageHumanAge2(dulieu2));
