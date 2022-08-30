"use strict";
//TODO: 1. Tạo Class User

// Đầu tiên, bạn cần tạo một Class User để đại diện cho thông tin của người dùng. Class này sẽ gồm các trường cơ bản như sau:

// firstName và lastName (họ và tên người dùng)
// username
// password
class User {
  constructor(
    firstName,
    lastName,
    userName,
    password,
    pageSize = 5,
    category = "business"
  ) {
    // pageSize, category
    this.firstName = firstName;
    this.lastName = lastName;
    this.userName = userName;
    this.password = password;

    this.pageSize = pageSize;
    this.category = category;
  }
}
// TODO: 8. Hiển thị Todo List
//tạo một Class mới là Task để chứa các thông tin về Task trong Todo List
/**
 *  @param {*} task tên nhiệm vụ
 * @param {*} owner sở hữu
 * @param {*} isDone đã hoàn thành / chưa hoàn thành (bool)
 */
class Task {
  constructor(task, owner, isDone) {
    this.task = task; 
    this.owner = owner;  
    this.isDone = isDone;  
  }
}
