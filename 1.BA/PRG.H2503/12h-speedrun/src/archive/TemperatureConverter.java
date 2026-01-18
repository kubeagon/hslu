import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Converting from Celcius (C) or Farenheit (F)? ");
        String selection = sc.next().toUpperCase();

        System.out.print("Enter the temperature as a number: ");
        double temperature = sc.nextDouble();

        double convertedTemperature = (selection.equals("C")) ? temperature * (9.0 / 5.0) + 32 : (temperature - 32) * (5.0 / 9.0);

        String unit = (selection.equals("F")) ? "C" : "F";

        System.out.printf("%.1f%s", convertedTemperature, unit);

    }
}