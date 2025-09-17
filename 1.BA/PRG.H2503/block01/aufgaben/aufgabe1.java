// Aufgabe 1: Rechtecksberechnung
// Presentation - Block 01

import java.util.Scanner;

public class aufgabe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Geben Sie die Breite des Rechtecks ein: ");
        double breite = scanner.nextDouble();
        
        System.out.print("Geben Sie die Höhe des Rechtecks ein: ");
        double hoehe = scanner.nextDouble();
        
        double flaeche = breite * hoehe;
        
        double umfang = 2 * (breite + hoehe);
        
        System.out.println("\nErgebnisse für das Rechteck:");
        System.out.println("Fläche: " + flaeche);
        System.out.println("Umfang: " + umfang);
        
        scanner.close();
    }
}