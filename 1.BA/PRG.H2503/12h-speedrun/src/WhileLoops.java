import java.util.Scanner;

public class WhileLoops {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = "";

        while (name.isEmpty()) {
            System.out.print("Enter your name: ");
            name = sc.nextLine();
        }

        System.out.println("Hello " + name + "!");


        sc.close();

        
    }
}