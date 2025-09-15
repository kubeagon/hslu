public class Aufgabe3 {
    public static void main(String[] args) {
        // Variablen
        double guthaben = 1000;
        int zinsSatz = 3;
        double guthabenMitZinsen;
        // Verarbeitung
        guthabenMitZinsen = guthaben * (1 + zinsSatz / 100);
        // Ausgabe
        System.out.println ( guthabenMitZinsen );
    }
}