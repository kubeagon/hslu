public class Laserdrucker implements Drucker {

    public void drucken(String druckRef) {
        System.out.println("Drucker" + druckRef + " meldet sich.");
        System.out.println("Das Drucken wird simuliert");
        System.out.println("Dies ist ein Test");
    }
}