import java.util.Scanner;

public class WeightConverter {

        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose which conversion method");
        System.out.println("1. kg to lbs\n2. lbs to kg");

        int selection = sc.nextInt();

        if (selection == 1) {

            System.out.print("Enter the weight in kg: ");
            double weightKg = sc.nextDouble();

            double weightLbs = weightKg * 2.20462;
            System.out.printf("\n%.2f lbs", weightLbs);
        } else if (selection == 2) {

            System.out.print("Enter the weight in lbs: ");
            double weightLbs = sc.nextDouble();

            double weightKg = weightLbs / 2.20462;
            System.out.printf("\n%.2f kg", weightKg);
        } else {

            System.out.println("The selection is not valid, please enter 1 or 2.");
        }        
    }
}