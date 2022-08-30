"use strict";
if (currentUser) {
  const inputTask = document.getElementById("input-task");
  const todoList = document.getElementById("todo-list");
  const btnAdd = document.getElementById("btn-add");

  //   TODO: hàm hiển thị "todoList"
  /**
   * Hiển thị thông tin các "Todo" trên ứng dụng
   */
  function displayTodoLists() {
    let html = "";

    todoArr
      .filter((todo) => todo.owner.userName === currentUser.userName) //lọc ra toàn bộ "task" là "currentUser" đang đăng nhập để hiển thị lên trang
      .forEach(function (todo) {
        //
        html += `<li class=${todo.isDone ? "checked" : ""}>${
          todo.task
        }<span class="close">×</span></li>`;
      });

    // for (let index = 0; index < todoArr.length; index++) {
    //   console.log(todoArr[index].task);
    // }
    todoList.innerHTML = html;
    eventToggleTasks();
    eventDeleteTasks();
  }
  //   TODO: bắt sự kiện "click" vào các "task"
  function eventToggleTasks() {
    //lấy tất cả các phần tử "li" chứa thông tin của các "task" và bắt sự kiện "click" trên từng "li"
    document.querySelectorAll("#todo-list li").forEach(function (liEl) {
      //với mỗi phần tử trong array ta sẽ thêm sự kiện "click" vào

      liEl.addEventListener("click", function (e) {
        //kiểm tra xem sự kiện "click" có được "click" vào "x" không
        // liEl.children[0] === "x"
        // loại bỏ không "click" và "x"
        if (e.target !== liEl.children[0]) {
          //thêm / xóa "checked" khi ta "click" vào
          liEl.classList.toggle("checked");
          //tìm "task" vừa "click" vào
          const todo = todoArr.find(
            (todoItem) =>
              //lộc các nhiệm vụ của "currentUser"
              todoItem.owner.userName === currentUser.userName &&
              //lấy nội dung "task" loại bỏ "x"
              todoItem.task === liEl.textContent.slice(0, -1)
          );
          //sau đó thay đổi thuộc tính "isDone" của "task" đã "click"
          //kiểm tra "task" có chứa "checked" hay không
          todo.isDone = liEl.classList.contains("checked") ? true : false;
          //sau đó lưu xuống "localStorega"
          saveToStorage("todoArr", todoArr);
          console.log(todo);
        }
      });
    });
  }
  //   TODO: bắt sự kiện "delete"
  function eventDeleteTasks() {
    //lấy tất cả các phần tử nút "delete" => bắt sự kiện "click" trên từng phần tử "x"
    document.querySelectorAll("#todo-list .close").forEach(function (closeEl) {
      //thêm sự kiện "click" vào các phần tử
      closeEl.addEventListener("click", function () {
        //kiểm tra xem người dùng có muốn xóa không
        if (confirm("bạn có muốn xóa nhiệm vụ không?")) {
          // tìm vị trí của "task" được "click" xóa trong mảng todoArr
          const index = todoArr.findIndex(
            (item) =>
              item.owner.userName === currentUser.userName && //xác nhận "task" của "currentUser"
              item.task === closeEl.parentElement.textContent.slice(0, -1) //dòng này xác định tên task và so sánh
          );//=> trả về một vị trí của "task"
          //sau đó ta xóa "task" đó ra khỏi mảng todoArr
          todoArr.splice(index, 1);
          //cập nhật dữ liệu xuống localStorage
          saveToStorage("todoArr", todoArr);
          //hiển thị lại danh sách
          displayTodoLists();
        }
      });
    });
  }

  //   TODO: gọi hàm "displayTodoLists" để hiển thị
  displayTodoLists();
  // TODO: bắt sự kiện nhập "Add" khi nhập "Task"
  btnAdd.addEventListener("click", function () {
    //kiểm tra người dùng có nhập "task" không
    if (inputTask.value.trim().length === 0) {
      alert("nhập nhiệm vụ");
    } else {
      //người dùng nhập "task" rồi
      const todo = new Task(inputTask.value, currentUser, false);
      //thêm "task" mới vào "todoArr"
      todoArr.push(todo);
      //lưu xuống "localStorage"
      saveToStorage("todoArr", todoArr);
      //hiển thị lại danh sách nhiệm vụ
      displayTodoLists();
      //xóa dữ liệu ở "input"
      inputTask.value = "";
    }
  });
} else {
  alert("Vui lòng đăng nhập /  đăng ký để truy vập vào ứng dụng");
  window.location.href = "../index.html";
}
