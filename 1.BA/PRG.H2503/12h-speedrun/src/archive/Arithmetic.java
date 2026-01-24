public class Arithmetic {
    public static void main(String[] args) {
        int x = 5, y = 10, z = 3, k = 1;
        double a = 9, b = 3, c = 2;

        // Addition
        int sum = x + y + z;
        System.out.println("Sum: " + sum);

        // Subtraction
        int difference = x - y;
        System.out.println("Difference: " + difference);

        // Multiplikation
        int product = x * y * z;
        System.out.println("Product: " + product);

        // Division
        double quotient = a / b / c;
        System.out.println("Quotient: " + quotient);

        // Modulo
        int modulo = y % x;
        System.out.println("Modulo Result: " + modulo);

        // Augmented Assignement Operators
        // Works like this for all operators

        // Sum
        int augmentedSum = x += y;
        System.out.println("Augmented Sum: " + augmentedSum);

        // Difference
        int augmentedDifference = x -= y;
        System.out.println("Augmented Difference: " + augmentedDifference);


        // Increment and Decrement Operators

        k =- 1 ;
        System.out.println("Incremented k: " + k);
        k -= 1 ;
        System.out.println("Incremented k: " + k);

        // Increment by 1
        x++;
        System.out.println("Incremented x: " + x);

        // Decrement by 1 (was incremented before)
        x--;
        System.out.println("Decremented x again: " + x);

        // Order of Operations P-E-M-D-A-S
        // Parentheses - Exponents - Multiplikaton - Division - Addition - Subtraktion
        double result = 3 + 4 * (7 - 5) / 2.0;
        System.out.println("Result with P-E-M-D-A-S: " + result);
    }
}