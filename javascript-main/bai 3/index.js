const inputyear = "1992";
console.log(Number(inputyear));
console.log(Number(inputyear) + 185);
console.log(String(20), 20);

console.log(Boolean(0)); //số 0
console.log(Boolean(undefined)); //chưa định nghĩa
console.log(Boolean("")); //chuỗi rỗng
console.log(Boolean(null)); //null
console.log(Boolean(NaN)); //NaN
console.log(Boolean("ádf"));
console.log(Boolean({}));

const money = 0;
if (money) {
  console.log("don't spend");
} else {
  console.log("you should get a job");
}

// ===
console.log("-------===-----------");

const age = "18";
if (age === 18) {
  console.log("dung tuoi 18");
} else {
  console.log("khong pahi 18 tuoi");
}

console.log("----------==-----------");
if (age == 18) {
  console.log("dung tuoi 18");
} else {
  console.log("khong pahi 18 tuoi");
}
console.log("---------prompt-------------");
// const inputAge = Number(prompt("Enter your age"));
const inputAge = 10;
console.log(inputAge);
console.log(typeof inputAge);
if (inputAge === 23) {
  console.log("Age: 23");
} else if (inputAge === 7) {
  console.log("Age: 7");
} else {
  console.log("Not age 7 and 23");
}

if (inputAge !== 23) {
  console.log("why not 23?");
} else {
  console.log("age:asdsa 23");
}

console.log("----------Logic Boolean-----------");
const a = true;
const b = true;
if (a && b) {
  console.log("a va b giong nhau");
} else {
  console.log("a va b khac nhau");
}
console.log(a && b);
console.log(a || b);
console.log(!a);
const c = false;
if (a && b && !c) {
  console.log("a b c giong nhau");
} else {
  console.log("a b c khac nhau");
}

console.log("----------Switch----------");
const day = prompt("Enter day: ");
switch (day) {
  case "thu 2":
    console.log("ngay thu 2");

    break;
  case "thu 3":
    console.log("ngay thu 3");

    break;
  case "thu 4":
    console.log("ngay thu 4");

    break;
  default:
    console.log("khong co ngay");

    break;
}
console.log("----------Toán tử điều kiện (3 ngôi)----------");

const tuoi = Number(prompt("nhap tuoi cua ban: "));
tuoi >= 18 ? console.log("tren 18 tuoi") : console.log("duoi 18 tuoi");
console.log(
  `tuoi cua ban la:${tuoi} ${tuoi >= 18 ? "tren 18 tuoi" : "duoi 18 tuoi"}`
);

let grade = "A";
let result = 0;
switch (grade) {
  case "A":
    result += 10;
  
  case "B":
    result += 9;
    break;
    case "C":
    result += 8;
    break;
  default:
    result += 0;
}
console.log(result)
console.log(5 + 6 + '4' + 9 - 4 - 2)