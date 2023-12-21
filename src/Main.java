import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100); // Generate random number between 0 and 99

        Scanner sc = new Scanner(System.in);

        boolean guessed = false; // Flag to track if the number is guessed

        while (!guessed) { // Keep looping until the number is guessed
            System.out.println("Guess a number between 0 and 99:");
            int guess = sc.nextInt();

            if (guess == number) {
                System.out.println("Congratulations, you guessed it!");
                guessed = true; // Set flag to true to exit the loop
            } else if (guess < number) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }

        sc.close(); // Close the scanner to avoid resource leaks
    }
}
