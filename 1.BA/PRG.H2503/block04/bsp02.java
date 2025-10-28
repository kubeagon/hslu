public class Demo {

    public static void main(String[] args) {
        // TODO: Code vervollständigen …
        int alter = 15;
        boolean res = isAdult(alter);
        System.out.println("Ist " + alter + " Jahre alt? " + res);

        // alternativ
        boolean res2 = isAdult(20);
        System.out.println("Erwachsen? " + res2);
    }

    public static boolean isAdult(int years) {
        return years >= 18;
    }

    public static int getMaxElement(int[] arr) {
        int max = arr[0];
        // Implementierung (hier nicht von Interesse) …
        return max;
    }

    public static int[] getEvenNumbers(int[] arr) {
        int[] arrEvenNumbers = null;
        // Implementierung (hier nicht von Interesse) …
        return arrEvenNumbers;
    }
}