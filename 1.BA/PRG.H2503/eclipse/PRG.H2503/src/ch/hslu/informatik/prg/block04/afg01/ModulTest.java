package ch.hslu.informatik.prg.block04.afg01;

public class ModulTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Modul prg = new Modul();
		Modul dmathAlgo = new Modul();
		
		prg.nummer = "I.BA_PRG.H2503";
		prg.leitung = "Prof. Jordan Sucur";
		prg.ort = "Vor Ort mit Aufzeichhnung";
		prg.etcsPunkte = 6;
		prg.unterrichtsSprache = "Deutsch";
		
		dmathAlgo.nummer = "I.BA_DMATH-ALGO.H2501";
		dmathAlgo.leitung = "Dr. Reto Berger";
		dmathAlgo.ort = "Vor Ort mit Streaming";
		dmathAlgo.etcsPunkte = 6;
		dmathAlgo.unterrichtsSprache = "Deutsch";
		
		System.out.println(prg);
		System.out.println(dmathAlgo);

	}

}
