import java.util.Arrays;

public class ArrayOperations
 {

    public static void main(String[] args) {

        String[] fruits = {"apple", "banana", "orange", "pineapple", "coconut"};

        // for (int i = 0; i < fruits.length; i++) {

        //     System.out.println(fruits[i]);
        // }

        // foreach loop

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Sorting arrays

        Arrays.sort(fruits);

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        String[] foods = new String[3];

        foods[0] = "pizza";
        foods[1] = "taco";
        foods[2] = "hamburger";

        for (String food : foods) {
            System.out.println(food);
        }

    }
}