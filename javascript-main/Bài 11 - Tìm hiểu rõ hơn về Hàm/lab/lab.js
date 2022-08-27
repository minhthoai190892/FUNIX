"use strict";
const btn = document.querySelector(".btn");

const poll = {
  question: "What is your favourite programming language? ",
  options: ["0: JavaScript", "1: Python", "2: Rust", "3: C++"],
  numberOfVotes: new Array(4).fill(0),
};
poll.registerNewAnswer = function () {
  let answer = Number(
    prompt(
      `${this.question} \n ${this.options.join(
        "\n"
      )} \n\n (Write option number)`
    )
  );
  // kiem tra nguoi dung nhap gia tri co hop le khong
  while (isNaN(answer) || answer < 0 || answer > 3) {
    alert("Câu trả lời không hợp lệ");
    answer = prompt(
      `${this.question} \n ${this.options.join(
        "\n"
      )} \n\n (Write option number)`
    );
  }
  this.numberOfVotes[answer]++;
};
poll.displayResults = function (type = "array") {
  if (type === "string") {
    console.log(`Poll results are ${this.numberOfVotes.join(`, `)}`);
  } else if ((type = "array")) {
    console.log(this.numberOfVotes);
  }
};
btn.addEventListener("click", function () {
  poll.registerNewAnswer.call(poll);
  poll.displayResults.call(poll);
});

//du lieu
const dulieu1 = { numberOfVotes: [5, 2, 3] };
const dulieu2 = { numberOfVotes: [1, 5, 3, 9, 6, 1] };
poll.displayResults.call(dulieu1);
poll.displayResults.call(dulieu1, "string");
poll.displayResults.call(dulieu2);
poll.displayResults.call(dulieu2, "string");
