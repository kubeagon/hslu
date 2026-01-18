// javac Super.java Person.java; java Super

public class Super {

    public static void main(String[] args) {

        Person person = new Person("John", "Doe");
        person.showName();

        Doctor doctor = new Doctor("Jane", "Smith", "Dr.");
        doctor.showTitle();
    }
}