	import java.util.Random;
	import java.util.Scanner;

	// Guessing Game Class
	class GuessingGame {
	    private int targetNumber;
	    private int attemptsLeft;
	    private boolean isGameOver;
	    private boolean isGameWon;

	    public GuessingGame() {
	        Random rand = new Random();
	        this.targetNumber = rand.nextInt(100) + 1;
	        this.attemptsLeft = 10;
	        this.isGameOver = false;
	        this.isGameWon = false;
	    }

	    public int getAttemptsLeft() {
	        return attemptsLeft;
	    }

	    public boolean isGameOver() {
	        return isGameOver;
	    }

	    public boolean isGameWon() {
	        return isGameWon;
	    }

	    public void makeGuess(int guess) {
	        if (isGameOver) {
	            System.out.println("Game is over. The number was: " + targetNumber);
	            return;
	        }
	        
	        attemptsLeft--;
	        if (guess == targetNumber) {
	            System.out.println("Correct! You win!");
	            isGameWon = true;
	            isGameOver = true;
	        } else if (guess > targetNumber) {
	            System.out.println("Too high!");
	        } else {
	            System.out.println("Too low!");
	        }
	        
	        if (attemptsLeft == 0) {
	            isGameOver = true;
	            System.out.println("Game over! The correct number was " + targetNumber);
	        }
	    }
	}
