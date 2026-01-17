import java.util.Scanner;
// Import-Anweisungen
public class Notenrechner {
	public static void main(String[] args) {
		// TODO 1 - Noten einlesen
		double[] noten = notenEinlesen();
	  // TODO 2 - Noten ausgeben
		notenAnzeigen(noten);
		// TODO 3 - Durchschnittsnote rechnen
		double durchschnitt = berechneDurchschnitt(noten);
    // TODO 4 - Durchschnittsnote ausgeben
		System.out.println(durchschnitt);
	}
	// TODO 5 - Methode 'notenAnzeigen' implementieren
	public static void notenAnzeigen(double[] noten) {
		for (int i = 0; i < noten.length; i++) {
			System.out.println("Note " + (i + 1) + ": " + noten[i]);
		} 
	}

  // TODO 6 - Methode 'berechneDurchschnitt' implementieren
	public static double berechneDurchschnitt(double[] noten) {
		double summe = 0;
		for (int i = 0; i < noten.length; i++) {
			summe += noten[i];
		}
    return summe / noten.length;
	}

	private static double[] notenEinlesen() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Anzahl Noten eingeben: ");
		int anzahl = sc.nextInt();
		double[] arr = new double[anzahl];
		// Noten werden eingelesen …
		return arr;
	}
}