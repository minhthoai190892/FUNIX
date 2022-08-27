'use strict';
// console.log(document.querySelector(".message").textContent);
// document.querySelector(".message").textContent ="Correct Number"
// console.log(document.querySelector(".message").textContent );

// document.querySelector(".number").textContent=13;
// document.querySelector(".score").textContent=20
// // TODO: input =value
// // TODO: input =value

// document.querySelector(".guess").value =23
// console.log(document.querySelector(".guess").value);
// TODO: tao so bi an
let secretNumber = Math.trunc(Math.random() * 20) + 1;
let score = 20;
let highscore = 0;
function displayMessage(message) {
    document.querySelector(".message").textContent=message
}
// document.querySelector('.number').textContent = secretNumber;
console.log(secretNumber);
// TODO: lay du lieu nhap vao
document.querySelector('.check').addEventListener('click', function () {
  const guess = Number(document.querySelector('.guess').value);
  // TODO: nguoi dung khong nhap

  if (!guess) {
    // document.querySelector('.message').textContent = 'No number 🥵';
    // console.log('No number 🥵');
    displayMessage('No number 🥵')
  }
  // TODO: nguoi dung win
  else if (guess === secretNumber) {
    // document.querySelector('.message').textContent = 'Correct number ';
    displayMessage('Correct number ')

    document.querySelector('body').style.backgroundColor = 'green';
    document.querySelector('.number').style.width = '30rem';
    if (score > highscore) {
      highscore = score;
      document.querySelector('.highscore').textContent = highscore;
      document.querySelector('.number').textContent = secretNumber;
    }
  } else if (guess !== secretNumber) {
    if (score > 1) {
    //   document.querySelector('.message').textContent =
    //     guess > secretNumber ? 'Too Hight' : 'Too Low';
        displayMessage( guess > secretNumber ? 'Too Hight' : 'Too Low')
    score--;
      document.querySelector('.score').textContent = score;
    } else {
      document.querySelector('.message').textContent = 'you lost the game';
      document.querySelector('.score').textContent = 0;
    }
  }
});
document.querySelector('.again').addEventListener('click', function () {
  score = 20;
  secretNumber = Math.trunc(Math.random() * 20) + 1;
  secretNumber = Math.trunc(Math.random() * 20) + 1;
    console.log(secretNumber);
  document.querySelector('.message').textContent = 'Start guessing...';
  document.querySelector('.score').textContent = score;
  document.querySelector('.number').textContent = '?';
  document.querySelector('.guess').value = '';
  document.querySelector('body').style.backgroundColor = '#222';
  document.querySelector('.number').style.width = '15rem';
});

document.querySelector('.input').addEventListener('click', function () {
  let text = document.querySelector('.text').value;
  if (text == '') {
    document.querySelector('.error').textContent = 'error';
  } else {
    document.querySelector('.error').textContent = '';

    console.log(text);
  }
});
