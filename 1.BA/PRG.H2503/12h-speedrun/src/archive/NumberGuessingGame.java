import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int randomNumber = random.nextInt(1, 1000);
        int attempts = 1;

        System.out.print("Guess the number: ");
        int guess = sc.nextInt();

        do {

            if (guess > randomNumber) {

                System.out.print("Too high, try again: ");

            } else if (guess < randomNumber) {

                System.out.print("Too low, try again: ");
            }
            guess = sc.nextInt();
            attempts++;

        } while (guess != randomNumber);
   
        System.out.print("Correct! You win!");
        System.out.printf(" You needed %d attempts!", attempts);
    }
}