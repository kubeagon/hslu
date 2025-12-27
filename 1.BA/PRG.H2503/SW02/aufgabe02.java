package ch.hslu.informatik.prg.block02.afg02;

import java.util.Scanner;

public class ProduktionsmaschinenBerechnung {
	
	public static void main(String[] args) {
		
		double machinenLeistung;
		double machinenKosten;
		double lohnKosten;
		double auftragsKosten;
		int stueckZahl;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Stück pro Stunde: ");
		machinenLeistung = sc.nextDouble();
		
		System.out.println("Machinenkosten pro Stunde: ");
		machinenKosten = sc.nextDouble();
		
		System.out.println("Lohnkosten pro Stunde: ");
		lohnKosten = sc.nextDouble();
		
		System.out.println("Fixkosten pro Auftrag: ");
		auftragsKosten = sc.nextDouble();
		
		System.out.println("Menge zu produzierenden Einheiten: ");
		stueckZahl = sc.nextInt();
		
		double auftragsDauer = stueckZahl / machinenLeistung;
		double produktionsKosten = (auftragsDauer * machinenKosten) + (auftragsDauer * lohnKosten) + auftragsKosten;
		
		double finalKosten = stueckZahl < 100 ? produktionsKosten * 1.2 :
							 stueckZahl > 1000 ? produktionsKosten * 0.95 :
						     produktionsKosten;
		
		System.out.println("Produktionskosten: " + finalKosten + " CHF");
			
		System.out.println("Produktionszeit: " + auftragsDauer + " h " );
		
	}

}
