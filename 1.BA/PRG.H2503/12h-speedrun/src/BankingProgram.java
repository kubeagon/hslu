import java.util.Scanner;

public class BankingProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // declare variables
        double balanceTotal = 0;
        double depositAmount= 0;
        double withdrawAmount = 0;
        boolean isRunning = true;

        do {

            // display menu
            System.out.println("#################");
            System.out.println(" Banking Program");
            System.out.println("#################");
            System.out.println("1. Show Balance #\n2. Deposit      #\n3. Withdraw     #\n4. Shutdown     #");
            System.out.println("#################");
            System.out.print("Enter your selection (1-4): ");
            int choice = sc.nextInt();

            // get and process users choice

            switch (choice) {

                case 1 -> showBalance(balanceTotal);
                case 2 -> balanceTotal += deposit(balanceTotal, depositAmount);
                case 3 -> balanceTotal = withdraw(balanceTotal, withdrawAmount);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid selection.");
            }

            System.out.println("Thank you for choosing MoneyBank West!");

        } while (isRunning);
    }

    static double showBalance(double balanceTotal) {

        System.out.println("#################");
        System.out.printf("The amount in your account is: %.2f\n", balanceTotal);
        return balanceTotal;
    }

    static double deposit(double balanceTotal, double depositAmount) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount you want to deposit: ");
        depositAmount = sc.nextDouble();
        double newBalance = balanceTotal + depositAmount;
        System.out.print("Transaction complete.\n");
        return newBalance;

    }

    static double withdraw(double balanceTotal, double withdrawAmount) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount you want to withdraw: ");
        withdrawAmount = sc.nextDouble();
        double newBalance = balanceTotal - withdrawAmount;
        System.out.print("Transaction complete.\n");
        return newBalance;

    }
}