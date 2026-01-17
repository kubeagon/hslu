public class VariableScope {

    static int x = 3; // Class scope is overwritten by local variables

    public static void main(String[] args) {

        int x = 1; // Local scope
        System.out.println("x is equal to: " + x + " within method main");

        doSomething();
    }

    static void doSomething() {

        int x = 2; // Local scope
        System.out.println("x is equal to: " + x + " within method doSomething");
    }
}