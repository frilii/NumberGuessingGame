import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100); 

        Scanner sc = new Scanner(System.in);

        boolean guessed = false; 

        while (!guessed) {
            System.out.println("Adivinhe um número entre 0 e 99:");
            int guess = sc.nextInt();

            if (guess == number) {
                System.out.println("Parabéns, você acertou!");
                guessed = true; 
            } else if (guess < number) {
                System.out.println("Muito baixo!");
            } else {
                System.out.println("Muito alto!");
            }
        }

        sc.close(); 
    }
}
