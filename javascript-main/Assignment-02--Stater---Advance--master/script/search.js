"use strict";
const findBtn = document.getElementById("find-btn");

const idInput = document.getElementById("input-id");
const nameInput = document.getElementById("input-name");
const typeInput = document.getElementById("input-type");
const breedInput = document.getElementById("input-breed");
const vaccinatedInput = document.getElementById("input-vaccinated");
const dewormedInput = document.getElementById("input-dewormed");
const sterilizedInput = document.getElementById("input-sterilized");

const tbodyEl = document.getElementById("tbody");



function renderTabeSearch(petArr) {
  tbodyEl.innerHTML = "";
  petArr.forEach(function (item) {
    const row = document.createElement("tr");
    row.innerHTML = `
        <th scope="row">${item.id}</th>
        <td>${item.petName}</td>
        <td>${item.age}</td>
        <td>${item.type}</td>
        <td>${item.weight}</td>
        <td>${item.length}</td>
        <td>${item.breed}</td>
        <td> <i class="bi bi-square-fill" style="color: ${item.color}"></i></td>
          <td>
          <i class="bi ${
            item.vaccinated ? "bi-check-circle-fill" : "bi-x-circle-fill"
          } "></i>
          
          </td>
          <td><i class="bi ${
            item.dewormed ? "bi-check-circle-fill" : "bi-x-circle-fill"
          }"></i></td>
          <td><i class="bi ${
            item.sterilized ? "bi-check-circle-fill" : "bi-x-circle-fill"
          }"></i></td>
          

          <td>
          ${displayTime(item.date).slice(8,10)} / ${displayTime(item.date).slice(5,7)} / ${displayTime(item.date).slice(0,4)}

          </td>

       `;
    tbodyEl.appendChild(row);
  });
}
renderTabeSearch(petArr);
// TODO:Ham hiển thị breed
function renderBreed() {
  breedArr.forEach(function(item) {
    const option = document.createElement("option");
    option.innerHTML = `${item.breed}`;
    breedInput.appendChild(option);
  });
}
renderBreed()

// TODO:bắt sự kiện click vào "Find"
findBtn.addEventListener("click", function () {
  // nếu người dùng không nhập gì thì vãn hiển thị dữ liệu
  // nếu người dùng có nhập dữ liệu tìm kiếm và các fill trên form thì bắt đầu sét điều kiện để tìm kiếm

  // tạo biến chứa mãng petArr 
  let petArrIndex = petArr;
  //  nếu nhập vào id thì tìm theo id
  if (idInput.value) {
    //dùng hàm filter để lọc thú cưng  sau đó kiểm tra một chuổi có tồn tại không
    petArrIndex = petArrIndex.filter((pet) => pet.id.includes(idInput.value));
  }
  //  nếu nhập vào name thì tìm theo name

  if (nameInput.value) {
    petArrIndex = petArrIndex.filter((pet) => pet.petName.includes(nameInput.value));
  }
  //  nếu nhập vào type thì tìm theo type
  if (typeInput.value !=="Select Type") {
    petArrIndex = petArrIndex.filter((pet) => pet.type.includes(typeInput.value));

  }
  //  nếu nhập vào breed thì tìm theo breed
  if (breedInput.value !=="Select Breed") {
    petArrIndex = petArrIndex.filter((pet) => pet.breed.includes(breedInput.value));

  }
  //  nếu người dùng check vào Vaccinated tìm Vaccinated
  if (vaccinatedInput.checked === true) {
    petArrIndex = petArrIndex.filter(pet=>pet.vaccinated===true)
  }
  //  nếu người dùng check vào Dewormed tìm Dewormed
  if (dewormedInput.checked === true) {
    petArrIndex = petArrIndex.filter(pet=>pet.dewormed===true)
  }  //  nếu người dùng check vào Sterilized tìm Sterilized
  if (sterilizedInput.checked === true) {
    petArrIndex = petArrIndex.filter(pet=>pet.sterilized===true)
  }
 return renderTabeSearch(petArrIndex)
});
