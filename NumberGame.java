import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Number Game!");
        System.out.println("I have selected a random number between 1 and 100.");

        int randomNumber = random.nextInt(100) + 1;
        int userGuess;
        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        while (!hasGuessedCorrectly) {
            System.out.print("Your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == randomNumber) {
                hasGuessedCorrectly = true;
            } else if (userGuess < randomNumber) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }
        }

        System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
    }
}
