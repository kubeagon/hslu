# Vererbung und Polymorphie

## Vererbung

### Definition

- Vererbung heisst das die Vorfahren ihre Eigenschaften und Fähigkeiten an ihr Nachkommen weitergeben
- Falsch eingesetzte Vererbung kann zu grossen Problemen führen und muss nicht zwingend immer eingesetzt werden, da sie zu einer starken Koppelung führt → schlechtes Design

### Super- und Subklassen

- Superklasse (auch Oberklasse oder Basisklasse)
    - Gibt ihre Eigenschaften und Fähigkeiten (Attribute und Methoden) an eine weitere Klasse
- Subklasse (auch Unterklasse oder Kindklasse)
    - Übernimmt die Attribute und Methoden durch Vererbung einer Superklasse

Die Beziehung zwischen Super- und Subklasse wird eine "ist ein" oder "is-a" genannt. Die Unterklasse ist vom gleichen Type der Oberklasse und kann überall dort eingesetzt werden wo eine Oberklassen-Instanz verlangt wird.

### Generalisierung vs. Spezialisierung

Die Vererbung kann auch über mehrere Ebenen gehen, wobei eine Vererbungshierarchie entsteht.

- In einer solchen Hierarchie stellen die Oberklassen die Generalisierung der Unterklassen dar 
    → Desto weiter oben in der Hierarchie desto weniger Unterschiede. Mehr shared Attribute & Methoden
- Unterklassen stellen eine Spezialisierung der Oberklassen dar
    → Desto weiter unten in der Hierarchie desto mehr Unterschiede. Weniger shared Attribute & Methoden

### Vererbung in Java

In Java wird die Vererbung mit Hilfe des Schlüsselwortes extends im Kopf der Unterklasse realisiert.

Beispiel:

```java
public class Oberklasse {
    // Attribute und Methoden
}

public class Unterklasse extends Oberklasse {
    // Attribute und Methoden
}
```

Hinweis zu Begriff "abgeleitet":
- Wenn die Klasse B die Unterklasse der Klasse A ist, sagt man, dass die Klasse B von der Klasse A abgeleitet wird.
- In unserem Beispiel würde dies heissen, dass die Klasse Student von der Klasse Person abgeleitet wird.

### java.lang.Object

Die Klasse java.lang.Objekt ist die implizite Basisklasse aller Klassen in Java

- Wenn im Kopf der Klasse kein "extends" steht, wird diese Klasse automatisch davon abgeleitet
- Methoden dieser Basisclasse stehen automatisch allen Klassen zur verfügung. Hier paar Beispiele:
    - equals
    - hashCode
    - toString

Methoden können Überschrieben werden wenn die Standartimplementierung nicht ausreicht.

### Methoden Überschreiben

Eine Methode kann überschrieben werden indem sie in der Unterklasse nochmals definiert wird. Falls auf die ursprünglich vererbte Methode zugegriffen werden muss, kann dies mit "super" gemacht werden:

```java
return super.toString()
```

Falls eine Methode nicht abgeändert werden soll, kann man diese mit dem Modifikator "final" versehen:

```java
public final void sehrWichtigeMethode (){
    // Implementierung
}
```

→ Dies kann auch bei Klassen verwendet werden die nicht abgeleitet werden können sollten

### Konstruktoren in Unterklassen

- Konstruktoren werden nicht vererbt und müssen in der Unterklasse explizit implementiert werden. (Ausser default Konstruktor)
- Diese Implementierung ist jedoch abhängig der in der Oberklasse vorhandenen Konstruktoren
- Jeder Konstruktor ist ausschliesslich für die Initialisierung der Instanzvariablen der eigenen Klasse

Wenn die Oberklasse den Standardkonstruktor sowie auch Benutzerdefinierten verwendet:
→ Ohne expliziten aufruf der Oberklassenkonstruktor wird der Standardkonstruktor verwendet.

Der explizite Aufruf des Oberklassen-Konstruktors
- erfolgt mit super(Parameterliste) und
- muss immer in der ersten Zeile des Konstruktors der Unterklasse erfolgen
