package ch.hslu.informatik.prg.block02.afg03;

import java.util.Scanner;

public class EndKapitalRechner {
	
	public static void main ( String [] args ) {
	/* Scanner erstellen */
	Scanner sc = new Scanner(System.in);
	/* Startkapital einlesen */
	System.out.print("Bitte Startkapital eingeben:" );
	double startKapital = sc.nextDouble();
	/* Zinssatz einlesen */
	System.out.print("Bitte Zinssatz in Prozent eingeben:" );
	double zinsSatz = sc.nextDouble();
	/* Anzahl Jahre einlesen */
	System.out.print("Bitte Anzahl Jahre eingeben:" );
	int anzahlJahre = sc.nextInt();
	/* Endkapital berechnen und Ausgeben */
	double endKapital = startKapital * Math.pow ((1 + zinsSatz / 100), anzahlJahre);
	System . out . println ("\nEndkapital: " + endKapital );
	}
}
