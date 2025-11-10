# Navigation

- [Prädikat](#prädikat)
    - [Definition](#definition-prädikat)
- [Quantoren](#quantoren)
    - [Definition](#defintion-sei-px-eine-prädikat-mit-x-aus-einem-universum-u)
- [Aufgaben](#aufgaben)

# Prädikat

Eine Aussage ist immer warheitsdefinit. Sie hat immer entweder den Warheitswert wahr oder falsch. Im gegensatz hat ein Prädikat Lücken, die mit Variablen bezeichnet werden. Werden die Variablen konkrete Werte zugewiesen, entsteht eine Aussage.

Bsp:

- sumEqualToFive(x,y): "Die Summe von x und y ist Fünf" → ist ein Prädikat mit den zwei Variablen x und y die Integer representieren
- Pal(s): "Die Zeichenkette s ist ein Palindrom" → ist ein Prädikat mit einer Variablen s welches ein String representiert

## Definition: Prädikat

Ein Prädikat ist ein Satz mit Variablen. Wenn die Variablen mit Werten aus dem sogennanten Universum ersetzt werden, muss aus dem Prädikat eine Aussage entstehen.

- Seien x und y aus dem Universum Z. Dann ist sumEqualtoFive(1,3) eine Aussage mit dem Warheitswert 0
- Sei s aus dem Universum {w:w ein Wort im Duden}. Dann ist Pal(REITTIER) eine Aussage mit dem Warheitswert 1

# Quantoren

## Defintion: Sei P(x) eine Prädikat mit x aus einem Universum U

- Der Allquantor ∀ macht aus P(x) die Aussage ∀x ∈ U:P(x)

```
                    Wahr: wenn P(x) für alle x wahr ist
∀x ∈ U:P(x) ist 
                    Falsch: sonst
```

- Der Existenz ∃ macht aus P(x) die Aussage ∃x ∈ U:P(x)

```
                    Falsch: wenn P(x) für alle x falsch ist
∃x ∈ U:P(x) ist
                    Wahr: sonst
```

Für ein Universum mit endlich vielen Werten können Generalisierung und Spezialisierung auch ohne Prädikatenlogik dargestellt werden.

# Aufgaben

- [Aus einem Prädikat wahre und Falsche Aussagen machen](/1.BA/DMATH-ALGO.H2501/SW03/tasks/aufgabe1.md)
