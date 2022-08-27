"use strict";
const submitBtn = document.getElementById("submit-btn");

const idInput = document.getElementById("input-id");
const nameInput = document.getElementById("input-name");
const ageInput = document.getElementById("input-age");
const typeInput = document.getElementById("input-type");
const weightInput = document.getElementById("input-weight");
const lengthInput = document.getElementById("input-length");
const colorInput = document.getElementById("input-color-1");
const breedInput = document.getElementById("input-breed");
const vaccinatedInput = document.getElementById("input-vaccinated");
const dewormedInput = document.getElementById("input-dewormed");
const sterilizedInput = document.getElementById("input-sterilized");
const tableBodyEl = document.getElementById("tbody");
const formEl = document.getElementById("container-form");
// TODO: hiển thị thú cưng
function renderTableData(petArr) {
  tableBodyEl.innerHTML = "";
  petArr.forEach(function (item) {
    const row = document.createElement("tr");

    row.innerHTML = `
                                      <th scope="row">${item.id}</th>
                                      <td>${item.petName}</td>
                                      <td>${item.age}</td>
                                      <td>${item.type}</td>
                                      <td>${item.weight} kg</td>
                                      <td>${item.length} cm</td>
                                      <td>${item.breed}</td>
                                      <td>
                                          <i class="bi bi-square-fill" style="color: ${
                                            item.color
                                          }"></i>
                                      </td>
                                      <td>
                                      <i class="bi ${
                                        item.vaccinated
                                          ? "bi-check-circle-fill"
                                          : "bi-x-circle-fill"
                                      } "></i>
                                      
                                      </td>
                                      <td><i class="bi ${
                                        item.dewormed
                                          ? "bi-check-circle-fill"
                                          : "bi-x-circle-fill"
                                      }"></i></td>
                                      <td><i class="bi ${
                                        item.sterilized
                                          ? "bi-check-circle-fill"
                                          : "bi-x-circle-fill"
                                      }"></i></td>
                                      
          
                                      <td>
                                      ${displayTime(item.date).slice(8,10)} / ${displayTime(item.date).slice(5,7)} / ${displayTime(item.date).slice(0,4)}

                                      </td>
          
                                      <td><button class="btn btn-warning" onclick="editPet('${
                                        item.id
                                      }')">Edit</button></td>
              `;
    tableBodyEl.appendChild(row);
  });

  //   for (let index = 0; index < petArr.length; index++) {
  //     const row = document.createElement("tr");

  //     row.innerHTML = `
  //                               <th scope="row">${petArr[index].id}</th>
  //                               <td>${petArr[index].petName}</td>
  //                               <td>${petArr[index].age}</td>
  //                               <td>${petArr[index].type}</td>
  //                               <td>${petArr[index].weight} kg</td>
  //                               <td>${petArr[index].length} cm</td>
  //                               <td>${petArr[index].breed}</td>
  //                               <td>
  //                                   <i class="bi bi-square-fill" style="color: ${
  //                                     petArr[index].color
  //                                   }"></i>
  //                               </td>
  //                               <td>

  //                               <i class="bi ${
  //                                 petArr[index].vaccinated
  //                                   ? "bi-check-circle-fill"
  //                                   : "bi-x-circle-fill"
  //                               } "></i>

  //                               </td>
  //                               <td><i class="bi ${
  //                                 petArr[index].dewormed
  //                                   ? "bi-check-circle-fill"
  //                                   : "bi-x-circle-fill"
  //                               }"></i></td>
  //                               <td><i class="bi ${
  //                                 petArr[index].sterilized
  //                                   ? "bi-check-circle-fill"
  //                                   : "bi-x-circle-fill"
  //                               }"></i></td>

  //                               <td>
  //                               ${petArr[index].date.getDay()}
  //                               </td>

  //                               <td><button class="btn btn-warning" onclick="editPet('${
  //                                 petArr[index].id
  //                               }')">Edit</button></td>
  //       `;
  //     tableBodyEl.appendChild(row);
  //   }
}
// TODO: bắt sự kiện Type
typeInput.addEventListener("click", renderBreed);

function renderBreed() {
  breedInput.innerHTML = "<option>Select Breed</option>";

  if (typeInput.value === "Dog") {
    const breedDog = breedArr.filter((petItem) => petItem.type === "Dog");
    breedDog.forEach(function (item) {
      //tạo option
      const option = document.createElement("option");
      // đưa dữ liệu vào option
      option.innerHTML = `${item.breed}`;
      //hiển thị option lên trang web
      breedInput.appendChild(option);
    });
  } else if (typeInput.value === "Cat") {
    const breedCat = breedArr.filter((item) => item.type === "Cat");
    breedCat.forEach(function (item) {
      const option = document.createElement("option");
      option.innerHTML = `${item.breed}`;
      breedInput.appendChild(option);
    });
  }
}

renderTableData(petArr);
// TODO: Sự kiện "Edit"
function editPet(id) {
  //hiển thị form dữ liệu khi nhấn "Edit"
  formEl.classList.remove("hide");
  //tìm id của thú cưng
  const pet = petArr.find((petItem) => petItem.id === id);
  //hưởng thị thông tin thú cưng lên form
  idInput.value = id;
  nameInput.value = pet.petName;
  ageInput.value = pet.age;
  typeInput.value = pet.type;
  weightInput.value = pet.weight;
  lengthInput.value = pet.length;
  colorInput.value = pet.color;
  vaccinatedInput.checked = pet.vaccinated;
  dewormedInput.checked = pet.dewormed;
  sterilizedInput.checked = pet.sterilized;
  //gọi hàm renderBreed để lấy thông tin breed
  renderBreed();
  //hiển thị dữ liệu loại giống thú cưng sau khi đã phân loại thú cưng
  breedInput.value = pet.breed;
  console.log(pet);
}

// TODO: Sự kiện "Submit"
submitBtn.addEventListener("click", function () {
  const data = {
    id: idInput.value,
    petName: nameInput.value,
    age: parseInt(ageInput.value),
    type: typeInput.value,
    weight: parseInt(weightInput.value),
    length: parseInt(lengthInput.value),
    color: colorInput.value,
    breed: breedInput.value,
    vaccinated: vaccinatedInput.checked,
    dewormed: dewormedInput.checked,
    sterilized: sterilizedInput.checked,
    // date: new Date(),
  };

  const validate = validateDate(data);

  if (validate) {
    //tìm vị trí của thú cưng trong mảng
    const petIndex = petArr.findIndex((item) => item.id === data.id);
    //
    // không thay đổi ngày nhập thú cưng
    //thêm thuộc tính "date" và data và gán giá trị cho "date" bằng với dữ liệu lưu trong localStorega
    data.date = petArr[petIndex].date;

    //cập nhật dữ liệu của thú cưng trong petArr
    petArr[petIndex] = data;

    // TODO: lưu dữ liệu

    saveToStorage("petArr", petArr);
    // TODO: 5. Hiển thị danh sách thú cưng
    renderTableData(petArr);
    formEl.classList.add("hide");
  }
});

function validateDate(data) {
  // TODO: Không có trường nào bị nhập thiếu dữ liệu.
  let isvalidate = true;
  if (data.id.trim() === "") {
    alert("Enter id");
    isvalidate = false;
  }
  if (data.petName === "") {
    alert("Enter Pet Name");
    isvalidate = false;
  }
  if (isNaN(data.age)) {
    alert("Enter Age");
    isvalidate = false;
  }

  if (isNaN(data.weight)) {
    alert("Enter weight");
    isvalidate = false;
  }
  if (isNaN(data.length)) {
    alert("Enter length");
    isvalidate = false;
  }
  // TODO: Age must be between 1 and 15!
  if (data.age < 1 || data.age > 15) {
    alert("Age must be between 1 and 15!");
    isvalidate = false;
  }
  // TODO: Weight must be between 1 and 15!
  if (data.weight < 1 || data.weight > 15) {
    alert("Weight must be between 1 and 15!");
    isvalidate = false;
  }
  // TODO: Length must be between 1 and 100!
  if (data.length < 1 || data.length > 100) {
    alert("Length must be between 1 and 100!");
    isvalidate = false;
  }
  // TODO: Please select Type!
  if (data.type === "") {
    alert("Enter Type");
    isvalidate = false;
  }
  // TODO: Please select Breed!

  if (data.breed === "Select Breed") {
    alert("Enter Breed");
    isvalidate = false;
  }

  return isvalidate;
}
