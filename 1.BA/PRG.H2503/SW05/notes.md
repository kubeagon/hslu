# Klassen & Objekte

## Objektorientierte Programmierung (OOP)

- Programme werden in Einheiten zerlegt welche Objekte genannt werden
- Methoden (Daten und Operationen) werden in Objekten zusammengefasst womit der Zugriff auf Daten eines Objekts kontrolliert werden kann (Kapselung)
- Die kleinste Struktur ist eine Klasse / Objekt

### Objekte Beispiele:

- Garage von Hr. Meier
- Das Auto mit VIN 1HGFH14JNXM901724
- Flug Zürich nach Berlin am 22.09.2025 um 09:00

### Vorgehen

1. Objekte für die Problemstellung definieren
2. Objekten der realen Welt mit deren Eigenschaften, Verhalten und Beziehungen analysieren
3. Ähnliche Objekte gruppieren wodurch Klassen von Objekten entstehen
4. Eigenschaften und Verhalten der einzelnen Objekt-Typen in Einheiten zusammenfassen
→ Eine Einheit definiert einen neuen Typ / Klasse

### Beispiel Aufgabe

Es soll eine Applikation erstellt werden für die Verwaltung von Büchern und Regalen

| Nr | Objekt | Relevante Eigenschaften |
|----|--------|-------------------------|
| 1 | Buch | Autor, Titel, Auflage, Erscheinungsjahr, ISBN, Sprache, Status |
| 2 | Regal | Bezeichnung, Etage |
| 3 | Kunde | Name, Adresse, Email, Telefon, Kundennummer |

Eine Klasse definiert die Struktur und Verhalten einer ganzen Menge an gleichartigen Objekten und dient als Bauplan für die Erstellung von Objekten. Eine Klasse hat eine 1 - n Beziehung zu Objekten

Welche Vorgänge sind im Kontext der Aufgabe relevant?

- Neues Buch wird in der Bibliothek erfasst
- Kunde leiht eine oder mehrere Bücher aus
- Eine Ausleiehe wird verlängert
- Kunde erkündigt sich über verfügbarkeit eines Buches (per Telefon, Email, Vorort)
- Ein Buch wird zrückgebracht
- Die Bibiothek sendet eine Mahnung an einen Kunden

Welche der obigen Vorgehen sollen automatisiert werden?
Welche Klasse soll für ein konkreter Vorgang zuständig sein?

![beispiel](/1.BA/PRG.H2503/SW05/beispiel.png)

## Domain- und Business-Klassen

### Domain-Klassen

- Verwalten Daten die in der Anwendung vorkommen
    - Bsp: Buch, Kunde, Ausleihe Status, Mahnung, Rechnung

- Stellen Methoden zur Verfügung mit denen der Zustand einer konkreten Instanz der Klasse geändert oder abgefragt werden kann (set und get Methoden)
    - Bsp für die Klasse Kunde: setName, setEmail, getTelefon, etc.

### Business-Klassen

- Zuständig für Businesslogik (Geschäftsprozesse)
    - Bsp: BuchManager für ausleih Prozesse

- Stellen Methoden zur Verfügung mit denen bestimmte Aktionen durchgeführt werden können
    - Bsp: ausleiheVerlängern

![business-classes](/1.BA/PRG.H2503/SW05/business-classes.png)

## Erstellung von Objekten (Konstruktoren)

Bevor mit einem Objekt gearbeitet werden kann, muss das Objekt mit Hilfe des "new" Operators erstellt werden:

```java
Buch buchA = new Buch();
```

- Nach der Erstellung ist das Objekt im Speicher und kann über den Referenz "buchA" angesprochen werden
- Für jeder Komponent des Objekts (Datenfeld, Attribut), wird entsprechend Speicher reserviert und mit folgenden Standartwerten initialisiert: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

### Parameterloser Konstruktor (Standard)

Die Erstellung eines Objekts übernimmt eine spezielle Methode welcher Konstruktor heisst.

- Hat den gleichen Namen wie die Klasse
- Liefert keinen Rückgabewert
- Ist normalerweise public

Wird verwendet wenn eine Klasse keine eigene Konstruktor implementiert

### Private Datenfelder und Methoden

Um den Wert eines Datenfelds zu ändern muss die entsprechende set-Methode verwendet werden da alle Felder private sind (Kapselung)

```java
buchA.setTitel("Beispiel");
```

Die Summe aller Methoden, welche auf einem Objekt aufgerufen werden können, definiert das Verhalten des Objekts

### Parametrisierter Konstruktor (Benutzerdefinierter-Konstruktor)

Um die Datenfelder eines Objekts bei der Erstellung mit benutzerdefinierten Werten zu initialisieren muss ein Konstruktor implementiert werden, der beim Aufruf die Werte entgegennehmen kann.

Eine Klasse kann mehrere Konstruktoren haben. Achtung sobald ein Konstruktor implementiert wird, wird der Standard Konstruktor automatisch entfernt.

### Aufruf eines Konstruktors im Konstruktor

In einem Konstruktor kann auch ein weiterer Konstruktor der gleichen Klasse aufgerufen werden. Der Aufruf muss zwingend in der ersten Zeile des Konstruktors erfolgen. Ein Konstruktor darf erst dann Code ausführen, wenn klar ist, welcher Konstruktor für die Initialisierung zuständig ist, daher muss der Aufruf eines anderen Konstruktors in der ersten Zeile stehen.

## Klassen und Instanzmethoden (Objektmethoden)

Eine Klassenmethode ist eine Methode mit dem Modifikator static und kann mit dem Klassennamen aufgerufen werden

- Soll verwendet werden wenn eine Methode kein Zugriff auf die Instanzvariablen oder andere Instanzmethoden des Objekts braucht

Eine Instanzmethode ist ohne Modifikator static definiert und ist an Existenz einer Instanz der Klasse gebunden. Sie kann nicht über den Kassennamen aufgerufen werden.

- Soll verwendet werden wenn Zugriff auf die Instanzvariablen oder andere Instanzmethoden des Objekts braucht

## Klassen- und Instanzvariablen (Objektvariablen)

Klassenvariablen

- Hat den Modifikator static
- Wird über den Namen der Klasse angesprochen
- Ist ein einziges Mal im Speicher vorhanden

### Instanzvariablen / Objektvariablen

- Hat den Modifikator static nicht
- Wird über die Referenz auf ein Objekt angesprochen
- Ist pro Objekt der Klasse im Speicher vorhanden

### Referenz-Typ

- Eine Variable ist eine benannte Speicherstelle, deren Grösse durch den Typ des in dieser Speicherstelle zu verwaltenden Wertes definiert wird
- Eine Variable eines primitiven Typs (primitive Variable) enthält nur einen Wert, der von Interesse ist.
- Eine Referenz-Variable enthält die Adresse, an der sich das Objekt befindet, dass von Interesse ist und seinerseits mehrere Werte enthält, die einzeln angesprochen werden können (Komponenten des Objekts).
- Wenn ein Objekt erstellt wird, wird die Adresse, an der sich das Objekt befindet, in die Referenzvariable geschrieben und ab dem Moment "zeigt" die Referenzvariable auf das Objekt (folgt: Referenzvariable ist ein Zeiger / Pointer).
- Ein Spezialfall ist die null-Referenz:
    - Sie hat den Wert null und "zeigt" auf kein Objekt.
    - Der Versuch, über eine null-Referenz eine Methode aufzurufen wird mit einer Ausnahme (NullPointerException) quittiert.
