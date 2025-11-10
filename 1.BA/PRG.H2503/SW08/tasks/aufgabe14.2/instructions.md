# 14.2 Implementieren von mehreren Schnittstellen

Die Klasse`Laserdrucker` soll die Schnittstelle `Drucker` implementieren,
die Klasse `Faxgeraet` die Schnittstelle `Fax`,
und die Klasse `Kombigeraet` soll beide Schnittstellen, `Fax` und `Drucker`, implementieren.

Fax.java
```java
public interface Fax {
    String faxsimulation = ....;
    public void senden(String sendeRef);
}
```
Drucker.java

```java
public interface Drucker {
    String drucksimulation = ....;
    public void drucken(String druckRef);
}
```

TestGeraete.java

```java
public class TestGeraete {
    public static void main(String[] args) {
        Laserdrucker l1 = new Laserdrucker();
        Laserdrucker l2 = new Laserdrucker();
        Faxgeraet f1 = new Faxgeraet();
        Faxgeraet f2 = new Faxgeraet();
        Kombigeraet k1 = new Kombigeraet();
        Kombigeraet k2 = new Kombigeraet();
        f1.senden ("Dies ist ein Test");
        f2.senden ("Dies ist ein Test");
        l1.drucken ("Dies ist ein Test");
        l2.drucken ("Dies ist ein Test");
        k1.senden ("Dies ist ein Test");
        k2.senden ("Dies ist ein Test");
        k1.drucken ("Dies ist ein Test");
        k2.drucken ("Dies ist ein Test");
    }
}
```

