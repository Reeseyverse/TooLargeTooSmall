import java.util.Scanner;
import java.util.Random;
/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner object to read user input
        Random random = new Random(); // Random object to generate random numbers

        while (true) { // Start of the outer loop for playing multiple rounds

            int numGuess = 0; // Initialize the count of guesses for this round
            System.out.println("Guess a number between 1 and 100");
            // The instruction seems misplaced; it should prompt for guessing, not picking the number.

            int guessNumber = random.nextInt(100) + 1; // Correctly generate a random number between 1 and 100 once per game session

            while (true) { // Start of the inner loop for guessing within a single game session

                int guess = scanner.nextInt(); // Read the user guess

                // Make sure the user input is within the allowed range
                if (guess < 1 || guess > 100) {
                    System.out.println("Your guess is outside range. Guess again!");
                    continue;
                }

                // Increment the guess counter
                numGuess++;

                // Compare the guess to the  guessnumber
                if (guess < guessNumber) {
                    System.out.println("Too small!"); // let the user know their guess is too low
                } else if (guess > guessNumber) {
                    System.out.println("Too large!"); // let the user know their guess is too high
                } else {
                    System.out.println("You've guessed correctly in " + numGuess + " attempts!");
                    break; // Exit the inner loop on correct guess
                }
            }

            System.out.println(" play again? yes/no?");
            String userResponse = scanner.next(); // Read the user decisions to continue or stop

            if (!userResponse.equalsIgnoreCase("yes")) {
                break; // Exit the outer loop
            }
            // If the user says yes, the loop continues
        }

        scanner.close(); // Close the scanner object to prevent resource leaks
    }
}