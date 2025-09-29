package ch.hslu.informatik.prg.block02.afg05;

public class booleanCalc {
	
	public static void main(String[] args) {
	
	boolean a = false , b = true , c = true , d = false , v = false;
	int p = 9, q = 10;
	// Ausdruck A
	d = !b; // d =
	// Ausdruck B
	v = !a || b && d || !c && !b; // v =
	System.out.println(v);
	
	// Ausdruck C
	v = a && b && (p++ < q); // v = p = q =
	// Ausdruck D
	v = a || b && (p++ < q); // v = p = q =
	
	}
}