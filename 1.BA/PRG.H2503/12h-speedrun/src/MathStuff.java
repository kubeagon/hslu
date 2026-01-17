public class MathStuff {
    public static void main(String[] args) {

        // Print the value of pi

        double pi = Math.PI;
        System.out.println("PI is equal to: " + pi);

        // Eulers Constant
        System.out.println(Math.E);

        // Operations using the math class
        // Exponents
        double result;

        result = Math.pow(2,3);
        System.out.println(result);

        // Absolute value
        result = Math.abs(-5); // distance from 0
        System.out.println(result);

        // Square root
        result = Math.sqrt(9);
        System.out.println(result);

        // Round
        result = Math.round(3.14);
        System.out.println(result);

        // Round up
        result = Math.ceil(3.14);
        System.out.println(result);

        // Round down
        result = Math.floor(3.99);
        System.out.println(result);

        // Maximum value between two numbers
        result = Math.max(5, 10);
        System.out.println(result);

        // Minimum value between two numbers
        result = Math.min(5, 10);
        System.out.println(result);
    }
}