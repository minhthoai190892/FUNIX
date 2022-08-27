"use strict";
const arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
console.log("================== Slice ===================");
//không thay đổi mảng góc
const newArr = arr.slice(2);
console.log(newArr);
//toán tử (...)
const newArr2 = [...arr];
console.log(newArr2);

console.log("================== Splice ===================");
// làm thay đổi mảng góc
newArr2.splice(1, 2);
// làm thay đổi mảng góc
newArr2.splice(1, 2, "ok1", "ok2");

console.log("Splice: " + newArr2);

console.log("================== Reverse ===================");
console.log("reverse: " + newArr2.reverse());

console.log("================== Concat ===================");
const newArr3 = newArr2.concat(arr, "gia tri");
console.log("Concat: " + newArr3);
console.log("================== (...) ===================");
const newArr4 = [...arr, ...newArr2];
console.log(newArr4);
console.log("================== Join ===================");
let str = arr.join(" ");
console.log(str);
console.log("================== ForEach ===================");
arr.forEach((element, index, array) => {
  console.log("forEach: " + element);
  console.log("index: " + index);
  console.log("array: " + array);
});

console.log("================== Map ===================");
//tạo một mảng mới
//trả về một mảng chứa bình phương tất cả phần tử arr
console.log(arr);
const arrSqrt = [];
for (let index = 0; index < arr.length; index++) {
  console.log(arr[index] ** 2, index + 1);
  arrSqrt.push(arr[index] ** 2);
}
console.log("Sqrt: " + arrSqrt);

const arrSqrt2 = arr.map((item) => item ** 2);
console.log(arrSqrt2);

const arrTest = [1, 2, 3, 4, 5];

const test1 = arrTest.map(function (item) {
  return item * item;
});
console.log("Test 1: " + test1);

function testArr2(item) {
  return item * item;
}

const test2 = arrTest.map(testArr2);
console.log("Test 2: " + test2);
const test3 = arrTest.map((item) => item * item);
console.log("Test 3: " + test3);
console.log("================== Filter ===================");
//lấy phần tử chẳn trong mảng
const sochan1 = arr.filter(function (item) {
  return item % 2 === 0;
});
console.log("sochan1: " + sochan1);

const sochan2 = arr.filter((item) => item % 2 === 0);
console.log("sochan2: " + sochan2);

function sochan(item, index) {
  console.log(`phan tu thu ${index} la: ${item}`);
  return item % 2 === 0;
}
function filterX(callbackfunc) {
  const sochanx = [];
  for (let index = 0; index < arr.length; index++) {
    if (arr[index] % 2 === 0) {
      sochanx.push(arr[index]);
    }
  }
  return sochanx;
}
const sochan3x = filterX(sochan);

console.log("sochan3x: ", sochan3x);
console.log("===");
const sochan4 = arr.filter((element) => element % 2 === 0);
console.log(sochan4);


console.log("================== Reduce ===================");
console.log("============== cach 1: for ================");

let sum = 0
for (let index = 0; index < arr.length; index++) {
    sum+=arr[index]
    
}
console.log(sum);

console.log("============== cach 2: reduce ================");
const reduce1 = arr.reduce(function (previousValue,currentValue) {
    return previousValue + currentValue
})
console.log(reduce1);
const reduce2 = arr.reduce((previousValue,currentValue)=> previousValue+currentValue)
console.log(reduce2);

function reduceFunc1(previousValue,currentValue) {
    return previousValue + currentValue
}
const reduce3 = arr.reduce(reduceFunc1)
console.log(reduce3);

function reduceX(callbackFunc) {
    let sum = 0
    for (let index = 0; index < arr.length; index++) {
        sum = reduceFunc1(sum,arr[index])
        
    }
    return sum
}
const reduce4 = reduceX(reduceFunc1)
console.log(reduce4);
console.log("--");
const reduce5 = arr.reduce(reduceFunc1)
console.log(reduce5);

const res =  arr.reduce((previousValue,currentValue)=>[currentValue,...previousValue],[])
const res2 = arr.reduce((previousValue,currentValue)=> previousValue+currentValue*2,0)
console.log(res2);
console.log("---");
const res3 = arr.filter((element )=>element%2 ===0).reduce((previousValue,currentValue)=>previousValue+currentValue)
console.log(res3);
const res4 = arr.map((item )=>item**2).filter(item => item%2===1).reduce((previousValue,currentValue)=>previousValue+currentValue)
console.log(res4);