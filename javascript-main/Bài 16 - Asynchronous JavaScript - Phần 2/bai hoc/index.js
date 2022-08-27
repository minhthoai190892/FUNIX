"use strict";
// const el = document.querySelector("img")
// el.src = "android.jpg"

// TODO: hàm được chạy theo thứ tự
console.log("cv1");

// TODO: hàm được chạy sau đó chuyển vào web API để sử lý
// TODO: => sau đó được chuyển tới callBack Queue => chờ được "Event Loop" gọi lên thực thi
setTimeout(() => {
  console.log("cv2");
}, 0);
setTimeout(() => {
  console.log("cv3");
}, 0);

// TODO: hàm được chạy sau đó chuyển vào web API để sử lý
// TODO: => sau đó được chuyển tới Microtasks Queue => chờ được "Event Loop" gọi lên thực thi (được ưu tiên hơn callBack Queue)
Promise.resolve("cv4").then((res) => console.log(res));
Promise.resolve("cv5").then((res) => console.log(res));
console.log("hoan thanh");

Promise.resolve("cv6").then((res) => console.log(res));

console.log("----------------- Async -------------------");

// TODO: có từ khóa "Async" được hiểu như cả hàm đó là code bất đồng bộ. Được thực thi trong web API

async function myFunc(id) {
  const res = await fetch(`https://jsonplaceholder.typicode.com/posts/${id}`);
  const data = await res.json();
  console.log(`Du lieu cua ${id}`);
  console.log(data);
}
myFunc(2);
Promise.all([myFunc(1),myFunc(4)])
const promise1 = Promise.resolve("ok").then((res) => console.log(res));
async function test() {
  const res = await Promise.resolve("okkkkk");
  console.log(res);
}
test()