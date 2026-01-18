public class User {

    String username;
    String email;
    int age;

    User(String username) {

        this.username = username;
        this.email = "Not Provided";
        this.age = 0;
    }

    User(String username, String email, int age) {

        this.username = username;
        this.email = email;
        this.age = age;
    }
}