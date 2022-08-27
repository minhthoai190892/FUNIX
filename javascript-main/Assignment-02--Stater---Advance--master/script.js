"use strict";
// TODO: khai bao bien
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
// TODO: Validate dữ liệu hợp lệ

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

  // TODO: ID must unique!

  for (let index = 0; index < petArr.length; index++) {
    if (data.id === petArr[index].id) {
      alert("ID must unique!");
      isvalidate = false;
    }
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

  if (data.breed === "") {
    alert("Enter Breed");
    isvalidate = false;
  }

  return isvalidate;
}

// TODO: bắt sự kiện khi chọn inputType
typeInput.addEventListener("click", renderBreed);
function renderBreed() {
  breedInput.innerHTML = "<option>Select Breed</option>";

  // kiểm tra có phải "Dog" không
  if (typeInput.value === "Dog") {
    // duyệt mảng mới sau khi đã filter để lấy cat
    //Lọc danh sách chó và mèo
    const breedDog = breedArr.filter((petItem) => petItem.type === "Dog");
    breedDog.forEach((petItem) => {
      //tạo option
      const option = document.createElement("option");
      //đưa dữ liệu vào option
      option.innerHTML = `${petItem.breed}`;
      //hiển thị option lên trang web
      breedInput.appendChild(option);
    });
  }

  // kiểm tra có phải "Cat" không
  else if (typeInput.value === "Cat") {
    //Lọc danh sách chó và mèo
    const breedCat = breedArr.filter((petItem) => petItem.type === "Cat");
    // duyệt mảng mới sau khi đã filter để lấy cat
    breedCat.forEach((petItem) => {
      //tạo option

      const option = document.createElement("option");
      //đưa dữ liệu vào option
      option.innerHTML = `${petItem.breed}`;
      //hiển thị option
      breedInput.appendChild(option);
    });
  }
}
renderBreed();

// TODO:4. Thêm thú cưng vào danh sách
// const data1 = {
//   id: "P001",
//   petName: "Tom",
//   age: 3,
//   type: "Cat",
//   weight: 5,
//   length: 50,
//   color: "red",
//   breed: "Tabby",
//   vaccinated: true,
//   dewormed: true,
//   sterilized: true,
//   bmi: "?",
//   date: new Date(),
// };
// const data2 = {
//   id: "P002",
//   petName: "Tyke",
//   age: 5,
//   type: "Dog",
//   weight: 3,
//   length: 40,
//   color: "green",
//   breed: "Mixed Breed",
//   vaccinated: false,
//   dewormed: false,
//   sterilized: false,
//   bmi: "?",

//   date: new Date(),
// };
// petArr.push(data1);
// petArr.push(data2);
// console.log(petArr);

// TODO: 5. Hiển thị danh sách thú cưng
function renderTableData(petArr) {
  tableBodyEl.innerHTML = "";
  petArr.forEach(function(item) {
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
								<i class="bi bi-square-fill" style="color: ${item.color}"></i>
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

							<td><button class="btn btn-danger" onclick="deletePet('${
                item.id
              }')">Delete</button></td>
    `;
    tableBodyEl.appendChild(row);
  });
  // for (let index = 0; index < petArr.length; index++) {
  //   const row = document.createElement("tr");

  //   row.innerHTML = `
  //                           <th scope="row">${petArr[index].id}</th>
	// 						<td>${petArr[index].petName}</td>
	// 						<td>${petArr[index].age}</td>
	// 						<td>${petArr[index].type}</td>
	// 						<td>${petArr[index].weight} kg</td>
	// 						<td>${petArr[index].length} cm</td>
	// 						<td>${petArr[index].breed}</td>
	// 						<td>
	// 							<i class="bi bi-square-fill" style="color: ${petArr[index].color}"></i>
	// 						</td>
	// 						<td>
    

  //                           <i class="bi ${
  //                             petArr[index].vaccinated
  //                               ? "bi-check-circle-fill"
  //                               : "bi-x-circle-fill"
  //                           } "></i>
                            
  //                           </td>
	// 						<td><i class="bi ${
  //               petArr[index].dewormed
  //                 ? "bi-check-circle-fill"
  //                 : "bi-x-circle-fill"
  //             }"></i></td>
	// 						<td><i class="bi ${
  //               petArr[index].sterilized
  //                 ? "bi-check-circle-fill"
  //                 : "bi-x-circle-fill"
  //             }"></i></td>
							

	// 						<td>
  //                           ${displayTime(petArr[index].date).splice(8, 10)}
  //                           </td>

	// 						<td><button class="btn btn-danger" onclick="deletePet('${
  //               petArr[index].id
  //             }')">Delete</button></td>
  //   `;
  //   tableBodyEl.appendChild(row);
  // }
}
renderTableData(petArr);
// TODO: 6. Xóa các dữ liệu vừa nhập trên Form
function clearInput() {
  (idInput.value = ""),
    (nameInput.value = ""),
    (ageInput.value = ""),
    (typeInput.value = ""),
    (weightInput.value = ""),
    (lengthInput.value = ""),
    (colorInput.value = "#000000"),
    (breedInput.value = "Select Breed"),
    (vaccinatedInput.checked = false),
    (dewormedInput.checked = false),
    (sterilizedInput.checked = false);
}
// TODO: 7. Xóa một thú cưng
const deletePet = (petId) => {
  // Confirm before deletePet
  if (confirm("Are you sure?")) {
    // TODO: Thực hiện xóa dữ liệu
    // TODO: duyệt mảng
    for (let index = 0; index < petArr.length; index++) {
      // TODO:kiểm tra id trong mảng
      if (petId === petArr[index].id) {
        // TODO:xóa đối tượng trong mảng
        petArr.splice(index, 1);
        // TODO:cập nhật thú cưng
        saveToStorage("petArr", petArr);
        // TODO:gọi lại hàm render
        renderTableData(petArr);
      }
    }
  }
};
// TODO: 8. Hiển thị các thú cưng khỏe mạnh
const healthyBtn = document.getElementById("healthy-btn");
let healthyCheck = true;
healthyBtn.addEventListener("click", function () {
  const healthyPetArr = [];

  if (healthyCheck) {
    // TODO:  khi nhấp vào "" chuyển sang "Show All Pet."
    healthyBtn.textContent = "Show All Pet.";
    // TODO:  duyệt qua mảng
    for (let index = 0; index < petArr.length; index++) {
      // TODO: kiểm tra xem thú cưng có tiêm đủ vacxin

      if (
        petArr[index].vaccinated &&
        petArr[index].dewormed &&
        petArr[index].sterilized
      ) {
        // TODO: thú cưng tiêm đủ vac-xin thì đưa vào mảng
        healthyPetArr.push(petArr[index]);
      }
      // TODO:  hiển thị thú cưng khỏe mạnh với mảng healthyPetArr

      renderTableData(healthyPetArr);
    }
    healthyCheck = false;
  } else {
    // TODO:  khi nhấp vào "Show All Pet." chuyển sang "Show Healthy Pet"

    healthyBtn.textContent = "Show Healthy Pet.";
    // TODO:  hiển thị tất cả thú cưng, gọi lại hàm render với mãng petArr
    renderTableData(petArr);
    healthyCheck = true;
  }
});
// TODO: kiểm tra thú cưng đã tiêm đủ 3 lại vacxin

// TODO: 9. (Nâng cao) Tính toán chỉ số BMI
const bmiBtn = document.getElementById("bmi-btn");
// bmiBtn.addEventListener("click", function () {
//   // TODO:duyệt mảng petArr để tính BMI

// //   for (let index = 0; index < petArr.length; index++) {
// //     // TODO: tính BMI
// //     petArr[index].bmi =
// //       petArr[index].type === "Dog"
// //         ? ((petArr[index].weight * 703) / petArr[index].length ** 2).toFixed(2)
// //         : ((petArr[index].weight * 886) / petArr[index].length ** 2).toFixed(2);
//   }
//   // TODO: Hiển thị lại danh sách thú cưng

// //   renderTableData(petArr);
// });
// TODO: Button Submit

submitBtn.addEventListener("click", function () {
  // TODO: 2. Lấy được dữ liệu từ các Input Form

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
    date: new Date(),
  };

  const validate = validateDate(data);

  if (validate) {
    // TODO: 4. Thêm thú cưng vào danh sách
    petArr.push(data);
    // TODO: 6. Xóa các dữ liệu vừa nhập trên Form
    clearInput();
    // TODO: lưu dữ liệu

    saveToStorage("petArr", petArr);
    // TODO: 5. Hiển thị danh sách thú cưng
    renderTableData(petArr);
  }
  console.log(data);
});
