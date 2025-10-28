package ch.informatik.prg.block03.afgf16;

public class modulNotenArray {
	
	public static void main(String[] args) {
		
		double[] notenArray = {5, 4.5, 5, 6, 5, 5.5};
		
		double notenSumme = 0;
		
		int i = 0;
		int j = 0;
		
		for (i = 0; i < notenArray.length; i++) {
			
			notenSumme = notenSumme + notenArray[i];
			
		}
		
		double durchschnittsNote = notenSumme / notenArray.length;
		
		System.out.println(durchschnittsNote);	
		
		double[] halberArray = new double [notenArray.length / 2];
		
		for (i = 0; i < notenArray.length; i++) {
			
			if (i % 2 != 0) {
				
				halberArray[j] = notenArray[i];
				j++;
				
			}
			
		}
		
	}

}