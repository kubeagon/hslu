import java.util.Scanner;

public class persoenlichedaten {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Vorname: ");
            String vorname = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            if (email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
                System.out.println("Email ist gültig");
            } else {
                System.out.println("Email ist ungültig, Bitte erneut eingeben.");
                System.out.print("Email: ");
                email = sc.nextLine();
            }

            System.out.printf("\nName: %s, Vorname: %s, Email: %s\n", name, vorname, email);
    }   
}