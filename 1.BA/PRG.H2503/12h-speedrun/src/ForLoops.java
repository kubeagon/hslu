import java.util.Scanner;

public class ForLoops {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many times you want to loop: ");
        int loops = sc.nextInt();

        System.out.print("How many seconds should each loop sleep for? ");
        int sleep = sc.nextInt();

        sc.close();

        for (int i = 0; i < loops; i++) {
            
            System.out.println(i);
            Thread.sleep(sleep * 1000);

        }
    }
}