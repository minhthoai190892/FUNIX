'use strict';
function longger() {
    console.log(`my nam is Jonas`);
}
/**
 * 
 * @param {*} apples là 2 tham số của hàm có thể là number, string, array, object 
 * @param {*} oranges là 2 tham số của hàm có thể là number, string, array, object 
 * @param {*} return trả về kết quả của hàm
 */
function fruitProcessor(apples, oranges) {
    console.log(apples,oranges);
    const juice = `Juice with ${apples} apples and ${oranges} oranges`
    return juice
}
// TODO: khi hàm có return phải lưu giá trị của hàm vào một biến để hiển thị trên "console.log()"
//gọi lại hàm
fruitProcessor(2,3)
// khi báo biến chứa giá trị của hàm
const fruitJuice = fruitProcessor(5,3)// "5,3" là đối số nhập vào hàm thông qua "tham số" "apples, oranges"
console.log(fruitJuice);
//ghi trực tiếp vào hàm
console.log(fruitProcessor(2,3));