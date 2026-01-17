public class Methods {

    public static void main(String[] args) {

        // String name = "John";
        // int age = 16;

        // happyBirthday(name, age);

        double result = square(19);
        System.out.println(result);
    }

    static void happyBirthday(String name, int age) { // Due to it being executed in main, it needs to be static aswell

        System.out.println("Happy Birthday to you!");
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s", name);
        System.out.println("Happy Birthday to you!");
        System.out.printf("You are %d years old!", age);        
    }

    static double square(double number) {

        return number * number;
    }
}
