"use strict";
// const birthYear = 2022
// let century;
// if (birthYear <=2000) {
//     century = 20
// }else{
//     century = 21
// }
// console.log(century);

// console.log("=============");
// const massMark = 95
// const heightMark = 1.88

// const massJohn = 85
// const heightJohn = 1.76
// const BMIMark = massMark/(heightMark**2)
// const BMIJohn = massJohn/(heightJohn*heightJohn)
// const markHigherBMI = BMIMark>BMIJohn
// console.log(BMIJohn,BMIMark,markHigherBMI);
// if (BMIMark > BMIJohn) {
//     console.log(`Mark's BMI (${BMIMark}) is higher than John's (${BMIJohn})` );
// } else {
//     console.log(`John's (${BMIJohn}) BMI is higher than Mark's (${BMIMark})`);

// }
// console.log("23"+"23"-6);
const a = 10;
const c = 30;
const b = 20;

console.log(!a);
if (a === 20 || b === 40) {
  console.log(a + b);
} else {
  console.log(a - b);
}
const hasDriversLicense = true;
const hasGoodVision = false;
console.log(hasDriversLicense && !hasGoodVision);
if (hasDriversLicense && !hasGoodVision) {
  console.log(`sarah is able to driver`);
} else {
  console.log(`someone else should drive`);
}
/*

Lab 3.6.1. Đội nào chiến thắng? (phần 1)

Có hai đội thể dục dụng cụ là Dolphins và Koalas. Họ thi đấu với nhau 3 lần. Đội nào có điểm trung bình cao nhất sẽ chiến thắng!

1. Nhiệm vụ của bạn:

Tính điểm cho từng đội, sử dụng dữ liệu kiểm tra bên dưới
So sánh điểm trung bình của hai đội để tìm ra đội chiến thắng và in ra console. 
Đừng quên là có thể hòa, nên hãy kiểm tra điều đó (hòa tức là họ có điểm trung bình giống nhau), 
nếu hòa bạn hãy in ra màn hình "Both win the trophy!".

Bonus 1: Chúng ta được thêm một quy tắc như sau: số điểm tối thiểu là 100 điểm . 
Theo quy tắc này, một đội sẽ giành chiến thắng chỉ khi họ có điểm trung bình cao hơn đội còn lại, và đồng thời có ít nhất 100 điểm. 
Gợi ý: Sử dụng toán tử logic để kiểm tra điểm số tối thiểu cũng như các else-if block! 

Bonus 2: Điểm số tối thiểu cũng áp dụng cho việc hòa trận! 
Trường hợp hòa nhau chỉ xảy ra khi cả hai đội có số điểm giống nhau mà phải lớn hơn hoặc bằng 100 điểm. 
Nếu không thì không có đội nào giành chiến thắng cả.
2. Dữ liệu kiểm tra:

Dữ liệu 1: Dolphins được 96, 108 và 89 điểm. Koalas được 88, 91 và 110 điểm
Dữ liệu Bonus 1: Dolphins được 97, 112 và 101 điểm. Koalas được 109, 95 và 123 điểm
Dữ liệu Bonus 2: Dolphins được 97, 112 và 101 điểm. Koalas được 109, 95 và 106 điểm

*/
// const scountDolphins = (96 + 108 + 89) / 3;
// const scountKoalas = (88 + 91 + 110) / 3;
// console.log(scountDolphins , scountKoalas);
// if (scountDolphins > scountKoalas) {
//     console.log(`Dolphins 🏆`);
// }else if (scountDolphins < scountKoalas) {
//     console.log(`Koalas 🏆`);

// } else if (scountDolphins === scountKoalas) {
//     console.log(`Both win the trophy! 🏆`);

// }

// TODO: bonus 1
const scountDolphins = (97 + 112 + 101) / 3;
const scountKoalas = (109 + 95 + 123) / 3;
console.log(scountDolphins, scountKoalas);
if (scountDolphins > scountKoalas && scountDolphins >= 100) {
  console.log(`Dolphins 🏆`);
} else if (scountDolphins < scountKoalas && scountKoalas >= 100) {
  console.log(`Koalas 🏆`);
} else if (
  scountDolphins === scountKoalas &&
  scountDolphins >= 100 &&
  scountKoalas >= 100
) {
  console.log(`Both win the trophy! 🏆`);
} else {
  console.log(`No one win the trophy😭`);
}

const age = 2;
age >= 18
  ? console.log(`I like drink wine 🍷`)
  : console.log(`i like to drink water 💧`);

const drink = age >= 18 ? "wine🍷" : "water 💧";
console.log(`i like drink ${drink}`);
console.log(`i like drink ${age >= 18 ? `  wine 🍷` : `  water 💧`}`);

/*
Lab 3.6.2. Tip calculator (phần 1)

Steven muốn tạo một tip calculator (công cụ tính tiền tip) đơn giản cho những khi anh ta muốn ăn ở nhà hàng. Ở đất nước của anh ta, người ta thường tip 15% nếu giá trị hóa đơn nằm trong khoảng 50-300. Với những giá trị khác, tip thường là 20%.

1. Nhiệm vụ của bạn:

Tính tip dựa theo giá trị hóa đơn. Tạo biến 'tip' cho điều này. Không dùng câu lệnh if/else (Để dễ hơn, bạn có thể bắt đầu với lệnh if/else sau đó chuyển đổi nó thành toán tử ba ngôi!)
In string ra console có chứa giá trị hóa đơn (bill), tiền tip và giá trị cuối cùng (bill + tip). Ví dụ: “The bill was 275, the tip was 41.25, and the total value 316.25”
2. Dữ liệu kiểm tra:

Dữ liệu 1: Kiểm tra giá trị bill 275, 40 và 430
3. Gợi ý:

Tính 20% của giá trị, nhân nó với 20/100 = 0.2
Giá trị X nằm trong khoảng 50 và 300, nếu nó >= 50 && <= 300

 */
const bill =275
const tip = bill <=300 && bill >=50?bill *0.15:bill*0.2
console.log(`The bill was ${bill}, the tip was ${tip}, and the total value ${bill+tip}`);