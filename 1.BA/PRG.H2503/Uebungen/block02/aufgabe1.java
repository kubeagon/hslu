public class aufgabe1 {
    public static void main(String[] args) {
        int vertragLaufzeit = 36;
        double zinsSatz = 4.85;
        double kreditSumme = 23859.00;
        double abschlussKosten = 259.00;

        // Gesamtkredit inkl. Abschlusskosten
        double restSchuld = kreditSumme + abschlussKosten;
        
        // Monatlicher Zinssatz (Jahreszins / 12)
        double monatZins = (zinsSatz / 100) / 12;
        
        // Feste monatliche Tilgung
        double tilgung = restSchuld / vertragLaufzeit;
        
        int monat = 1;
        while (monat <= vertragLaufzeit) {
            // Zinsen für diesen Monat auf die Restschuld
            double zinsBetrag = restSchuld * monatZins;
            
            // Monatsrate = Tilgung + Zinsen
            double monatsRate = tilgung + zinsBetrag;
            
            // Restschuld reduzieren
            restSchuld = restSchuld - tilgung;
            
            System.out.println("Monat " + monat + ": Rate = " + String.format("%.2f", monatsRate) + " CHF");
            
            monat = monat + 1;
        }
    }
}