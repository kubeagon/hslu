package ch.hslu.informatik.prg.block02.afg01;

public class KreditZahlung {
	
	public static void main(String[] args) {
		
		int laufZeit = 36;
		double kreditBetrag = 23859.00;
		double zinsSatz = 4.85;
		double abschlussKosten = 259;
		
		double totalBetrag = kreditBetrag / 100 * (100 + zinsSatz);
		double monatsRate = totalBetrag / laufZeit;
		
		System.out.println("Monatsrate: " + monatsRate);
	}

}
