"use strict";
//TODO: 1. Tạo Class User

// Đầu tiên, bạn cần tạo một Class User để đại diện cho thông tin của người dùng. Class này sẽ gồm các trường cơ bản như sau:

// firstName và lastName (họ và tên người dùng)
// username
// password
class User {
  constructor(firstName, lastName, username, password) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.username = username;
    this.password = password;
  }
}
