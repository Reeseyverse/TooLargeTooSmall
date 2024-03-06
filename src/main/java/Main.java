import java.util.Scanner;
import java.util.Random;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        while (true) {


            int numGuess = 0; // Counts the number of guesses
            System.out.println("Pick a number between 1 and 100");
            int guess = scanner.nextInt(); // Reads the user's guess

            while (true) { // start of the game loop.

                int randomGuess = random.nextInt(101);
                // Make sure the user input a number in the right range


                if (randomGuess < 1 || randomGuess > 100) {
                    System.out.println("You've guessed outside the allowed range. Guess again!");
                    continue;
                }
                // checks for duplicate guesses
                if (randomGuess == guess) {
                    System.out.println("You've already guessed this number. " + numGuess);
                    break;
                }
                numGuess++;
                // Check the guess number to the Random number
                if (randomGuess > 1 && randomGuess < 50) { // Check if the guess is under 1
                    System.out.println("Too small!");
                } else if (randomGuess > 50) { // Check if guess is over 100
                    System.out.println("Too Large!");
                }
            }
            System.out.println("Would you like to continue. yes/no?");
            String a = scanner.next();
            if (a.equalsIgnoreCase("yes")) {
                continue;
            } else {
                break;
            }
        }
    }
}