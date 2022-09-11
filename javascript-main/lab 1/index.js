let country = "Viet Name";
let continent = "Dong Nam A";
let population = 10;
let isIsland = false;
let language = "Vietnamese";
let description = `< ${country}> and its < ${population}> million people speak < ${language}>`;
let stringg = `isIsland: ${isIsland}
population: ${population}
country: ${country}
language: ${language}
// population: ${population / 2}
`;

population++;

console.log("=================");

console.log(stringg);
console.log(population);
// console.log(population>300)
console.log(description);
let populationn = 33;
let result = populationn - population;
console.log("////////////asd////////////");

if (population > populationn) {
  console.log(`${country}'s population is above average`);
} else {
  console.log(
    `<${country}>'s population is < ${result} > million below average`
  );
}
console.log("=================");

// console.log("country: " + country);
// console.log("continent: " + continent);
// console.log("population: " + population);

// let a = 2 ** 5; //lũy thừa
// if (50 !== 50) {
//   console.log("dung");
// } else {
//   console.log("sai");
// }
// console.log(5 !== 5);
// console.log(a);
// const dob = 1992;
// console.log(dob);

// let user = {
//   firstName: "Nguyen",
//   lastName: "Thoai",
//   age:2
// }

// console.log(isIsland)
if (4>10) {
  console.log('sai')
} else {
  console.log('dung')
  
}
console.log("=============================");
const isBelowThreshold = (currentValue) => currentValue < 40;

const array1 = [1, 30, 39, 29, 10, 13];

console.log(!array1.every(isBelowThreshold));
// expected output: true
console.log(array1);