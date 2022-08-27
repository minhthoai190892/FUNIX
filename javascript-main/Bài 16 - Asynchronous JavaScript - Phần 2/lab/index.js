"use strict";


//hàm wait này sẽ trả về một promise và gọi hàm resolve sau số giây tương ứng
const wait = function (seconds) {
  return new Promise(function (resolve) {
    setTimeout(resolve, seconds * 1000);
  });
};
// TODO:Tạo hàm 'createImage' nhận 'imgPath' làm input.
// TODO: Hàm này trả về một promise sẽ tạo ra ảnh mới (dùng document.createElement ('img'))
// TODO: và thiết lập thuộc tính .src cho đường dẫn ảnh được cấp.
function createImage(imgPath) {
  return new Promise(function (resolve, reject) {
    const imgEl = document.createElement('img')//tạo thẻ image
    imgEl.src = imgPath // thiết lập "src" bằng đối số truyền vào
    //bắt sự kiện "load" ảnh 
    imgEl.addEventListener("load", function () {
      imgEl.classList.add('images');//add style "images"
      document.body.appendChild(imgEl);//ảnh "load" xong thì thêm vào "DOM"
      resolve(imgEl)//gọi hàm resolve khi thành công => và trả về kết quả là imgEL
    })
    //bắt sự kiện lỗi
    imgEl.addEventListener("erro", function () {
      //gọi hàm "reject" để thông báo lỗi
      reject(new Error("Đã xảy ra lỗi"))
    })
  })//=> trả về một promise
}

// const imgel = document.createElement("img")
// imgel.src = "images/1.jpg"
// document.body.appendChild(imgel)
let currentImage
createImage(`images/1.jpg`)
  //imgEL được trả về từ resolve (trường hợp thành công)
  .then(imgEl => {
    currentImage = imgEl
    console.log(currentImage);
    console.log("img 1");
    //hiển thị sau 2s sẽ trả về một promise khác
    return wait(2) //=> promise 
  }).then(
    () => {
      currentImage.style.display = "none"//ẩn image 1
      //tạo và hiển thị image2
      return createImage(`images/2.jpg`)
    }
  ).then(imgEl=>{
    currentImage = imgEl
    console.log(currentImage);
    console.log("img 2");
    return wait(2)
  }).then(()=>{
    currentImage.style.display = "none"
    return createImage(`images/3.jpg`)
  }).then(imgEl=>{
    currentImage = imgEl
    console.log(currentImage);
    console.log("img3");
    return wait(10)
  }).catch(err => console.error(err))



// console.log( createImage(`images/1.jpg`));

