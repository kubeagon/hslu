// javac OverloadedConstructors.java User.java; java OverloadedConstructors

public class OverloadedConstructors {

    public static void main(String[] args){

        User user1 = new User("Spongebob");
        User user2 = new User("Patrick", "patrick@example.com", 30);

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println();
        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);
    }
}