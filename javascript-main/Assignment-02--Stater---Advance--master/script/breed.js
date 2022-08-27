"use strict";

const submitBtn = document.getElementById("submit-btn");
const inputBreed = document.getElementById("input-breed");
const inputType = document.getElementById("input-type");
const tbodyEl = document.getElementById("tbody");
    // TODO: kiểm tra dữ liệu người dùng nhập

function validationData(data) {
  let isvalidation = true;
  if (data.breed === "") {
    alert("Enter Breed");
    isvalidation = false;
  }
  if (data.type === "") {
    alert("Enter Type");
    isvalidation = false;
  }
  return isvalidation;
}
    // TODO:  hiển thị danh sách thú cưng trên table

function renderTableBreed(breedArr) {
  tbodyEl.innerHTML = "";
  //duyệt qua mảng để lấy danh sách thú cưng
  breedArr.forEach((item, index) => {
    //tạo "tr" trong table
    const row = document.createElement("tr");
    row.innerHTML = `
        <th scope="row">${index + 1}</th>
        <td scope="col">${item.breed}</td>
        <td scope="col">${item.type}</td>
        <td><button class="btn btn-danger" onclick="deleteBreed('${
          item.breed
        }')">Delete</button></td>
        `;
    tbodyEl.appendChild(row);
  });
}
renderTableBreed(breedArr);
    // TODO:  xóa các dữ liệu vừa nhập trên form

function clearInput() {
    inputBreed.value="",
    inputType.value=""
}
    // TODO:  xóa giống thú cưng

function deleteBreed(breed) {
  console.log(breed);
  if (confirm("Are you sure?")) {
    for (let index = 0; index < breedArr.length; index++) {
      //kiểm tra gióng thú cưng
      if (breed === breedArr[index].breed) {
        //xóa thú cưng 
        breedArr.splice(index, 1);
        //cập nhật lại danh sách thú cưng trong localStorega
        saveToStorage("breedArr", breedArr);
        // hiển thị lại danh sách thú cưng lên table
        renderTableBreed(breedArr);

        break;
      }
    }
  }
}
    // TODO:  bắt sự kiện "submit"

submitBtn.addEventListener("click", function () {
  //tạo đối tự "data"
  const data = {
    breed: inputBreed.value,
    type: inputType.value,
  };
  console.log(data.breed);
  //khai báo biến = hàm validationData
  const validation = validationData(data);

  if (validation) {
    //đưa dữ liệu vào mảng breedArr
    breedArr.push(data);
    //cập nhật lại mảng ở localStorega
    saveToStorage("breedArr", breedArr);
    // hiển thị danh sách thú cưng lên table
    renderTableBreed(breedArr);
    // xóa dữ liệu đã nhập ở form
    clearInput();
  }
  console.log(breedArr);
});

