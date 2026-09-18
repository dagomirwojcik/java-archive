// Importing Libraries

import java.util.Random;


// The Guessing Game
public class NumberGuessingGame {

	private int numberToGuess;
	private int remainingAttempts;
	private boolean gameLoss;
	private boolean gameWon;

	public guessingGame() {
		Random digit = new Random();
		this.numberToGuess = digit.nextInt(100) + 1;
		this.remainingAttempts = 10;
		this.gameWon = false;
		this.gameLoss = false;
	}

	public int getRemainingAttempts() {
		return remainingAttempts;
	}

	public boolean isGameWon() {
		return gameWon;
	}

	public boolean isGameLost() {
		return gameLoss;
	}

	public void makeGuess(int guess) {
		if (gameLoss) {
			System.out.println("Game is over, you lost! The number was: " + numberToGuess);
			return;
		}

        remainingAttempts--;
        if (guess == numberToGuess) {
            System.out.println("Game is over, you won! The number was: " + numberToGuess);
            gameWon = true;
            gameLoss = true;
        } else if (guess > numberToGuess) {
            System.out.println("Too high!");
        } else {
            System.out.println("Too low!");
        }
        
        if (remainingAttempts == 0) {
            gameLoss = true;
            System.out.println("Game over! The correct number was " + numberToGuess);
        }
	}

}
