import java.util.Scanner;
public class Aufgabe4 {
    public static void main(String[] args) {
        // Variablen
        double guthaben;
        double zinsSatz;
        double guthabenMitZinsen;
        // Eingabe
        Scanner sc = new Scanner(System.in);
        System.out.print ("Geben Sie ein Guthaben ein:");
        guthaben = sc.nextDouble();
        Scanner sc2 = new Scanner(System.in);
        System.out.print ("Geben Sie den Zinssatz ein:");
        zinsSatz = sc2.nextDouble();
        // Verarbeitung
        guthabenMitZinsen = guthaben * (1 + zinsSatz / 100);
        // Ausgabe
        System.out.println ("Zinsen im ersten Jahr: " + (guthabenMitZinsen - guthaben));
        System.out.println("Guthaben nach einem Jahr: " + guthabenMitZinsen);
    }
}