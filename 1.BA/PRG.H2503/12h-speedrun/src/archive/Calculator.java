import java.util.Scanner;

public class Calculator {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        double number1;
        double number2;
        char operator;
        double result = 0;
        boolean validOperator = true;

        System.out.print("Enter the first number: ");
        number1 = sc.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, ^): ");
        operator = sc.next().charAt(0);

        System.out.print("Enter the second number: ");
        number2 = sc.nextDouble();

        switch(operator) {
            case '+' -> result = number1 + number2;
            case '-' -> result = number1 - number2;
            case '*' -> result = number1 * number2;
            case '/' -> {
                if (number2 == 0) {
                    System.out.println("Cannot divide by 0.");
                    validOperator = false;
                } else {
                    result = number1 / number2;
                }
            }
            case '^' -> result = Math.pow(number1, number2);
            default -> {
                System.out.println("Invalid Operator");
                validOperator = false;
            }
        }

        if (validOperator) {
            System.out.println(result);
        }

        sc.close();

    }
}