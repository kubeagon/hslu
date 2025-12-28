<!-- vscode-markdown-toc -->
* 1. [Table of Contents](#TableofContents)
* 2. [Zeichen](#Zeichen)
* 3. [Kommentare](#Kommentare)
* 4. [Konstanten](#Konstanten)
* 5. [Datentypen in Java](#DatentypeninJava)
	* 5.1. [Wertebereich (Byte)](#WertebereichByte)
* 6. [Arithmetische Operatoren](#ArithmetischeOperatoren)
* 7. [Logische Operatoren](#LogischeOperatoren)
* 8. [Relationale Operatoren](#RelationaleOperatoren)
* 9. [Typumwandelung (Typecast)](#TypumwandelungTypecast)
* 10. [Auswertungsreihenfolge & Assoziativitätsregeln](#AuswertungsreihenfolgeAssoziativittsregeln)
	* 10.1. [Assoziativität](#Assoziativitt)
	* 10.2. [Reihenfolge](#Reihenfolge)
* 11. [Arrays](#Arrays)
	* 11.1. [Speicher Referenzierung und Arrays](#SpeicherReferenzierungundArrays)
	* 11.2. [Mehrdimensionale Arrays](#MehrdimensionaleArrays)
* 12. [Kontrollstrukturen](#Kontrollstrukturen)
	* 12.1. [Sequenz](#Sequenz)
	* 12.2. [Selektion](#Selektion)
	* 12.3. [Iteration](#Iteration)
* 13. [Sprunganweisungen](#Sprunganweisungen)
* 14. [Klassen als strukturierter Datentyp](#KlassenalsstrukturierterDatentyp)
* 15. [Objekte](#Objekte)
* 16. [Methoden](#Methoden)
	* 16.1. [Kassenmethode](#Kassenmethode)
	* 16.2. [Objekt- oder Instanz-methode](#Objekt-oderInstanz-methode)

<!-- vscode-markdown-toc-config
	numbering=true
	autoSave=true
	/vscode-markdown-toc-config -->
<!-- /vscode-markdown-toc --># Java Basics

##  1. <a name='TableofContents'></a>Table of Contents



##  2. <a name='Zeichen'></a>Zeichen

Zeichenvorrat: ASCII und ISO-Latin-1 (ISO 8859-1)
Zeichensatz: Unicode mit Format UTF-16 (2 Bytes oder 4 Bytes pro Zeichen)

##  3. <a name='Kommentare'></a>Kommentare

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

##  4. <a name='Konstanten'></a>Konstanten

Symbolische Konstante:

```java
final int MINIMUM = 10;
```

Literale Konstante:

```java
double endZahl = 10;
```

##  5. <a name='DatentypeninJava'></a>Datentypen in Java

![alt text](datentypen.png)

###  5.1. <a name='WertebereichByte'></a>Wertebereich (Byte)

- 8 Bits bedeutet 2^8 = 256 Kombinationen von 1 und 0
- Dies wird für den Positiven und Negativen Bereich halbiert (128 Kombinationen)
- Null wird dem positiven Bereich zugeteil (-128 bis +127)

##  6. <a name='ArithmetischeOperatoren'></a>Arithmetische Operatoren

![alt text](arithmetisch.png)

##  7. <a name='LogischeOperatoren'></a>Logische Operatoren

![alt text](logisch.png)

##  8. <a name='RelationaleOperatoren'></a>Relationale Operatoren

![alt text](relational.png)

##  9. <a name='TypumwandelungTypecast'></a>Typumwandelung (Typecast)

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


##  10. <a name='AuswertungsreihenfolgeAssoziativittsregeln'></a>Auswertungsreihenfolge & Assoziativitätsregeln

###  10.1. <a name='Assoziativitt'></a>Assoziativität

- linksassoziaztive Operatoren
    - Prä- und Postfix-Inkrement und -Dekrement (++a, a++, --a, a--)
    - Vorzeichen
    - Logisches Nicht (Negation)
    - Typumwandelung (Type Casting)
    - Bedingungsoperator (?)
    - Zuweisungen

- rechtsassoziative Operatoren
    - alle anderen Operatoren

###  10.2. <a name='Reihenfolge'></a>Reihenfolge

1. Indexoperator, Methodenaufruf, Komponentenzugriff
2. Prä- und Postfix-Inkrement und -Dekrement, Vorzeichen, logisches Nicht
3. Typecast
4. Multiplikation, Division, Restwert
5. Addition, Subtraktion, Stringverkettung (Concat)
6. ...
13. ...
14. Zuweisungen

##  11. <a name='Arrays'></a>Arrays

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

###  11.1. <a name='SpeicherReferenzierungundArrays'></a>Speicher Referenzierung und Arrays

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

###  11.2. <a name='MehrdimensionaleArrays'></a>Mehrdimensionale Arrays

Java kennt auch zweidimensionale und dreidimensionale Arrays. Folgend ein Beispiel eines zweidimensionalen Arrays:

```java
int anzZeilen = 5;
int anzSpalten = 3;

int[][] tabelle = new int[anzZeilen][anzSpalten];

// Element in erster Zeile und zweiter Spalte setzen
tabelle[0][1] = 3;
```

##  12. <a name='Kontrollstrukturen'></a>Kontrollstrukturen

- Sequenz: Abfolge von Befehlen
- Selektion: Verzweigun
- Iteration: Schleifen

###  12.1. <a name='Sequenz'></a>Sequenz

```java
double a = 99;
double b = 10;
double resultat = a / b;
System.out.println("Resultat: " + resultat);
```

###  12.2. <a name='Selektion'></a>Selektion

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

###  12.3. <a name='Iteration'></a>Iteration

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

##  13. <a name='Sprunganweisungen'></a>Sprunganweisungen

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

##  14. <a name='KlassenalsstrukturierterDatentyp'></a>Klassen als strukturierter Datentyp

- Elementare (primitive) Datentypen sind atomar und können nicht weiter zerlegt werden
- Strukturierte Datentypen packen zusammen was logisch zusammen gehört
- Beispiele strukturierte Daten: Punkt(x,y), Datum(Jahr, Monat, Tag), ...

Raum als strukturierter Typ in Java:

```java
class Raum {
    String raumBezeichnung;
    int anzahlPlaetze;
    boolean klimatisiert;
}
```

##  15. <a name='Objekte'></a>Objekte

Objekte werden mit Hilfe der Mutter-Klasse erstellt, wobei die Klasse als Vorlage dient. Ein Objekt ist eine konkrete Ausprägung / Instanz einer Klasse.

```java
// Syntax Objekt erstellen
DATENTPY < REFERENZVAIABLE > = new < KLASSENNAME >();
```
Beispiel mit der Klasse Raum:

```java
Raum raum322 = new Raum();
```

Der Zugriff auf Komponente eines Objekts funktioniert folgendermassen:

```java
raum322.anzahlPlaetze = 35;
```

##  16. <a name='Methoden'></a>Methoden

Eine Methode besteht aus Anweisungen, die zwecks Lösung einer Aufgabe zusammengefasst und mit einem aussagekräftigen Namen versehen wurden. Eine Methode kann an einer beliebigen Stelle im Programm über den Namen der Methode aufgerufen werden.

```java
// Syntax Methode
< MODIFIKATOR(EN) > < RUECKGABEWERT_TYP > < METHODENNAME > (< PARAMETERLISTE >) {
// Implementierung (Methodenrumpf) …
}
```

Beispiel anhand der Methode `main`:

```java
public static void main(String[] args) {
    // Implementation
}
```

Beispiel mit einer Methode die die Summe aller Zahlen in einem vorgegebenen Bereich berechnet:

```java
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Untere Grenze Eingeben: ");
        int von = sc.nextInt();

        System.out.println("Obere Grenze EIngeben: ");
        int bis = sc.nextInt();

        int summe = berechneSumme(von, bis);

        System.out.println("Summe aller Zahlen von %d bis %d ist %d\n", von, bis, summe);
    }

    public static int berechneSumme (int von, int bis) {
        int summe = 0;

        for (int i = von; i <= bis; i++) {
            summe += i;
        }
        return summe;
    }
}
```

###  16.1. <a name='Kassenmethode'></a>Kassenmethode

Eine Klassenmethode gehört einer Klasse und wird mit dem Modifikator static versehen. Mit der Math Klasse demonstriert:

```java
double resultat = Math.pow(2,10);
```

###  16.2. <a name='Objekt-oderInstanz-methode'></a>Objekt- oder Instanz-methode

Instanzmethoden haben keinen Modifikator static und können ausschliesslich über die Referenz auf eine Instanz der Klasse aufgerufen werden:

```java
Scanner keyboard = new Scanner(System.in);

int a = keyboard.nextInt();
String text = keyboard.nextLine();

System.out.println(text.toUpperCase());
int strLaenge = text.length();
```







