'use strict';
//TODO: selecting elements
const player0El = document.querySelector('.player--0');
const player1El = document.querySelector('.player--1');
console.log(player0El);
const score0El = document.getElementById('score--0');
const score1El = document.getElementById('score--1');
const current0El = document.getElementById('current--0');
const current1El = document.getElementById('current--1');
const diceEl = document.querySelector('.dice');
const btnNew = document.querySelector('.btn--new');
const btnRoll = document.querySelector('.btn--roll');
const btnHold = document.querySelector('.btn--hold');

let currentScore, activePlayer, playing,scores;
//TODO: starting conditions
function init() {
  currentScore = 0;
  activePlayer = 0;
  playing = true;
   scores = [0, 0];
  score0El.textContent = 0;
  score1El.textContent = 0;
  current0El.textContent = 0;
  current1El.textContent = 0;
  player0El.classList.remove('player--winner');
  player1El.classList.remove('player--winner');
  player0El.classList.add('player--active');
  player1El.classList.remove('player--active');
}
init()
//TODO: switch to next player
function switchPlayer() {
  document.getElementById(`current--${activePlayer}`).textContent = 0;
  currentScore = 0;
  activePlayer = activePlayer === 0 ? 1 : 0;
  player0El.classList.toggle('player--active');
  player1El.classList.toggle('player--active');
}
diceEl.classList.add('hidden');
//TODO: Rolling dice  functionality
btnRoll.addEventListener('click', function () {
  if (playing) {
    //TODO: Generating a random dice roll
    const dice = Math.trunc(Math.random() * 6) + 1;
    console.log(dice);
    //TODO: display dice
    diceEl.classList.remove('hidden');
    diceEl.src = `dice-${dice}.png`;
    //TODO: check for rolled 1: if true, switch to next player
    if (dice !== 1) {
      //TODO: add dice to current score
      currentScore += dice;

      document.getElementById(`current--${activePlayer}`).textContent =
        currentScore;
    } else {
      switchPlayer();
    }
  }
});

btnHold.addEventListener('click', function () {
  if (playing) {
    //TODO: 1. add current score to active player's score
    scores[activePlayer] += currentScore;
    document.getElementById(`score--${activePlayer}`).textContent =
      scores[activePlayer];

    console.log(scores[activePlayer]);
    //TODO: 2. check if player's score >=100
    if (scores[activePlayer] >= 20) {
      playing = false;
      diceEl.classList.add('hidden');


      
      //TODO: 2.1 finish the game
      document
        .querySelector(`.player--${activePlayer}`)
        .classList.add(`player--winner`);
      document
        .querySelector(`.player--${activePlayer}`)
        .classList.remove(`player--active`);
    } else {
      //TODO: switch to next player
      switchPlayer();
    }
  }
});

btnNew.addEventListener('click', init);
