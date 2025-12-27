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

## Arrays

Deklaration: `Datentyp[] Variablenname;``

```java
String[] kantone = null;
```

Speicher-Reservierung: `Variablenname = new Datentyp[Anzahl Elemente];``

```java
gemeinden = new String[32];
```

Die Deklaration und Speicherreservierung kann auch in einem Schritt gemacht werden:

```java
String[] gemeinden = new String[32];
```

Erstellung eines Arrays ohne new-Operator:

```java
String[] gemeinden = {Bern, ..., Zurich};
```

Zugriff auf Arrayelemente über den Index: `Arraynamen[Indexwert]``

```java
String firstKanton = gemeinden[0]; // firstKanton equals Bern
```

### Speicher Referenzierung und Arrays

Wenn ein Array einem Array zugewiesen wird, wird keine Kopie erstellt, sondern es zeigen beide Arrays auf den gleichen Speicher.

```java
int[] arrA = {1, 3, 5, 7, 9};
int[] arrB = arrA;
```

Die Array kann folgendermassen kopiert werden:

```java
int[] arrA = {1, 3, 5, 7, 9};
int[] arrB = new int[arrA.length]

for (int i = 0; i < arrA.length; i++) {
    arrB[i] = arrA[i];
}
```

### Mehrdimensionale Arrays

Java kennt auch zweidimensionale und dreidimensionale Arrays. Folgend ein Beispiel eines zweidimensionalen Arrays:

```java
int anzZeilen = 5;
int anzSpalten = 3;

int[][] tabelle = new int[anzZeilen][anzSpalten];

// Element in erster Zeile und zweiter Spalte setzen
tabelle[0][1] = 3;
```

## Kontrollstrukturen

- Sequenz: Abfolge von Befehlen
- Selektion: Verzweigun
- Iteration: Schleifen

### Sequenz

```java
double a = 99;
double b = 10;
double resultat = a / b;
System.out.println("Resultat: " + resultat);
```

### Selektion

If Else Selektion:

```java
int x = (int)(Math.random() * 100);
if (x < 50) {
    System.out.println("Die zufällige Zahl ist grösser als 50");
} else if (x == 50) {
    System.out.println("Die zufällige Zahl ist gleich 50");
} else {
    System.out.println("Die zufällige Zahl ist kleiner als 50");
}
```

Switch

```java
Scanner sc = new Scanner(System.in);
System.out.println("Bitte eine Zahl zwischen 1-2 eingeben: ");
int nummer = sc.nextInt();

switch (nummer) {
    case 1:
        System.out.println("Die Zahl " + nummer + " wurde eingegeben");
        break;
    case 2:
        System.out.println("Die Zahl " + nummer + " wurde eingegeben");
        break;
    default:
        System.out.println("Fehlerhafter Wert!");
}
```

### Iteration

For-Schlaufen:

```java
for (int i = 0; i < 5; i++) {
    System.out.print("Quadrat: " + (i * i));
}
```

Beispiel mit einem Array:

```java
String[] jahreszeiten = {"Fruehling", "Sommer", "Herbst", "Winter"};

for (String element : jahreszeiten) {
    System.out.println(element);
}
```

While-Schlaufen:

```java
int a = 10;

while (a > 0) {
    System.out.println("a = " + a);
    a--;
}
```

Do-While-Schlaufe:

```java
Scanner sc = new Scanner(System.in);

int wahl = -1, n = 0;

do {
    System.out.println("Quadrat berechnen [1]   Beenden [0]");
    System.out.print("Ihre Wahl: ");
    wahl = sc.nextInt();

    if (wahl != 0) {
        System.out.print("\nGanze Zahl eingeben: ");
        n = sc.nextInt();
        System.out.println(n + " * " + n + " = " + (n * n) + "\n");
    }
} while (wahl != 0);
```

## Sprunganweisungen

Break:

```java
Integer[] arr = new Integer[10];
arr[0] = 1;
arr[1] = 2;
arr[2] = 3;
arr[4] = 4;

for (int i = 0; i < arr.length; i++) {
    if (arr[i] == null) {
        break;
    }
    System.out.print(arr[i]);
// Prints 123 because arr[3] is null
}
```

Continue:

```java
Integer[] arr = new Integer[10];
arr[0] = 1;
arr[1] = 2;
arr[2] = 3;
arr[4] = 4;

for (int i = 0; i < arr.length; i++) {
    if (arr[i] == null) {
        continue;
    }
    System.out.print(arr[i]);
// Prints 1234 because continue doesn't stop at arr[3] which is null
}
```



