// javac Constructors.java Students.java; java Constructors

public class Constructors {

    public static void main(String[] args){

        Students student1 = new Students("Spongebob", 20, 2.0);
        Students student2 = new Students("Patrick", 25, 1.5);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);
        System.out.println();
        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student1.isEnrolled);

    }
}