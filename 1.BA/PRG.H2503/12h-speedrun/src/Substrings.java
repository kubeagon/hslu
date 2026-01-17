import java.util.Scanner;

public class Substrings {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your email address: ");
        String email = scanner.next();
        
        if (!email.contains("@")) {
            System.out.println("That is not a valid email address!");
        } else {

            String username = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@") + 1); // Plus 1 to remove the @

            System.out.println(username);
            System.out.println(domain);
        }
    }
}