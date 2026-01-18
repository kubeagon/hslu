public class Vehicle {
    
    String make;
    String color;

    Vehicle(String make, String color) {
        this.make = make;
        this.color = color;
    }

    void drive() {
        System.out.println("The " + this.color + " " + this.make + " is driving.");
    }
}