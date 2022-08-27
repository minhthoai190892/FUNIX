console.log("--------------Lab 5.2. ---------------");

const myCountry = {
  country: "Viet Nam",
  capital: "Ha Noi",
  language: "Tieng Viet",
  population: 100,
  neighbours: ["Trung Quoc", "Thai Lan", "Lao", "Campuchia"],
  describe: function () {
    console.log(
      `${this.country} has ${this.population} million finnish-speaking people, ${this.neighbours.length} neighbouring countries and a capital called ${this.capital}.`
    );
  },
  checkIsland: function () {
    this.isIsland = this.neighbours.length === 0 ? true : false;
    console.log(this.isIsland);
  },
};
console.log(myCountry.neighbours);
console.log(
  `${myCountry.country} has ${myCountry.population} million finnish-speaking people, ${myCountry.neighbours.length} neighbouring countries and a capital called ${myCountry.capital}.`
);
myCountry.population = 120;
console.log(myCountry.population);

myCountry["population"] = 20;
console.log(myCountry["population"]);

console.log(
  "--------------Lab 5.3. Phương thức Object  (15 phút)----------------"
);
myCountry.describe();
myCountry.checkIsland();
console.log(myCountry);

console.log(
  "-----------------Lab 5.4. Vòng lặp For (5 phút)---------------------"
);
for (let index = 1; index <= 50; index++) {
  console.log(`Voter number ${index} is currently voting`);
}

console.log(
  "-------------------Lab 5.5. Lặp trong array, break và continue (15 phút)------------------"
);

const populations = [1441, 70, 200, 300];
const percentages2 = [];
const percentageOfWorld1 = function (population) {
  const resulutpopulation = (population / 7900) * 100;
  return resulutpopulation;
};

for (let index = 0; index < populations.length; index++) {
  console.log(percentageOfWorld1(populations[index]));
  percentages2.push(percentageOfWorld1(populations[index]));
}
console.log(percentages2);
console.log(
  "----------Vòng lặp ngược và Vòng lặp trong vòng lặp (15 phút)---------"
);
const listOfNeighbours = [
  ["Canada", "Mexico"],
  ["Spain"],
  ["Norway", "Sweden", "Russia"],
];
for (let index = 0; index < listOfNeighbours.length; index++) {
  console.log(`${listOfNeighbours[index]}`);
  for (let index1 = 0; index1 < listOfNeighbours[index].length; index1++) {
    console.log(listOfNeighbours[index][index1]);
  }
}

console.log("----------Lab 5.7. Vòng lặp While (10 phút)---------");
const percentages3 = [];
let a = 0;
while (a < populations.length) {
  console.log(percentageOfWorld1(populations[a]));

  percentages3.push(percentageOfWorld1(populations[a]));
  a++;
}
console.log(percentages3);
console.log("----------Lab 5.8.1. So sánh chỉ số IBM (phần 3)---------");

const markMiller = {
  fullName: "Mark Miller",
  mass: 78,
  height: 1.69,
  BMI: function () {
    this.bmi = this.mass / (this.height * this.height);
    return this.bmi;
  },
};
const johnSmith = {
  fullName: "John Smith",
  mass: 92,
  height: 1.95,

  BMI: function () {
    this.bmi = this.mass / (this.height * this.height);
    return this.bmi;
  },
};
console.log(markMiller.BMI(), johnSmith.BMI());

if (markMiller.BMI() > johnSmith.BMI()) {
  console.log(
    `${markMiller.fullName}'s BMI (${markMiller.BMI()}) is higher than ${
      johnSmith.fullName
    }'s (${johnSmith.BMI()})!`
  );
} else {
  console.log(
    `${johnSmith.fullName}'s BMI (${johnSmith.BMI()}) is higher than ${
      markMiller.fullName
    }'s ((${markMiller.BMI()})!`
  );
}

console.log("--------Lab 5.8.2. Cải thiện Tip calculator-------");
const bills = [22, 295, 176, 440, 37, 105, 10, 1100, 86, 52];
const tips = [];
const totals = [];
function calcTip(bill) {
  //const calcTip =bill=> bill>=50 &&bill<=300?bill*0.15:bill*0.2
  resultTip = bill >= 50 && bill <= 300 ? bill * 0.15 : bill * 0.2;
  return resultTip;
}
for (let index = 0; index < bills.length; index++) {
  tips.push(calcTip(bills[index]));
  totals.push(bills[index] + tips[index]);
}
console.log(tips);
console.log(totals);

console.log("--------------Bonus: ------------------");
let sum = 0;
for (let index = 0; index < totals.length; index++) {
  console.log(totals[index]);
  sum += totals[index];
}
console.log(sum);
console.log(sum / totals.length);
function calcAverage() {
  const resultAverage = sum / totals.length ;
  return resultAverage;
}
console.log(calcAverage());
