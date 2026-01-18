public class OverloadedMethods {

    public static void main(String[] args) {

        double result = add(1, 2, 3);
        System.out.println(result);

    }

    static double add(double a, double b) {

        return a + b;
    }

    static double add(double a, double b, double c) {

        return a + b + c;
    }
}