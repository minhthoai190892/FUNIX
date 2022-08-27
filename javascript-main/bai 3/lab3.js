"9" - "5"; //4

"19" - "13" + "17"; //617

"19" - "13" + 17; //23

"123" < 57; //false

5 + 6 + "4" + 9 - 4 - 2; //1143

// lab 2
// const numNeighbours = prompt("How many neighbor countries does your country have?'")
/*
const numNeighbours = Number(prompt("How many neighbor countries does your country have?'"))

console.log("----------==-----------")

if (numNeighbours==1) {
    console.log("Only 1 border!'")
} else if (numNeighbours>=1) {
    console.log("More than 1 border'")
    
} else {
    console.log("No borders'")
    
} 
console.log("----------===-----------")
if (numNeighbours===1) {
    console.log("Only 1 border!'")
} else if (numNeighbours>=1) {
    console.log("More than 1 border'")
    
} else {
    console.log("No borders'")
    
} 
*/

/* Tại sao lại như vậy? do khác kểu dữ liệu
trong câu lệnh ta so sánh với một số khi tao nhập vào là 1 chuổi
1 # "1" => false
=== không cần phải ép kểu khi nó chỉ trả về true nếu 2 giá trị
giống nhau và và cùng kểu dữ liệu
*/

// Lab 3.3. Toán tử logic
/*
const quocGia= prompt("Enter Quoc Gia: ")
const ngonNgu= prompt("Enter ngôn ngữ: ") //tieng anh
const danso= prompt("Enter dân số: ") //<50
const dao= prompt("Enter đảo : ") // khong co dao
if (ngonNgu=="tieng anh" && danso<50 &&dao =="khong co dao") {
    console.log(`You should live in ${quocGia}`)
}else{
    console.log(`${quocGia} does not meet your criteria :(`)

    
}
*/

// Lab 3.4. Câu lệnh switch
/*
const language = prompt("Enter language: ");
switch (language) {
  case "Chinese":
    console.log("MOST number of native speakers!");
    break;
  case "Mandarin":
    console.log("MOST number of native speakers!");
    break;
  case "Spanish":
    console.log("2nd place in number of native speakers");
    break;
  case "English":
    console.log("3rd place");
    break;
  case "Hindi":
    console.log("Number 4");
    break;
  case "Arabic":
    console.log("5th most spoken language");
    break;
  default:
    console.log("Great language too :D");

    break;
}
*/
// Lab 3.5. Toán tử điều kiện (ba ngôi)
/*
const maxdanso = 33;
const danso = Number(prompt("nhap dan so: "));
console.log(
  `${
    danso > maxdanso
      ? "Portugal's population is above average"
      : "Portugal's population is below average"
  }`
);
*/

// Lab 3.6: Bài toán tổng hợp

// https://courses.funix.edu.vn/courses/course-v1:FUNiX+PRF192x_2.1-A_VN+2022_T3/courseware/4b263362f9ec4edf9f901a195177a213/ddfffe242aad4b209c6a38353eee28d2/?activate_block_id=block-v1%3AFUNiX%2BPRF192x_2.1-A_VN%2B2022_T3%2Btype%40sequential%2Bblock%40ddfffe242aad4b209c6a38353eee28d2
// Dữ liệu 1: Dolphins được 96, 108 và 89 điểm. Koalas được 88, 91 và 110 điểm
const scorevDolphins =(96+108+89)/3
// const scorevKoalas =(96+108+89)/3
const scorevKoalas =(88+91+110)/3
console.log("Dolphins: "+scorevDolphins+"  "+"Koalas: "+scorevKoalas)
if (scorevDolphins == scorevKoalas) {
    console.log("2 doi hoa")
} else if (scorevDolphins > scorevKoalas) {
    console.log("scorevDolphins > scorevKoalas")
    
} else {
    console.log("scorevDolphins < scorevKoalas")
    
}
console.log("------------Bonus 1---------------")
const scorevDolphins1 =(97+112 +101 )/3
// const scorevKoalas1 =(97+112 +101 )/3
const scorevKoalas1 =(109+95 +123 )/3
console.log("Dolphins: "+scorevDolphins1+"  "+"Koalas: "+scorevKoalas1)

if (scorevDolphins1 == scorevKoalas1 && scorevDolphins1>=100 && scorevKoalas1>=100) {
    console.log("2 doi hoa")
    
} else if (scorevDolphins1 > scorevKoalas1 && scorevDolphins1>=100) {
    console.log("scorevDolphins > scorevKoalas")
    
} else if (scorevDolphins1 < scorevKoalas1 && scorevKoalas1>=100) {
    console.log("scorevDolphins < scorevKoalas")
    
} else {
    console.log("khong doi nao chien thang")
    
} 
console.log("------------ Lab 3.6.2.---------------")

// Lab 3.6.2. Tip calculator (phần 1)

let bill =40 
let tip =bill>=50&&bill<=300?bill*0.15:bill*0.2
console.log(`The bill was ${bill}, the tip was ${tip}, and the total value ${bill+tip}`)
