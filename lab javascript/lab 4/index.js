"use strict";
// TODO:Lab 4.1. Hàm (10 phút)
console.log("Lab 4.1. Hàm (10 phút)");
/**
 * 
 * Viết hàm 'describeCountry' nhận ba tham số: 'country', 'population' và 'capitalCity'. 
 * Dựa vào input này, hàm trả về string với định dạng như sau: 'Finland has 6 million people and its capital city is Helsinki'.
Gọi hàm này 3 lần với dữ liệu đầu vào cho 3 nước khác nhau. Lưu các giá trị trả về ở 3 biến khác nhau, và in chúng ra console.
 */
function describeCountry(country, population, capitalCity) {
  return `${country} has ${population} million people and its capital city is ${capitalCity}`;
}

describeCountry("Viet Name", 100, "Ha Noi");
describeCountry("Trung Quoc", 300, "Thuong Hai");
describeCountry("Thai Lan", 10, "Bankkok");

// TODO:Lab 4.2. Khai báo hàm với biểu thức hàm (20 phút)
console.log("Lab 4.2. Khai báo hàm với biểu thức hàm (20 phút)");
/**
 * 
 * Dân số thế giới là 7.9 tỷ người. Tạo khai báo hàm 'percentageOfWorld1' nhận một giá trị 
 * 'population' và trả về phần trăm dân số thế giới theo dân số đã cho. 
 * Ví dụ: Trung Quốc có 1.441 tỷ người, chiếm 18.2% dân số thế giới.
 * 
 * 
Để tính phần trăm, chia giá trị 'population' đã biết cho 7900 rồi nhân với 100.
Gọi 'percentageOfWorld1' cho 3 dân số của các quốc gia bất kỳ, lưu kết quả vào các biến và in chúng ra console.
Tạo biểu thức hàm thực hiện điều tương tự, gọi là 'percentageOfWorld2' và cũng gọi nó với 3 dân số theo quốc gia 
(có thể có cùng số dân).
 */
const percentageOfWorld1 = function (population) {
  //   const population1 = (population / 7900) * 100;
  //   return `Trung Quốc có ${population} tỷ người, chiếm ${population1.toFixed(
  //     2
  //   )}% dân số thế giới.`;

  return ((population / 7900) * 100).toFixed(2);
};

const country1 = percentageOfWorld1(100);
const country2 = percentageOfWorld1(300);
const country3 = percentageOfWorld1(10);

const country4 = percentageOfWorld1(1441);
console.log(
  `Trung Quốc có 1.441 tỷ người, chiếm ${country4}% dân số thế giới.`
);
console.log(country2);
console.log(country3);
console.log(country4);

// TODO:Lab 4.3. Hàm mũi tên (5 phút)
console.log("Lab 4.3. Hàm mũi tên (5 phút)");
const percentageOfWorld3 = (population) =>
  ((population / 7900) * 100).toFixed(2);
const percentageOfWorld3_1 = percentageOfWorld3(1441);
const percentageOfWorld3_2 = percentageOfWorld3(141);
const percentageOfWorld3_3 = percentageOfWorld3(201);
console.log(percentageOfWorld3_1);
console.log(percentageOfWorld3_2);
console.log(percentageOfWorld3_3);
// TODO:Lab 4.4. Hàm gọi hàm (15 phút)
console.log("Lab 4.4. Hàm gọi hàm (15 phút)");
/**
 * 
 * Tạo một hàm là 'describePopulation'. Sử dụng kiểu hàm mà bạn muốn nhất. Hàm này nhận hai đối số là
 *  'country' và 'population', và trả về string như sau: 'China has 1441 million people, which is about 18.2% of the world'.
 * 
Để tính phần trăm 'describePopulation', hãy gọi 'percentageOfWorld1' mà bạn đã tạo trước đó.

Gọi 'describePopulation' với dữ liệu cho 3 nước bất kỳ.
 * 
 */
const describePopulation = function (country, population) {
  return `${country} has ${population} million people, which is about ${percentageOfWorld1(
    population
  )}% of the world`;
};
const describePopulation1 = describePopulation("Trung Quoc", 1441);
const describePopulation2 = describePopulation("Viet Name", 100);
const describePopulation3 = describePopulation("Thai Lan", 10);
console.log(describePopulation1);
console.log(describePopulation2);
console.log(describePopulation3);

// TODO:Lab 4.5. Giới thiệu về Array (15 phút)
console.log("Lab 4.5. Giới thiệu về Array (15 phút)");
/**
 * 
 * Tạo một array chứa 4 giá trị dân số của 4 quốc gia bất kỳ. Bạn có thể sử dụng các giá trị đã dùng trước đó.
 *  Lưu array này vào một biến là 'populations'.
 * 
In ra console xem liệu array có 4 phần tử hay không (true hoặc false).

Tạo một array là 'percentages' có chứa phần trăm dân số thế giới của 4 giá trị dân số đó. 
Sử dụng hàm 'percentageOfWorld1' mà bạn đã tạo trước đó để tính toán 4 giá trị phần trăm.
 * 
 */
const populations = [1441, 322, 100, 10];
console.log(populations.length === 4);
const percentages = [
  percentageOfWorld1(populations[0]),
  percentageOfWorld1(populations[1]),
  percentageOfWorld1(populations[2]),
  percentageOfWorld1(populations[3]),
];
// percentages.push(percentageOfWorld1(populations[0]))
console.log(percentages);

// TODO:Lab 4.6. Các phép toán cơ bản với array (25 phút)
console.log("Lab 4.6. Các phép toán cơ bản với array (25 phút)");
/**
 * 
 * Tạo một array chứa tất cả các nước láng giềng của một nước bất kỳ.
 *  Chọn một nước có ít nhất 2 hoặc 3 nước láng giềng. Lưu array vào biến 'neighbours'.
 * 
Ở một số thời điểm, một đất nước mới là 'Utopia' được tạo ra trong vùng lân cận của quốc gia bạn chọn. 
Vậy hãy thêm nó vào cuối array 'neighbours'.

Không may, sau một thời gian, nước mới này biến mất. Vậy hãy xóa nó khỏi cuối array.

Nếu array 'neighbours' không chứa nước 'Germany', hãy in ra console rằng: 'Probably not a central European country :D'.

Thay đổi tên của một trong các nước láng giềng của bạn. Để thực hiện điều đó, 
hãy tìm chỉ mục của đất nước trong array 'neighbours', rồi sử dụng nó để thay đổi array ở vị trí chỉ mục đó.
 Chẳng hạn, nếu bạn tìm thấy 'Sweden' trong array, hãy thay nó bằng 'Republic of Sweden'.
 * 
 */

const neighbours = ["Lao", "Thai lan", "Trung Quoc"];
// TODO: push – thêm một phần tử vào cuối array
neighbours.push("Utopia");
console.log(neighbours);
// TODO: unshift – thêm một phần tử vào đầu array
neighbours.unshift("Malai");
console.log(neighbours);
// TODO:pop – gỡ một phần tử khỏi đuôi array
neighbours.pop();
console.log(neighbours);
// TODO:shift – gỡ một phần tử khỏi đầu array
neighbours.shift();

console.log(neighbours);
// TODO:indexof - chỉ ra vị trí của 1 phần tử trong array
const indexOf = neighbours.indexOf("Trung Quoc");
console.log(indexOf);
// TODO:includes – chỉ ra phần tử có xuất hiện trong array không
const includes1 = neighbours.includes("Germany");
console.log(includes1);
if (!neighbours.includes("Germany")) {
  console.log("Viet Nam not a central European country :D");
}

// TODO:Lab 4.7.1. Đội nào chiến thắng? (phần 2)
console.log("Lab 4.7.1. Đội nào chiến thắng? (phần 2)");

/**
 * 
 * Quay trở lại với hai đội thể dục dụng cụ: Dolphins và Koalas! Có một quy tắc mới cho môn thể dục này, 
 * có cơ chế khác hẳn. Mỗi đội thi đấu 3 lần, sau đó tính trung bình 3 lượt điểm số (điểm trung bình mỗi đội). 
 * Một đội sẽ giành chiến thắng chỉ khi có số điểm trung bình ít nhất là gấp đôi so với điểm của đội còn lại. 
 * Nếu không, sẽ không có đội nào thắng cả!

1. Nhiệm vụ của bạn:

Tạo hàm mũi tên 'calcAverage' để tính trung bình của 3 điểm số.
Sử dụng hàm để tính trung bình của cả hai đội.
Tạo hàm 'checkWinner' nhận điểm trung bình của mỗi đội làm tham số ('avgDolphins' và 'avgKoalas'), 
sau đó in đội thắng ra console cùng với số điểm giành chiến thắng theo luật trên. Ví dụ: "Koalas win (30 vs. 13)".

Dùng hàm 'checkWinner' để xác định đội chiến thắng cho cả Dữ liệu 1 và Dữ liệu 2.
Lần này hãy bỏ qua việc hòa.

2. Dữ liệu kiểm tra:

Dữ liệu 1: Dolphins ghi được 44, 23 và 71 điểm. Koalas ghi được 65, 54 và 49 điểm.
Dữ liệu 2: Dolphins ghi được 85, 54 và 41 điểm. Koalas ghi được 23, 34 và 27 điểm.
 */
// const scoreDolphinsArray = [44, 23, 71];
// const scoreKoalasArray = [65, 54, 49];
const scoreDolphinsArray = [85, 54, 41];
const scoreKoalasArray = [23, 34, 27];
const calcAverage = (score) => (score[0] + score[1] + score[2]) / score.length;
const avgDolphins = calcAverage(scoreDolphinsArray);
const avgKoalas = calcAverage(scoreKoalasArray);

console.log(avgDolphins, avgKoalas);

const checkWinner = (avgDolphins, avgKoalas) => {
  if (avgDolphins >= 2 * avgKoalas) {
    console.log(`Dolphins win (${avgDolphins} vs. ${avgKoalas})`);
  } else if (avgKoalas >= 2 * avgDolphins) {
    console.log(`Koalas win (${avgDolphins} vs. ${avgKoalas})`);
  } else {
    console.log(`không có đội nào thắng cả!`);
  }
};

checkWinner(avgDolphins.toFixed(2), avgKoalas.toFixed(2));

// TODO:Lab 4.7.2. Xây dựng Tip calculator (phần 2)
console.log("Lab 4.7.2. Xây dựng Tip calculator (phần 2)");
/**
 * 
 * Steve vẫn đang xây dựng tip calculator, 
 * sử dụng quy tắc tương tự như trước: Tip 15% hóa đơn nếu giá trị hóa đơn trong khoảng 50-300, và với giá trị khác thì tip 20%.

1. Nhiệm vụ của bạn:

Viết hàm 'calcTip' nhận giá trị hóa đơn bất kỳ làm đầu vào và trả về tiền tip tương ứng,
 tính toán theo các quy tắc ở trên (bạn có thể xem lại code từ thử thách tip calculator đầu tiên nếu cần). 
 Sử dụng loại hàm mà bạn thích nhất. Kiểm tra hàm sử dụng giá trị hóa đơn là 100.

Giờ hãy dùng array. Hãy tạo array 'bills' có chứa dữ liệu kiểm tra bên dưới.

Tạo array 'tips' có chứa giá trị tiền tip cho từng hóa đơn, tính từ hàm mà bạn đã tạo trước đó.
Bonus: Tạo array 'total' có chứa tổng giá trị, tức là bill+tip.
2. Dữ liệu kiểm tra:

125, 555 và 44.
Gợi ý: Hãy nhớ rằng array cần một giá trị ở mỗi vị trí, giá trị đó có thể là giá trị trả về của hàm! 
Do đó bạn có thể gọi hàm như giá trị array (trước tiên đừng lưu giá trị tip trong các biến riêng biệt, mà trong array mới).
 * 
 */
const calcTip = (bill) => (bill > 50 && bill < 300 ? bill * 0.15 : bill * 0.2);
const test = calcTip(275)
console.log(test);
const bills= [125, 555, 44]
const tips =[calcTip(bills[0]),calcTip(bills[1]),calcTip(bills[2]),]
console.log(tips);
const total =[bills[0]+tips[0],bills[1]+tips[1],bills[2]+tips[2],]
console.log(total);