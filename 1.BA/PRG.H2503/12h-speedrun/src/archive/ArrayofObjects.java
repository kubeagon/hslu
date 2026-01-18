public class ArrayofObjects {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("Corolla", "Red");
        Vehicle vehicle2 = new Vehicle("Civic", "Blue");
        Vehicle vehicle3 = new Vehicle("Mustang", "Black");

        Vehicle[] cars = {vehicle1, vehicle2, vehicle3};

        for (int i = 0; i < cars.length; i++) {
            cars[i].drive();
        }
    }
}