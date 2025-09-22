package ch.hslu.informatik.prg.block02.towarmup.afg03;

public class OutputDemo {
	
	public static void main(String[] args) {
		// Variablen für zwei ganze Zahlen definieren
		int a = 5, b = 10;
		// Summe der beiden Zahlen ausgeben : Variante 1
		System.out.println("Summe: " + a + b);
		// Summe der beiden Zahlen ausgeben : Variante 2
		System.out.println("Summe: " + (a + b));
		// Summe der beiden Zahlen ausgeben : Variante 3
		int summe = a + b;
		System.out.println("Summe : " + summe);
		// Summe der beiden Zahlen ausgeben : Variante 4
		System.out.println(a + " + " + b + " = " + (a + b));
	}
}
