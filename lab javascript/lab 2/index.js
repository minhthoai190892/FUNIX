"use strict";
// TODO:Lab 2.1. Các kiểu dữ liệu (10 phút)

/*
Ở bài Lab này, bạn sẽ tiếp tục sử dụng các đoạn code từ bài Lab 1: Giá trị và biến.

1. Khai báo một biến có tên 'isIsland', và đặt giá trị của biến theo quốc gia của bạn.
Biến phải chứa một giá trị Boolean (nếu quốc gia là một hòn đảo thì giá trị biến này là true, ngược lại sẽ là false). 
Khai báo thêm một biến 'language' nhưng chưa cần gán cho nó bất kỳ giá trị nào.

2. In các kiểu dữ liệu của biến 'isIsland', 'population', 'country' và 'language' ra console.
*/
const country = "Viet Nam";
const continent = "Ha Noi";
let population = 100;
const isIsland = false;
let language;
console.log(
  `country ${country} continent ${continent} population ${population} isIsland${isIsland} language ${language}`
);

// TODO:Lab 2.2. Let, const và var (15 phút)
/**
     1. Đặt giá trị của 'language' thành ngôn ngữ được nói ở nơi bạn sống (một số quốc gia có nhiều ngôn ngữ, nhưng chỉ cần chọn một).
    Ví dụ như 'English', 'Vietnamese'.

    2. Hãy nghĩ xem những biến nào có thể sử dụng const (những giá trị nào không bao giờ thay đổi, và những giá trị nào có thể thay đổi?). 
    Sau đó, chuyển các biến mà bạn đã nghĩ ra thành biến khai báo bằng const.

    3. Giờ hãy thử thay đổi giá trị một trong các biến trên và quan sát xem điều gì sẽ xảy ra.
  * 
  */
/**
 * TODO: "const" la khong duoc phep thay doi gia tri
 * TODO: "let" co the thay doi gia tri
 */
language = "Vietnamese";
// TODO: Lab 2.3. Các toán tử cơ bản (25 phút)

/**
 * 1. Nếu quốc gia của bạn bị chia cắt làm hai miền, mỗi miền gồm một nửa dân số của quốc gia, 
 * vậy sẽ có bao nhiêu người sống ở mỗi miền? Hãy sử dụng giá trị từ biến population để hoàn thành yêu cầu này,
 *  in ra màn hình console giá trị của population chia 2.


2. Tăng giá trị của biến population thêm 1 và in kết quả ra console.

3. Phần Lan có dân số là 6 triệu người. Kiểm tra xem quốc gia bạn có nhiều dân hơn so với Phần Lan không? 
Bạn cần in ra console xem giá trị population có lớn hơn 6 triệu không?

4. Dân số trung bình của một quốc gia là 33 triệu người.
Kiểm tra xem quốc gia bạn có ít dân hơn so với các mức dân số trung bình không?

5. Dựa trên các biến bạn đã tạo, hãy tạo một biến mới là  'description', 
trong đó có chứa một string có định dạng sau: '<country> and its <population> million people speak <language>'. 
Bạn cần thay thế các giá trị trong <> thành các biến tương ứng.
 */
// TODO: 1
console.log(population / 2);
// TODO: 2
population++;
console.log(population);
// TODO: 3
if (population > 6) {
  console.log(`country: ${country} population: ${population} > "phan lan"`);
} else {
  console.log(`country: ${country} population: ${population} < "phan lan"`);
}
// TODO: 4

if (population > 33) {
  console.log(`<country>
  's population is above average`);
} else {
  console.log(`country: ${country} population: ${population} < 3 trieu`);
}
// TODO: 5
const description = `<${country}> and its <${population}> million people speak <${language}>`
console.log(description);