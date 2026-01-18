public class TwoDArrays {

    public static void main(String[] args) {

        String[] vegetables = {"onion", "cucumber", "celery" };
        String[] meats = {"chicken", "beef", "pork"};
        String[] fruits = {"apple", "banana", "pear"};

        String[][] groceries = {fruits, vegetables, meats};

        // replace apple with pineapple

        groceries[0][0] = "pineapple";

        for (String[] items : groceries) {

            for (String element : items) {
                System.out.println(element);
            }
        }

    }
}