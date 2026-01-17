public class StringMethods {

    public static void main(String[] args) {

        String name = "  Kubelize  ";

        int length = name.length();
        char letter = name.charAt(5);
        int index = name.indexOf("e");
        int lastIndex = name.lastIndexOf("e");

        name = name.trim();
        name = name.toUpperCase();
        System.out.println(name);
        name = name.toLowerCase();
        System.out.println(name);

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name.isEmpty());

        if (name.contains("o")) {
            System.out.println("The name contains the letter 'o'.");
        } else {
            System.out.println("The name does not contain the letter 'o'.");
        }

        if (name.equals("johnny")) {
            System.out.println("The name is Johnny.");
        } else {
            System.out.println("The name is not Johnny.");
        }
    }
}