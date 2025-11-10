# 14.1 Trennung von Spezifikation und Implementierung

Aufgabe 14.1 in Java als erste Programmiersprache

## Aufgabenstellung

Implementiere in der Klasse Person das Interface Testschnittstelle:

```java
public interface Testschnittstelle {
    public void print();
}
```

Die Methode `print()`soll die Werte aller Datenfelder eines Objekts ausgeben.

```java
import java.util.Scanner;

public class Person ... {
    private String name;
    private String vorname;
    public Person() {
        Scanner eingabe = new Scanner(System.in);
        try {
            System.out.print("\nGeben Sie den Nachnamen ein: ");
            name = eingabe.nextLine();

            System.out.print("\nGeben Sie den Vornamen ein: ");
            vorname = eingabe.nextLine();
        }
        catch(Exception e) {
            System.out.println("Eingabefehler");
            System.exit(1);
        }
    }
}
```

Verwende zum Testen die Klasse `TestPerson``

```java
public class TestPerson {
    public static void main(String[] args) {
        Person refPerson = new Person();
        refPerson.print();
    }
}

```
