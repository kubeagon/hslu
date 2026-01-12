 // Ist syntaktisch korrekt

import java.util.Scanner;

public class Aufgabe5 {
    public static void main(String[] args) {

        // Variablen
        double guthaben;
        double zinsSatz;
        double guthabenMitZinsen;

        // Eingabe
        Scanner sc = new Scanner(System.in);
        System.out.print(" Geben Sie ein Guthaben ein : ");
        guthaben = sc.nextDouble();
        System.out.println(" Geben Sie den Zinssatz ein : ");
        zinsSatz = sc.nextDouble();

        // Verarbeitung
        guthabenMitZinsen = guthaben * (1 + zinsSatz / 100);
        zinsen = guthabenMitZinsen - guthaben;

        // Ausgabe
        System.out.println(" Guthaben nach einem Jahr : " + guthabenMitZinsen);
        System.out.println(" Ertrag nach einem Jahr : " + zinsen);
    }
}