# Java Basics

Zeichenvorrat: ASCII und ISO-Latin-1 (ISO 8859-1)

Zeichensatz: Unicode mit Format UTF-16 (2 Bytes oder 4 Bytes pro Zeichen)

## Kommentare

Einzeilige Kommentare:

```java
    // This is an inline comment
```

Mehrzeilige Kommentare:

```java
    /*
        This is a comment block
    */
```

Dokumentationslommentare:

```java
    /**
    *   This a documentation comment in java
    */
```

## Konstanten

Symbolische Konstante:

```java
final int MINIMUM = 10;
```

Literale Konstante:

```java
double endZahl = 10;
```

## Datentypen in Java

![alt text](datentypen.png)

### Wertebereich (Byte)

- 8 Bits bedeutet 2^8 = 256 Kombinationen von 1 und 0
- Dies wird für den Positiven und Negativen Bereich halbiert (128 Kombinationen)
- Null wird dem positiven Bereich zugeteil (-128 bis +127)

## Arithmetische Operatoren

![alt text](arithmetisch.png)

## Logische Operatoren

![alt text](logisch.png)

## Relationale Operatoren

![alt text](relational.png)

## Typumwandelung (Typecast)

Implizite Typumwandlung: (Implizit nur wenn von einem "engeren" Typ zu einem "breiteren")

```java
public class ImplicitCastExample {
    public static void main(String[] args) {
        int x = 10;
        double y = x; // implicit cast from int to double

        System.out.println("x = " + x); // 10
        System.out.println("y = " + y); // 10.0
    }
}
```

Explizite Typumwandelung: (Muss verwendet werden wenn)

```java
public class ExplicitCastExample {
    public static void main(String[] args) {
        double a = 9.7;
        int b = (int) a; // explicit cast from double to int

        System.out.println("a = " + a); // 9.7
        System.out.println("b = " + b); // 9 (decimal part is cut off)
    }
}
```


## Auswertungsreihenfolge & Assoziativitätsregeln

### Assoziativität

- linksassoziaztive Operatoren
    - Prä- und Postfix-Inkrement und -Dekrement (++a, a++, --a, a--)
    - Vorzeichen
    - Logisches Nicht (Negation)
    - Typumwandelung (Type Casting)
    - Bedingungsoperator (?)
    - Zuweisungen

- rechtsassoziative Operatoren
    - alle anderen Operatoren

### Reihenfolge

1. Indexoperator, Methodenaufruf, Komponentenzugriff
2. Prä- und Postfix-Inkrement und -Dekrement, Vorzeichen, logisches Nicht
3. Typecast
4. Multiplikation, Division, Restwert
5. Addition, Subtraktion, Stringverkettung (Concat)
6. ...
13. ...
14. Zuweisungen