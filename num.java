import java.util.Random;
import java.util.Scanner;

public class NumberGuessingProgram {
    public static void main(String[] args) {
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1; // Generates a random number between 1 and 100
        int attempts = 0;
        boolean hasWon = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Program!");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Let's see if you can guess it!");

        while (!hasWon) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == targetNumber) {
                hasWon = true;
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
            } else if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }
    }
}