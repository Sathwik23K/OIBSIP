import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int attempts = 0;
        int maxAttempts = 10; 
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between " + lowerBound + " and " + upperBound + ". Try to guess it.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == numberToGuess) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            } else if (userGuess < numberToGuess) {
                System.out.println("Higher! You've used " + attempts + " out of " + maxAttempts + " attempts.");
            } else {
                System.out.println("Lower! You've used " + attempts + " out of " + maxAttempts + " attempts.");
            }
        }

        if (attempts >= maxAttempts) {
            System.out.println("Sorry, you've used all your attempts. The correct number was: " + numberToGuess);
        }

        scanner.close();
    }
}
