public class Car {

    String make = "Mini";
    String model = "Cooper";
    int year = 2022;
    boolean isRunning = false;
    double price = 38900;

    void start() {

        System.out.println("You start the engine.");
        isRunning = true;
    }

    void stop() {

        System.out.println("You stop the engine.");
        isRunning = false;
    }

    void drive() {

        System.out.println("You drive the " + model + ".");
    }

}