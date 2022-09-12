"use strict";
// TODO:Lab 5.1. Giới thiệu về Object (5 phút)
console.log("Lab 5.1. Giới thiệu về Object (5 phút)");
/**
 *
 * 1. Tạo một object là 'myCountry' cho quốc gia bạn chọn,
 * chứa các thuộc tính 'country', 'capital', 'language', 'population'
 * and 'neighbours' (array như chúng ta đã thực hành trong bài trước).
 */
const myCountry = {
  country: "Viet Name",
  capital: "Ha Noi",
  language: "Vietnames",
  population: 100,
  neighbours: ["Lao", "Trung Quoc", "Thai Lan"],
};
console.log(myCountry);
// TODO:Lab 5.2. Dấu chấm với dấu ngoặc (10 phút)
console.log("Lab 5.2. Dấu chấm với dấu ngoặc (10 phút)");
console.log(
  `${myCountry.country} has ${myCountry.population} million finnish-speaking people, ${myCountry.neighbours.length} neighbouring countries and a capital called ${myCountry.capital}.`
);

myCountry.population = 102;
console.log(
  `${myCountry.country} has ${myCountry.population} million finnish-speaking people, ${myCountry.neighbours.length} neighbouring countries and a capital called ${myCountry.capital}.`
);

myCountry["population"] = 90;
console.log(
  `${myCountry.country} has ${myCountry.population} million finnish-speaking people, ${myCountry.neighbours.length} neighbouring countries and a capital called ${myCountry.capital}.`
);
// const test = prompt("search country, capital: ")
// console.log(myCountry[test]);
// TODO:Lab 5.3. Phương thức Object  (15 phút)
console.log("Lab 5.3. Phương thức Object  (15 phút)");
/**
 *Thêm một phương thức có tên là 'describe' vào object 'myCountry'.
 Phương thức này sẽ in một string ra console với nội dung như sau: "Finland has 6 million finnish-speaking people, 
  neighbouring countries and a capital called Helsinki" nhưng lần này sử dụng từ khóa 'this'.
  
Gọi phương thức 'describe' 
Thêm phương thức 'checkIsland' vào object 'myCountry'. 
Phương thức này sẽ thiết lập một thuộc tính mới trên object là 'isIsland'.
'isIsland' sẽ là giá trị true nếu không có nước láng giềng, ngược lại là false.
Sử dụng toán tử điều kiện để đặt giá trị cho thuộc tính.
 * 
 * 
 */
myCountry.describe = function () {
  console.log(
    `${this.country} has ${this.population} million finnish-speaking people, ${this.neighbours.length} neighbouring countries and a capital called ${this.capital}`
  );
};
console.log(myCountry);
myCountry.describe();
myCountry.checkIsland = function () {
  //tạo một thuộc tính trong object
  return (this.isIsland = this.neighbours.length === 0 ? true : false);
};
console.log(myCountry.checkIsland());
console.log(myCountry);
//  TODO:Lab 5.4. Vòng lặp For (5 phút)
console.log("Lab 5.4. Vòng lặp For (5 phút)");
/**
 *
 * Ở đất nước bạn có các cuộc bầu cử. Ở một thị trấn nhỏ, chỉ có 50 cử tri.
 *  Sử dụng vòng lặp for để mô phỏng 50 cử tri này, bằng cách in string sau ra
 *  console (cho các số từ 1 đến 50): 'Voter number 1 is currently voting'.
 */
for (let index = 0; index < 50; index++) {
  console.log(`Voter number ${index + 1} is currently voting`);
}
// TODO:Lab 5.5. Lặp trong array, break và continue (15 phút)
console.log("Lab 5.5. Lặp trong array, break và continue (15 phút)");
/**
 * Hãy lấy lại array 'populations' từ bài lab trước.
Sử dụng vòng lặp for để tạo array 'percentages2' chứa phần trăm dân số thế giới cho 4 giá trị population. 
Sử dụng hàm 'percentageOfWorld1' mà bạn đã tạo trước đó.

Xác nhận rằng 'percentages2' chứa chính xác các giá trị trong array 'percentages' mà chúng ta đã tạo theo cách thủ công ở lab trước,
 để xem giải pháp này tốt hơn như thế nào.


 * 
 */
const populations = [1441, 322, 100, 10];
const percentageOfWorld1 = (population) => (population / 7900) * 100;
const test = percentageOfWorld1(populations[0]);
console.log(test.toFixed(2));
const percentages2 = [];
for (let index = 0; index < populations.length; index++) {
  percentages2.push(percentageOfWorld1(populations[index]));
}
console.log(percentages2);

//TODO:Lab 5.6. Vòng lặp ngược và Vòng lặp trong vòng lặp (15 phút)
console.log("Lab 5.6. Vòng lặp ngược và Vòng lặp trong vòng lặp (15 phút)");
/**
 * Lưu trữ array của những array này vào biến 'listOfNeighbours' [['Canada', 'Mexico'], ['Spain'], ['Norway', 'Sweden', 'Russia']];
Hiển thị các quốc gia láng giềng vào màn hình console, không phải toàn bộ array. Ví dụ 'Neighbour: Canada' cho từng quốc gia.
Bạn sẽ cần một vòng lặp bên trong vòng lặp cho điều này. Điều này thực sự hơi phức tạp, 
vì vậy đừng lo lắng nếu nó quá khó đối với bạn! Bạn sẽ giải quyết được vấn đề này. 
 * 
 */
const listOfNeighbours = [
  ["Canada", "Mexico"],
  ["Spain"],
  ["Norway", "Sweden", "Russia"],
];
for (let index = 0; index < listOfNeighbours.length; index++) {
  let size = listOfNeighbours[index].length;
  // console.log(size);
  console.log(`cac nuoc lang gieng cua ${index + 1}`);
  for (let index1 = 0; index1 < size; index1++) {
    console.log(`Neighbour: ${listOfNeighbours[index][index1]}`);
  }
}
// for (let index = listOfNeighbours.length - 1; index >= 0; index--) {
//   console.log(listOfNeighbours[index]);
// }

// TODO:Lab 5.7. Vòng lặp While (10 phút)
console.log("Lab 5.7. Vòng lặp While (10 phút)");
/**
 * Lấy lại từ lab Lặp trong array, break và continue, nhưng lần này hãy sử dựng vòng lặp while (gọi array 'percentages3').
Bạn thích giải pháp nào hơn cho nhiệm vụ này: vòng lặp for hay vòng lặp while?
 */
const percentages3 = [];
let index = 0;
while (index < populations.length) {
  percentages3.push(percentageOfWorld1(populations[index]));
  index++;
}
console.log(percentages3);
// TODO:Lab 5.8: Bài toán tổng hợp #4
console.log("Lab 5.8: Bài toán tổng hợp #4");
//Lab 5.8.1. So sánh chỉ số IBM (phần 3)\
/**
 * Hãy quay lại ví dụ so sánh chỉ số BMI của Mark và John! Lần này, hãy dùng object để triển khai các phép tính! Nhớ rằng:
 * BMI = mass/[(height)^2)] = mass/(height*height) (mass tính bằng kg và height tính bằng mét)
 *
 */
/**
 * 1. Nhiệm vụ của bạn:

Với mỗi người (Mark Miller và John Smith), hãy tạo một object có các thuộc tính như full name, mass, and height 
Tạo phương thức 'calcBMI' ở mỗi object để tính BMI (phương thức như nhau ở cả hai object).
 Lưu giá trị BMI vào một thuộc tính và trả về từ phương thức.

In ra console người có BMI cao hơn cùng với tên đầy đủ và BMI tương ứng. Ví dụ: "John's BMI (28.3) is higher than Mark's (23.9)!"
2. Dữ liệu kiểm tra:

Marks nặng 78 kg và cao 1m69. John nặng 92kg và cao 1m95.
 * 
 */

const markMiller = {
  fullName: "Mark Miller",
  mass: 78,
  height: 1.69,
};
markMiller.calcBMI = function () {
  return this.mass / (this.height * this.height);
};
console.log(markMiller.calcBMI());
const johnSmith = {
  fullName: "John Smith",
  mass: 92,
  height: 1.95,
};
johnSmith.calcBMI = function () {
  return this.mass / (this.height * this.height);
};
console.log(johnSmith.calcBMI());

if (johnSmith.calcBMI() > markMiller.calcBMI()) {
  console.log(
    `John's BMI (${johnSmith
      .calcBMI()
      .toFixed(2)}) is higher than Mark's (${markMiller.calcBMI().toFixed(2)})!`
  );
} else {
  console.log(
    `Mark's (${markMiller
      .calcBMI()
      .toFixed(2)})  is higher than John's BMI (${johnSmith
      .calcBMI()
      .toFixed(2)})!`
  );
}

// TODO:Lab 5.8.2. Cải thiện Tip calculator
console.log("Lab 5.8.2. Cải thiện Tip calculator");
/**
 * 
 * Hãy cải thiện thêm tip calculator của Steven, lần này sử dụng các vòng lặp!

1. Nhiệm vụ của bạn:

Tạo array 'bills' chứa tất cả 10 giá trị hóa đơn kiểm tra.
Tạo các array rỗng cho 'tips' và 'totals'.
Sử dụng hàm 'calcTip' mà chúng ta đã viết trước đó (không cần lặp lại) để tính các giá trị tips
 và totals (hóa đơn + tiền boa) cho mỗi giá trị bill trong bills array. Sử dụng vòng lặp for để thực hiện 10 phép tính!.

2. Dữ liệu kiểm tra:

22, 295, 176, 440, 37, 105, 10, 1100, 86 và 52
Gợi ý: Gọi ‘calcTip‘ trong vòng lặp và dùng phương thức push để thêm giá trị cho các array tips và totals.

Bonus: Viết hàm 'calcAverage' nhận array 'arr' làm đối số. Hàm này tính trung bình tất cả các số đã cho trong array. 
Đây là một thử thách khó (chúng ta chưa từng thực hiện điều này trước đây)! Dưới đây là hướng dẫn thực hiện:

Trước tiên, bạn cần cộng tất cả các giá trị trong array. Để thực hiện phép cộng, tạo biến 'sum' bắt đầu từ 0. 
Sau đó lặp qua array, sử dụng vòng lặp for. Ở mỗi lần lặp, cộng giá trị hiện tại vào biến 'sum'. 
Như vậy, ở cuối vòng lặp, bạn sẽ cộng được tất cả các giá trị với nhau.

Để tính trung bình, chia tổng mà bạn vừa tính trước đó cho độ dài của array (vì đó là số phần tử).
Gọi hàm với array 'totals'.
 */

const bills = [22, 295, 176, 440, 37, 105, 10, 1100, 86, 52];
const tips = [];
const totals = [];
const calcTip = (bill) => (bill > 50 && bill < 300 ? bill * 0.15 : bill * 0.2);
console.log(calcTip(275));
for (let index = 0; index < bills.length; index++) {
  tips.push(calcTip(bills[index])); //thêm giá trị vào mảnrg tips
  //tinh totals
  totals.push(calcTip(bills[index]) + bills[index]);
}
console.log(tips);
console.log(totals);
const calcAverage = function (arr) {
  let sum = 0;
  for (let index = 0; index < arr.length; index++) {
    sum += arr[index];
  }
  return sum / arr.length;
};

const test2 = calcAverage(totals);
console.log(test2);
