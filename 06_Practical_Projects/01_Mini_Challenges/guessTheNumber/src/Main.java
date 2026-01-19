import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;

        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println("Try to guess the number between 1 and 100.");

        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        do {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                hasGuessedCorrectly = true;
            } else if (userGuess < randomNumber) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }

        } while (!hasGuessedCorrectly);


        scanner.close();
    }
}
