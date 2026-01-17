public class LogicalOperators {

    public static void main(String[] args) {

        // && = AND
        // || = OR
        // ! = NOT

        double temperature = 25;
        boolean isSunny = true;
        boolean isRaining = true;

        // Check if temperature falls withing a specified range

        if (temperature <= 30 && temperature >= 15 && isSunny && !isRaining) {
            System.out.println("The temperature is nice!");
            System.out.println("It's Sunny!");
            System.out.println("It's not raining!");
        } else if (temperature <= 10 || isRaining) {
            System.out.println("The weather is not nice!");
        }
    }
}