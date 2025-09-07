package exp1;
	import java.util.Scanner;
	import java.util.Random;
	public class NumberGuessingGame {
	    public static void main(String[] args) {
	        Random random = new Random();
	        int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
	        Scanner scanner = new Scanner(System.in);
	        int userGuess = 0;
	        System.out.println("Guess a number between 1 and 100:");
	        while (userGuess != numberToGuess) {
	            System.out.print("Enter your guess: ");
	            userGuess = scanner.nextInt();
	            if (userGuess < numberToGuess) {
	                System.out.println("Too Low");
	            } else if (userGuess > numberToGuess) {
	                System.out.println("Too High");
	            } else {
	                System.out.println("Correct Guess!");
	            }
	        }
	        scanner.close();
	    }
	}
