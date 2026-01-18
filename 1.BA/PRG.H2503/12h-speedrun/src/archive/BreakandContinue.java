public class BreakandContinue {

    public static void main(String[] args) {

        int i;
        int j;

        for (i = 0; i < 10; i++) {

            if (i == 5) {
                break;
            }

            System.out.print(i + " ");
        }

        System.out.println();

        for (j = 0; j < 10; j++) {

            if (j == 5) {
                continue;
            }

            System.out.print(j + " ");
        }
    }
}