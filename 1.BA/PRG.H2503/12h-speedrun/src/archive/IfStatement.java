import java.util.Scanner;

public class ifstatement {
    public static void main(String[] args) {
        
        int age;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your age? ");
        age = scanner.nextInt();

        if(age >= 18 && age < 65) {
            System.out.println("You are an adult.");
        } else if (age <= 0) {
            System.out.println("You haven't been born yet");
        } else if (age < 18 ){
            System.out.println("You are a child.");
        } else if (age >= 65) {
            System.out.println("You are a senior.");
        }
    }
}