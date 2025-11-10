import java.util.Scanner;

public class Person implements Testschnittstelle {
    private String name;
    private String vorname;
    public Person() {
        Scanner eingabe = new Scanner(System.in);
        try {
            System.out.print("\nGeben Sie den Nachnamen ein: ");
            name = eingabe.nextLine();

            System.out.print("\nGeben Sie den Vornamen ein: ");
            vorname = eingabe.nextLine();
        }
        catch(Exception e) {
            System.out.println("Eingabefehler");
            System.exit(1);
        }
    }
    public void print() {
        System.out.println("\nName: " + name + ", Vorname: " + vorname);
    }
}