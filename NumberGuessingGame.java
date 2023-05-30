import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        while (true) {
            System.out.print("Enter your guess between " + lowerBound + " and " + upperBound + ": ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == targetNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
                System.out.println("Number of attempts: " + attempts);
                break;
            } else if (guess < targetNumber) {
                System.out.println("Your guess is lower than the target number.");
            } else {
                System.out.println("Your guess is higher than the target number.");
            }
        }

        scanner.close();
    }
}
