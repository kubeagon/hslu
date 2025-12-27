package ch.hslu.informatik.prg.block04.afg01;

public class Modul {
	
	String nummer;
	String leitung;
	String ort;
	int etcsPunkte;
	String unterrichtsSprache;
	
	@Override
	public String toString() {
		
        return "{\n" +
                "  \"nummer\": \"" + nummer + "\",\n" +
                "  \"leitung\": \"" + leitung + "\",\n" +
                "  \"ort\": \"" + ort + "\",\n" +
                "  \"etcsPunkte\": " + etcsPunkte + ",\n" +
                "  \"unterrichtsSprache\": \"" + unterrichtsSprache + "\"\n" +
                "}";
	}
	
}
