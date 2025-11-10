public class Faxgeraet implements Fax {
    public void senden(String sendeRef) {
        System.out.println("Absender ist: " + sendeRef);
        System.out.println("Das Senden wird simuliert");
        System.out.println("Dies ist ein Test");
    }
}