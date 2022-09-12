"use strict";
// TODO:Lab 3.1. Chuyển đổi kiểu và ép kiểu (10 phút)
console.log("9" - "5"); // 4

console.log("19" - "13" + "17"); //617

console.log("19" - "13" + 17); //23

console.log("123" < 57); //false

console.log(5 + 6 + "4" + 9 - 4 - 2); //1143

// TODO:Lab 3.2. Toán tử bằng: == với === (40 phút)
/**
 * Khai báo biến 'numNeighbours' dựa trên prompt input sau: prompt('How many neighbor countries does your country have?').
 * Bạn có thể tìm hiểu cách sử dụng hàm prompt để lấy dữ liệu từ người dùng ở link sau.
 */
// const numNeighbours = prompt(
//   "How many neighbor countries does your country have?"
// );
// if (numNeighbours == 1) {
//   console.log("Only 1 border!");
// } else if (numNeighbours > 1) {
//   console.log("More than 1 border");
// } else if (numNeighbours == 0) {
//   console.log("No borders'");
// }
// console.log("-------`===`-----------");

// if (Number(numNeighbours) === 1) {
//     console.log("Only 1 border!");
//   } else if (numNeighbours > 1) {
//     console.log("More than 1 border");
//   } else if (numNeighbours === 0) {
//     console.log("No borders'");
//   }

// TODO:Lab 3.3. Toán tử logic (25 phút)
console.log("Lab 3.3. Toán tử logic (25 phút)");
/**
 * Hãy vô hiệu hóa code trước đó để prompt không xuất hiện.
 * 
Giả sử Sarah đang tìm một quốc gia mới để sinh sống. Cô ấy muốn ở một đất nước sử dụng ngôn ngữ Tiếng Anh, 
dân số ít hơn 50 triệu người và không phải đảo quốc.

Bạn cần tạo các biến tương ứng với ngôn ngữ, dân số, có phải đảo quôcs không. 
Giá trị các biến này sẽ được nhập bằng hàm prompt.

Hãy viết một câu lệnh if giúp Sarah tìm kiếm quốc gia phù hợp. 
Bạn cần viết điều kiện đánh giá  tất cả các tiêu chí của Sarah. Hãy dành thời gian thực hiện điều này.

Nếu đất nước nhập vào phù hợp, in ra string như sau: 'You should live in Portugal :)'. 
Ngược lại, hãy in 'Portugal does not meet your criteria :('
Có thể đất nước mà bạn nhập không đáp ứng toàn bộ tiêu chí. 
Hãy quay trở lại và thay đổi tạm thời một số biến để điều kiện trở nên đúng (trừ khi bạn sống ở Canada).
 */

const country = "Viet Nam";
const continent = "Ha Noi";
let population = 10;
const isIsland = true;
let language = "Vietnames";
if (language === "Vietnames" && population < 50 && isIsland) {
  console.log(`You should live in ${country}`);
} else {
  console.log(`${country} does not meet your criteria`);
}

// TODO:Lab 3.4. Câu lệnh switch (5 phút)
console.log("Lab 3.4. Câu lệnh switch (5 phút)");

/**
 * Sử dụng câu lệnh switch để ghi string sau cho 'language': 

Chinese or Mandarin: 'MOST number of native speakers!'

Spanish: '2nd place in number of native speakers'

English: '3rd place'

Hindi: 'Number 4'

Arabic: '5th most spoken language'

Tất cả các log đơn giản khác 'Great language too :D'
 */
// const language1 = prompt("Enter Language: ");
// switch (language1) {
//   case "Chinese":
//     console.log("MOST number of native speakers!");
//     break;
//   case "Mandarin":
//     console.log("MOST number of native speakers!");
//     break;
//   case "Spanish":
//     console.log("2nd place in number of native speakers");
//     break;
//   case "English":
//     console.log("3rd place");
//     break;
//   case "Hindi":
//     console.log("Number 4");
//     break;
//   case "Arabic":
//     console.log("5th most spoken language");
//     break;
//   default:
//     console.log("Great language too :D");

//     break;
// }
// TODO:Lab 3.5. Toán tử điều kiện (ba ngôi) (10 phút)
console.log("Lab 3.5. Toán tử điều kiện (ba ngôi) (10 phút)");

/**
 * Nếu dân số của đất nước lớn hơn 33 triệu người,
 *  sử dụng toán tử ba ngôi để in string sau ra console: 'Portugal's population is above average'. 
 *  lại, hãy in 'Portugal's population is below average'.
 *  Lưu ý giữa hai câu này chỉ có một từ thay đổi!

Sau khi kiểm tra kết quả, hãy tạm thay đổi dân số thành 13 rồi thành 130. 
Hãy xem xét các kết quả khác nhau, rồi đặt dân số về lại ban đầu.
 */
population > 33
  ? console.log(`${country}'s population is above average`)
  : console.log(`${country}'s population is below average`);
//   TODO:Lab 3.6.1. Đội nào chiến thắng? (phần 1)
console.log("Lab 3.6.1. Đội nào chiến thắng? (phần 1)");
/**
 * Có hai đội thể dục dụng cụ là Dolphins và Koalas. Họ thi đấu với nhau 3 lần. Đội nào có điểm trung bình cao nhất sẽ chiến thắng!
 * 1. Nhiệm vụ của bạn:

Tính điểm cho từng đội, sử dụng dữ liệu kiểm tra bên dưới
So sánh điểm trung bình của hai đội để tìm ra đội chiến thắng và in ra console.
 Đừng quên là có thể hòa, nên hãy kiểm tra điều đó (hòa tức là họ có điểm trung bình giống nhau), 
 nếu hòa bạn hãy in ra màn hình "Both win the trophy!".

Bonus 1: Chúng ta được thêm một quy tắc như sau: số điểm tối thiểu là 100 điểm . 
Theo quy tắc này, một đội sẽ giành chiến thắng chỉ khi họ có điểm trung bình cao hơn đội còn lại, 
và đồng thời có ít nhất 100 điểm. Gợi ý: Sử dụng toán tử logic để kiểm tra điểm số tối thiểu cũng như các else-if block! 

Bonus 2: Điểm số tối thiểu cũng áp dụng cho việc hòa trận! 
Trường hợp hòa nhau chỉ xảy ra khi cả hai đội có số điểm giống nhau mà phải lớn hơn hoặc bằng 100 điểm. 
Nếu không thì không có đội nào giành chiến thắng cả.
 
2. Dữ liệu kiểm tra:

Dữ liệu 1: Dolphins được 96, 108 và 89 điểm. Koalas được 88, 91 và 110 điểm
Dữ liệu Bonus 1: Dolphins được 97, 112 và 101 điểm. Koalas được 109, 95 và 123 điểm
Dữ liệu Bonus 2: Dolphins được 97, 112 và 101 điểm. Koalas được 109, 95 và 106 điểm
*/
// const scoreDolphins = (96+ 108 + 89)/3
// // const scoreKoalas = (96+ 108 + 89)/3
// const scoreKoalas = (88+ 91 + 110)/3
// console.log(scoreDolphins,scoreKoalas);

// if (scoreDolphins > scoreKoalas) {
//     console.log("Dolphins 🏆");
// } else if (scoreDolphins < scoreKoalas) {

//     console.log("Koalas 🏆");
// }else {
//     console.log("Both win the trophy! 🏆");

// }
// TODO:Bonus 1
// const scoreDolphins = (97+ 112 + 101)/3
// // const scoreKoalas = (97+ 112 + 101)/3
// const scoreKoalas = (109+ 95 + 123)/3
// console.log(scoreDolphins,scoreKoalas);

// if (scoreDolphins > scoreKoalas && scoreDolphins >=100) {
//     console.log("Dolphins 🏆");
// } else if (scoreDolphins < scoreKoalas && scoreKoalas >=100)  {

//     console.log("Koalas 🏆");
// }else {
//     console.log("Both win the trophy! 🏆");

// }

// TODO:Bonus 2

const scoreDolphins = (97 + 112 + 101) / 3;
const scoreKoalas = (97 + 112 + 11) / 3;
// const scoreKoalas = (109+ 95 + 123)/3
console.log(scoreDolphins, scoreKoalas);

if (scoreDolphins > scoreKoalas && scoreDolphins >= 100) {
  console.log("Dolphins 🏆");
} else if (scoreDolphins < scoreKoalas && scoreKoalas >= 100) {
  console.log("Koalas 🏆");
} else if (
  scoreDolphins === scoreKoalas &&
  scoreDolphins >= 100 &&
  scoreKoalas >= 100
) {
  console.log("Both win the trophy! 🏆");
}

// TODO:Lab 3.6.2. Tip calculator (phần 1)
console.log("Lab 3.6.2. Tip calculator (phần 1)");
/**
 * Steven muốn tạo một tip calculator (công cụ tính tiền tip) đơn giản cho những khi anh ta muốn ăn ở nhà hàng. 
 * Ở đất nước của anh ta, người ta thường tip 15% nếu giá trị hóa đơn nằm trong khoảng 50-300. Với những giá trị khác, 
 * tip thường là 20%.

1. Nhiệm vụ của bạn:

Tính tip dựa theo giá trị hóa đơn. Tạo biến 'tip' cho điều này. 
Không dùng câu lệnh if/else (Để dễ hơn, bạn có thể bắt đầu với lệnh if/else sau đó chuyển đổi nó thành toán tử ba ngôi!)

In string ra console có chứa giá trị hóa đơn (bill), tiền tip và giá trị cuối cùng (bill + tip). 
Ví dụ: “The bill was 275, the tip was 41.25, and the total value 316.25”

2. Dữ liệu kiểm tra:

Dữ liệu 1: Kiểm tra giá trị bill 275, 40 và 430
3. Gợi ý:

Tính 20% của giá trị, nhân nó với 20/100 = 0.2
Giá trị X nằm trong khoảng 50 và 300, nếu nó >= 50 && <= 300
 * 
 */

const bill =275

const tip = bill >50 && bill <300 ? bill *0.15: bill *0.2
console.log(`The bill was ${275}, the tip was ${tip}, and the total value ${bill+tip}`);
