let number = Math.trunc(Math.random() * 20) + 1;
let score = 20;
let hightScore = 0;
function displayMessage(message) {
  document.querySelector(".message").textContent = message;
}
console.log(number);
// document.querySelector(".number").textContent = number
document.querySelector(".check").addEventListener("click", function () {
  const inputNumber = Number(document.querySelector(".inputNumber").value);
  if (!inputNumber) {
    displayMessage("no number");
  } else if (inputNumber === number) {
    displayMessage("you win");
    if (score > hightScore) {
      hightScore = score;
      document.querySelector(".number").textContent = number;
      document.querySelector(".higtScore").textContent = hightScore;
    }

    document.querySelector("body").style.backgroundColor = "green";
    document.querySelector(".number").style.width = "30rem";
  } else {
    if (score > 1) {
      displayMessage(inputNumber > number ? "too hight" : "too low");
      score--;
      document.querySelector(".score").textContent = score;
    } else {
      displayMessage("you lost the game");
      document.querySelector(".score").textContent = 0;
    }
  }
});

document.querySelector(".again").addEventListener("click", function () {
  document.querySelector(".number").textContent = "?";
  document.querySelector(".inputNumber").value = "";
  score = 20;
  number = Math.trunc(Math.random() * 20) + 1;
  console.log(number);
  displayMessage("Start guessing...");
  document.querySelector("body").style.backgroundColor = "black";
  document.querySelector(".number").style.width = "15rem";
  document.querySelector(".score").textContent = score;
});
