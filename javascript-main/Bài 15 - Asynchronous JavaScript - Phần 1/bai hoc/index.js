"use strict";
console.log("asdasd");
// tạo đối tượng AJAX
const myRequest = new XMLHttpRequest();

myRequest.open(
  "GET", //gửi yêu cầu lên máy chủ
  "https://jsonplaceholder.typicode.com/posts/1", //địa chỉ máy chủ
//   "https://geocode.xyz/?region=DE&geoit=JSON&streetname=albani",
  true // chạy bất đồng bộ (false chạy đồng bộ)
);
myRequest.send(); //gửi đi
console.dir(myRequest);
//sự kiện load
myRequest.onload = function () {
  // console.log(JSON.parse(myRequest.responseText).body); //cách lấy thuộc tính
  const data = myRequest.responseText; //(responseText) nhận dữ liệu phản hồi ở dạng chuỗi (responseXML) nhận dữ liệu phản hồi ở dạng XML
  console.log(data);
  //chuyển về dữ liệu gốc
  const data2 = JSON.parse(data);
  console.log(data2);
  console.log(data2.title);
  p.textContent = data2.title;
};
const p = document.querySelector("p");
console.log("asdasd");
