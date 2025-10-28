package ch.hslu.prg.block04.demo01;

public class RaumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Raum audiMidi = new Raum();
		Raum audiMaxi = new Raum();
		Raum raum203 = new Raum();
		
		System.out.println();
		
		audiMidi.anzahlPlaetze = 115;
		audiMaxi.anzahlPlaetze = 300;
		
		audiMidi.klimatisiert = true;
		
		System.out.println("Anzahl Plaetze: " + audiMidi.anzahlPlaetze);

	}

}
