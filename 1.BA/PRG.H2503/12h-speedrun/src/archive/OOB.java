// javac OOB.java Car.java; java OOBj

public class OOB {

    public static void main(String[] args) {

        Car car = new Car();

        car.isRunning = true;

        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);
        car.drive();
    }
}