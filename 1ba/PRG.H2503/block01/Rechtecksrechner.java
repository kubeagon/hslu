// Rechtecksrechner
// Presentation - Block 01

import java.util.Scanner;

public class Rechtecksrechner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Breite: ");
        int breite = sc.nextInt();

        System.out.print("Höhe: ");
        int hoehe = sc.nextInt();

        // Flaeche berechnen
        int flaeche = breite * hoehe;

        // Umfang berechnen
        int umfang = 2 * (breite + hoehe);

        System.out.println("Fläche: " + flaeche);
        System.out.println("Umfang: " + umfang);

        System.out.println();

        System.out.printf("Fläche: %d, Umfang: %d\n", flaeche, umfang); // %d = integer
    }
}