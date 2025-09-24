package ch.hslu.informatik.prg.block02.towarmup.afg03;

public class OutputDemo {
	
	public static void main(String[] args) {
		// Variablen für zwei ganze Zahlen definieren
		// int a = 5, b = 10;
		// Summe der beiden Zahlen ausgeben : Variante 1
		// System.out.println("Summe: " + a + b);
		// Summe der beiden Zahlen ausgeben : Variante 2
		// System.out.println("Summe: " + (a + b));
		// Summe der beiden Zahlen ausgeben : Variante 3
		// int summe = a + b;
		// System.out.println("Summe : " + summe);
		// Summe der beiden Zahlen ausgeben : Variante 4
		// System.out.println(a + " + " + b + " = " + (a + b));
		
		int a = 64, b = 8, c = 2, d = 3, e = 4;
		int q = a / b * e - b / c * d;
		System.out.println("q: " + q); // q:
		boolean r = a > b && b > d | --d % 2 == 0;
		System.out.println("r: " + r); // r:
		boolean s = a < b && ++c > e;
		System.out.println("s: " + s); // s:
		System.out.println("c: " + c); // c:
		boolean t = a < b & ++c > e;
		System.out.println("t: " + t); // t:
		System.out.println("c: " + c); // c:
	}
}
