import java.util.Scanner;

public class shoppingcart {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.println("What item would you like to buy? ");
        item = scanner.nextLine();

        System.out.println("What is the price for each? ");
        price = scanner.nextDouble();

        System.out.println("How many would you like to buy? ");
        quantity = scanner.nextInt();

        total = price * quantity;

        if (quantity > 1) {
            System.out.println("You have bought " + quantity + " " + item + "s." + " Your total is " + total);
        } else {
             System.out.println("You have bought " + quantity + " " + item + "." + " Your total is " + total);
        }

        scanner.close();
    }
}