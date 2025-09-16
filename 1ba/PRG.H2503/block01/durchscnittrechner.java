import java.util.Scanner;

public class durchschnittrechner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Note PRG: ");
        double notePRG = sc.nextDouble();

        System.out.print("Note MAT: ");
        double noteMAT = sc.nextDouble();

        System.out.print("Note ICF: ");
        double noteICF = sc.nextDouble();

        System.out.print("Note NW1: ");
        double noteNW1 = sc.nextDouble();

        System.out.print("Note SPT: ");
        double noteSPT = sc.nextDouble();

        double durchschnitt = (notePRG + noteMAT + noteICF + noteNW1 + noteSPT) / 5;

        System.out.printf("\nDurchschnitt: %.2f\n", durchschnitt);
    }
}