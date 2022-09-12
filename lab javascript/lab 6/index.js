'use strict';
// TODO:Lab 6. Xử lý chuỗi
console.log("Lab 6. Xử lý chuỗi");
/**
 * 
 * 
 * Cho một loạt các nhiệt độ tối đa đã được dự báo, nhiệt kế hiển thị một string với các nhiệt độ đã cho.
 *  Ví dụ: [17, 21, 23] sẽ in ra console "... 17ºC in 1 day ... 21ºC in 2 days ... 23ºC in 3 days ..."

1. Nhiệm vụ của bạn

Tạo hàm 'printForecast' lấy array 'arr' và in một string như trên ra console. Hãy thực hành với cả hai dữ liệu kiểm tra.
2. Dữ liệu kiểm tra

Dữ liệu 1: [17, 21, 23]
Dữ liệu 2: [12, 5, -5, 0, 4]
 */
const arr = [12, 5, -5, 0, 4]
const printForecast = function (arr) { 
    let str = "... "
    for (let index = 0; index < arr.length; index++) {
        // console.log(arr[index]);
        str += `${arr[index]}ºC in ${index+1} day ...`
        
    }
    console.log(str);
 }
 printForecast(arr)