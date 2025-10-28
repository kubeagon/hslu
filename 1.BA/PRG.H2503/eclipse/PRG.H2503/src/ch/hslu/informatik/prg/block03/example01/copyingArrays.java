package ch.hslu.informatik.prg.block03.example01;

public class copyingArrays {
	
	public static void main(String[] args) {
		
		int[] arrA = {1, 3, 5, 7, 9};
		int[] arrB = arrA; // This doesn't create a copy, it creates a new reference to the same array
		
		int[] arrC = arrA.clone();
		arrA[0] = 2; // We modify the value of index 0 in arrA
		
		System.out.println(arrB[0]); // arrB shows the modified value of arrA because it's the same array
		System.out.println(arrC[0]); // arrC shows the original value of arrA because it's a copy
		
	}
}
