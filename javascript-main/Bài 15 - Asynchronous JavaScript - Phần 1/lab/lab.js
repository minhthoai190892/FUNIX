"use strict";
// TODO: Tạo hàm 'whereAmI' có đầu vào là giá trị vĩ độ ('lat') và kinh độ ('lng') (tọa độ GPS trong dữ liệu kiểm tra dưới đây)
function whereAmI(lat, lng) {
  fetch(`https://geocode.xyz/${lat},${lng}?geoit=json`) //lấy dữ liệu từ APi
    //    trả về cho ta một promise gọi phương thức "then"
    .then(
      //"then" nhận callback function
      function (response) {
        console.log(response);
        //xử lý lỗi truy cập quá nhanh trên 3 lần/s
        if (!response.ok) {
          throw new Error(`Errorr code: ${response.status}`);
        }
        //trả về một promise và promise này ở trạng thái thành công sẽ trả vè data ta mong muốn
        return response.json();
      }
    ) //=> trả về một promise
    .then(function (data) {
      console.log(`You are in ${data.region}, ${data.country}`);
      //trả về một promise
      return fetch(`https://restcountries.com/v2/name/${data.country}`);
    })
    .then(function (response) {
      console.log(response);
      //xử lý lỗi truy cập quá nhanh trên 3 lần/s
      if (!response.ok) {
        throw new Error(`Errorr code: ${response.status}`);
      }
      //trả về một promise và promise này ở trạng thái thành công sẽ trả vè data ta mong muốn
      return response.json();
    })
    .then(function (data) {
      console.log(data);
      console.log(data[0].flags.svg);
    })
    .catch((err) => console.error(`Error: ${err.message}`));
}
//52.508,13.381
whereAmI(52.508,13.381);
// Tọa độ 1: 52.508, 13.381 (Vĩ độ, Kinh độ)
// Tọa độ 2: 19.037, 72.873
// Tọa độ 3: -33.933, 18.474
whereAmI(19.037, 72.873);
whereAmI(-33.933, 18.474);
