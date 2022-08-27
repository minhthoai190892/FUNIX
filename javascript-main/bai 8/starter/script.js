'use strict';
const modal = document.querySelector('.modal');
const overlay = document.querySelector('.overlay');
const btnCloseModal = document.querySelector('.close-modal');
const showModal = document.querySelectorAll('.show-modal');

function closeModal() {
    modal.classList.add('hidden');
    overlay.classList.add('hidden');
  }
  function openModal() {
    modal.classList.remove('hidden');
    overlay.classList.remove('hidden');
  }
for (let index = 0; index < showModal.length; index++) {
  console.log(showModal[index]);
  showModal[index].addEventListener('click', openModal);
}
btnCloseModal.addEventListener('click', closeModal);
overlay.addEventListener('click', closeModal);


document.addEventListener("keydown",function (e) {
    console.log(e.key);
    if (e.key ==="Escape") {
        closeModal()
    }
})