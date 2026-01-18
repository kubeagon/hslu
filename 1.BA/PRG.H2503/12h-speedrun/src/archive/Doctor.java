public class Doctor extends Person {

    String title = "Dr.";

    Doctor(String first, String last, String title) {

        super(first, last);
        this.title = title;
    }

    void showTitle() {
        System.out.println(this.title+ " " + this.first + " " + this.last);
    }
}