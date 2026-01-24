public abstract class Haustier {

    static String name = "Beispiel";

    static void melden() {

    }

    static String getName() {
        return name;
    }

    static String setName(String name) {
        Haustier.name = name;
        return name;
    }
}