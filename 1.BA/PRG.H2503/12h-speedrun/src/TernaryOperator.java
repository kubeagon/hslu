public class TernaryOperator {

    public static void main(String[] args) {

        // variable = (condition) ? ifTrue : ifFalse;

        int score = 70;

        if (score >= 66) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        String passOrFail = (score >= 66) ? "Pass" : "Fail";
        System.out.println(passOrFail);
    }
}