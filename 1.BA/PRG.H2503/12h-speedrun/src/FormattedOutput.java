public class FormattedOutput {
    public static void main(String[] args) {

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n" , name);
        System.out.printf("Your name starts with a %c\n" , firstLetter);
        System.out.printf("You are %d years old\n" , age);
        System.out.printf("You are %f centimeters tall\n", height);
        System.out.printf("Employed: %b" , isEmployed);
    }
}