"use strict";
// TODO: 1. Nhiệm vụ của bạn
// Sử dụng một hàm tạo để triển khai 'Car'. Một chiếc ô tô có thuộc tính 'make' và 'speed'.
// Thuộc tính 'speed' là tốc độ hiện tại của ô tô tính bằng km/h.
function Car(make, speed) {
  this.make = make;
  this.speed = speed;
}
// Triển khai phương thức 'accelerate' tăng tốc độ của ô tô thêm 10 km/h và in tốc độ mới ra console.
Car.prototype.accelerate = function () {
  this.speed += 10;
  console.log(`toc do cua oto sau khi tang len 10km/h la: ${this.speed}Km`);
};
//Triển khai phương thức 'brake' giảm bớt tốc độ của ô tô 5 km/h và in tốc độ mới ra console.
Car.prototype.brake = function () {
  this.speed -= 5;
  console.log(`toc do cua oto sau khi giam 5km/h la: ${this.speed}Km`);
};
// TODO:2. Dữ liệu kiểm tra
// Dữ liệu car 1: 'BMW' đi với tốc độ 120 km/h
console.log(
  " ============Dữ liệu car 1: 'BMW' đi với tốc độ 120 km/h============"
);
const car1 = new Car("BMW", 120);
car1.accelerate();
car1.brake();
car1.accelerate();
car1.brake();

// Dữ liệu car 2: 'Mercedes' đi với tốc độ 95km/h
console.log(
  "============Dữ liệu car 2: 'Mercedes' đi với tốc độ 95km/h============"
);
const car2 = new Car("Mercedes", 95);
car2.accelerate();
car2.brake();
car2.accelerate();
car2.brake();

// TODO:Lab 13.2: Sử dụng ES6 Class
console.log("========= Lab 13.2: Sử dụng ES6 Class ==========");

// TODO:1. Nhiệm vụ của bạn
// Tạo lại như class Car lab 13.1, nhưng lần này sử dụng ES6 class (gọi nó là 'CarCl').
class CarCl {
  constructor(make, speed) {
    this.make = make;
    this.speed = speed;
  }
  //Thêm một getter là 'speedUS', trả về tốc độ hiện tại tính bằng mile/h
  //    (bạn cần quy điểm km/h thành mile/h bằng cách chia cho 1.6).
  //   TODO: "getter" lấy giá trị
  get speedUS() {
    //trả về tốc độ hiện tại tính bằng mile/h
    return this.speed / 1.6;
  }
  //   TODO: "setter" cài đặt giá trị
  //Thêm một setter gọi là 'speedUS' để đặt giá trị tốc độ hiện tại tính bằng mile/h.
  //    (giá trị của tham số sẽ là ở mile/h, khi lưu vào object thì bạn sẽ lưu ở đơn vị km/h bằng cách nhân với 1.6).
  set speedUS(speed) {
    //trả về tốc độ hiện tại tính bằng mile/h
    return (this.speed = speed * 1.6);
  }
  //Tạo một đối tượng Car mới, thử nghiệm với phương thức 'accelerate' và 'brake', với getter và setter.
  accelerate() {
    this.speed += 10;
    console.log(`toc do cua oto sau khi tang len 10km/h la: ${this.speed}Km`);
  }
  brake() {
    this.speed -= 5;
    console.log(`toc do cua oto sau khi giam 5km/h la: ${this.speed}Km`);
  }
}
// TODO: 2. Dữ liệu kiểm tra
// Dữ liệu car 1: 'BMW' đi với tốc độ 120 km/h
console.log(
  "===========Dữ liệu car 1: 'BMW' đi với tốc độ 120 km/h==========="
);
//sử dụng toán tử "new" để tạo hàm
const carCl1 = new CarCl("BMW", 120);
carCl1.accelerate();
carCl1.brake();
carCl1.accelerate();
carCl1.brake();
console.log("       ============ Setter and Getter ==================");
console.log(carCl1.speedUS);
carCl1.speedUS = 200;
console.log(carCl1.speedUS);
carCl1.speedUS = 210;
console.log(carCl1.speedUS);
// Dữ liệu car 2: 'Mercedes' đi với tốc độ 95km/h
console.log("========Dữ liệu car 2: 'Mercedes' đi với tốc độ 95km/h==========");
const carCl2 = new CarCl("Mercedes", 95);
carCl2.accelerate();
carCl2.brake();
carCl2.accelerate();
carCl2.brake();
console.log("============ Lab 13.3: Tính kế thừa ==================");
// TODO:1. Nhiệm vụ của bạn
// Sử dụng hàm tạo để triển khai Xe điện (được gọi là 'EV') dưới dạng child "class" của 'Car'. Bên cạnh nhãn hiệu và tốc độ hiện tại,
//  'EV' còn có mức sạc pin hiện tại tính theo % (thuộc tính 'charge')
const EV = function (make, speed, charge) {
  //gọi lại hàm tạo này với con trỏ thís là của hàm "EV"
  Car.call(this, make, speed);
  //Thuộc tính
  this.charge = charge;
};
//kế thừa mọi phương thức và thuộc tính
EV.prototype = Object.create(Car.prototype);
//Triển khai phương thức 'chargeBattery' có đối số 'chargeTo' và đặt mức sạc pin thành 'chargeTo'
EV.prototype.chargeBattery = function (chargeTo) {
  this.charge = chargeTo;
};
// Triển khai phương thức 'accelerate' để tăng tốc độ của ô tô thêm 20 km/h và giảm 1% mức pin.
// Sau đó in ra thông báo như sau 'Tesla going at 140 km/h, with a charge of 22%'
//ghi đè
EV.prototype.accelerate = function () {
  this.speed += 20;
  this.charge--;
  console.log(
    `Tesla going at ${this.speed} km/h, with a charge of ${this.charge}%`
  );
};
console.dir(EV);
// TODO: 2. Dữ liệu kiểm tra
// Dữ liệu car 1: 'Tesla' đi với tốc độ 120 km/h, với mức sạc pin là 23%
const ev = new EV("Tesla", 120, 23);
ev.chargeBattery(10);
console.log("muc pin sau khi thay doi la: ", ev.charge);
ev.accelerate();
ev.accelerate();
ev.brake();

console.log("==============Lab 13.4: Tính kế thừa sử dụng ES6================");
class EV1 extends CarCl {
  #charge;
  constructor(make, speed, charge) {
    super(make, speed);
    this.charge = charge;
  }
  //ghi đè
  accelerate = function () {
    this.speed += 20;
    this.#charge--;
    console.log(
      `Tesla going at ${this.speed} km/h, with a charge of ${this.charge}%`
    );
  };
  chargeBattery(chargeTo) {
    this.#charge = chargeTo;
  }
  get getCharge() {
    return this.#charge;
  }
}

class EV2 extends CarCl {
  #charge;
  constructor(make, speed, charge) {
    super(make, speed);
    this.charge = charge;
  }
  //ghi đè
  accelerate = function () {
    this.speed += 20;
    this.#charge--;
    console.log(
      `Tesla going at ${this.speed} km/h, with a charge of ${this.charge}%`
    );
  };
  chargeBattery(chargeTo) {
    this.#charge = chargeTo;
  }
  get getCharge() {
    return this.#charge;
  }
}
// TODO: 2. Dữ liệu kiểm tra
// Dữ liệu car 1: 'Rivian' đi với tốc độ 120 km/h, với mức sạc pin là 23%
const rivian = new EV1("Rivian", 120, 23);
console.log(rivian);
rivian.chargeBattery(100)
console.log(`muc pin sau khi thay doi la: `,rivian.getCharge);
rivian.accelerate()
rivian.brake()

const rivian2 = new EV2("Rivian", 120, 23);

console.log(rivian2);
rivian2.chargeBattery(200)
console.log(`muc pin sau khi thay doi la: `,rivian2.getCharge);
rivian2.accelerate()
rivian2.brake()