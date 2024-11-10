let time = 30 * 60; // 30 minutes in seconds
let isActive = false;
let interval = null;

const timerDisplay = document.getElementById("timer");
const startButton = document.getElementById("start");
const resetButton = document.getElementById("reset");
const treeStatusDisplay = document.getElementById("tree-status");

function updateTimerDisplay() {
    const minutes = Math.floor(time / 60);
    const seconds = time % 60;
    timerDisplay.textContent = `${minutes}:${seconds < 10 ? '0' + seconds : seconds}`;
}

function startTimer() {
    if (!isActive) {
        isActive = true;
        interval = setInterval(() => {
            if (time > 0) {
                time--;
                updateTimerDisplay();
            } else {
                clearInterval(interval);
                treeStatusDisplay.textContent = "Tree Status: Withered";
                isActive = false;
            }
        }, 1000);
    }
}

function resetTimer() {
    clearInterval(interval);
    time = 30 * 60;
    isActive = false;
    updateTimerDisplay();
    treeStatusDisplay.textContent = "Tree Status: Growing";
}

startButton.addEventListener("click", startTimer);
resetButton.addEventListener("click", resetTimer);

updateTimerDisplay();