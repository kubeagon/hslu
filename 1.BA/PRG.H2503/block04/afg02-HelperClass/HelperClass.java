package ch.hslu.informatik.prg.block04.afg02;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class HelperClass {

    public static void main(String[] args) {
        // TODO - für jede der in dieser Klasse enthaltenen Methoden
        // einen sinnvollen Aufruf implementieren.
    	
    	System.out.println("Created Array");
    	int arr[] = create(100,2,7);
    	System.out.println();
    	
    	System.out.println("Showing contents of Array");
    	show(arr);
    	System.out.println();
    	System.out.println();
    	
    	System.out.println("Finding smallest double");
    	min(2,3,5);
    	System.out.println();
    	
    	
    }

    /**
     * Zeigt den Inhalt des übergebenen Arrays auf dem Bildschirm an.
     * @param stringArray das Array
     */
    public static void show(Object array) {
    	
    	int length = Array.getLength(array);
    	
        
    	for (int i = 0; i < length ; i++) {
    		
    		Object element = Array.get(array, i);
    		System.out.print(element);
    		
    	}
    }

    /**
     * Erstellt ein Array mit der spezifizierten Länge und initialisiert
     * es mit den int-Werten, die sich in dem durch die Parameter from
     * und to definierten Bereich befinden.
     * @param length die Länge des Arrays
     * @param from die untere Grenze des Bereichs
     * @param to die obere Grenze des Bereichs
     * @return das Array
     */
    public static int[] create(int length, int from, int to){

    	int[] array = new int[length];
    	Random random = new Random();
    	
    	for (int i = 0; i < length; i++) {
    		
    		array[i] = random.nextInt(to - from + 1) + from;
    		
    	}
    	
        return array;
    }

    /**
     * Liefert den kleinsten der übergebenen Werte (Minimum) zurück.
     * @param a der erste Wert
     * @param b der zweite Wert
     * @param c der dritte Wert
     * @return der kleinste Wert (Minimum)
     */
    public static double min(double a, double b, double c) {
    	
    	boolean aMin = (a < b && a < c);
    	boolean bMin = (b < a && b < c);
    	boolean cMin = (c < a && c < b);
    	
    	double d;
    	
    	if (aMin == true) {
    		d = a;
    	}
    	else if (bMin == true) {
    		d = b;
    	}
    	else {
    		d = c;
    	}
    	
    	System.out.println(d);
    	
    	return d;
    		
    }

    /**
     * Liest einen int-Wert von der Tastatur und liefert ihn zurück.
     * @return der eingelesene int-Wert
     */
    public static int readInt() {
        // Implementierung ...
        return 0;
    }

    /**
     * Liest einen int-Wert von der Tastatur und liefert ihn zurück.
     * @param message die Meldung, die vor dem Einlesen angezeigt wird
     * @return der eingelesene int-Wert
     */
    public static int readInt(String message) {
        // Implementierung ...
        return 0;
    }

    /**
     * Fügt die beiden übergebenen Arrays zusammen und liefert das
     * resultierende Array zurück.
     * @param firstArray das erste Array
     * @param secondArray das zweite Array
     * @return das resultierende Array
     */
    public static double[] merge(double[] firstArray, double[] secondArray) {
        // Implementierung ...
        return null;
    }

    /**
     * Sagt, ob der übergebene value-Wert in dem übergebenen Array enthalten ist.
     * @param arr das Array
     * @param value der Wert, für den bestimmt werden soll, ob er enthalten ist
     * @return true, wenn enthalten; false sonst
     */
    public static boolean contains(int[] arr, int value) {
        // Implementierung ...
        return false;
    }
}
