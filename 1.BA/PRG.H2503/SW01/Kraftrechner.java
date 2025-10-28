import java.util.Scanner;

public class Kraftrechner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masse: ");
        double masse = sc.nextDouble();

        // Kraft berechnen
        double kraft = masse * 9.81;

        // Ausgabe
        System.out.println("Kraft: " + kraft);

        System.out.printf("\nKraft: %.2f\n", kraft); // %.2f = 2 after comma digits
    }
}