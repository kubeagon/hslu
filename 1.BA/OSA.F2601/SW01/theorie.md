# Zahlensysteme

- Daten erscheinen unstrukturiert und ohne Kontext
    - Haben für uns als Betrachtende keine Bedeutung

- Informationen haben ein Kontext und sind relevant
    - Diese Informationen werden durch "Nullen und Einsen", d.h. im Binärsystem representiert.
    - Durch Interpretation in einem Kontext (Anreicherung entstehen Informationen)

## Bit

Binary digit - bit
- Logische Sichtweise: Ein Bit ist eine Variable die zwei Werte darstellen kann: 0 oder 1, wahr oder falsch, LOW oder HIGH
- Technische Sichtweise:
    - Position eines Schalters
    - Spanungsspegel
    - Magnetisierung von Partikeln
    - Geladene und ungeladene Zustände von Bauteilen

Bit wird zudem als Masseinheit für Datenmengen verwendet. Bspw. 64 Bit Prozessoren
- Die Datenmenge bedeutet die Anzahl möglicher Representationen: 3 Bit → $2^3 = 8$ Representationsmöglichkeiten

## Byte

- 8 Bit sind ein Byte

| Position | 7 | 6 | 5 | 4 | 3 | 2 | 1 | 0 |
|----------|---|---|---|---|---|---|---|---|
| Bitwert  | 0 | 1 | 0 | 1 | 1 | 0 | 0 | 1 |

- Position 7: Most Significant Bit (MSB)
- Position 0: Least Significant Bit (LSB)

Rechnerarchitekturen sind in 2er-Potenzen organisiert: 8, 16, 64, 128 Bit
- Bei einem 64 Bit Rechner bezeichnet man ein 64 Bit Grösse als ein (Machinen-) Wort
- Die Länge des Wortes ist 8 Byte

## ASCII

American Standard Code for Information Interchange. Verwendet 7 Bit und besteht aus 128 Zeichen.
   
   - Da Speicher und Chipsätze immer in Zweierpotenzen konstruirt werden verwendet ASCII ein zusätliches Bit
        - Paritätsbit (Fehlererkennung)
        - Erweiterung für regionale Alphabete (Bsp: ISO-8859-1 oder ISO-8859-2)

## Stellenwertsystem

Die Ziffer und ihre absolute Postition ergeben den Wert der dargestellten Zahl. Der Wert einer nichtnegativen Zahl $z$ lässt sich wie folgt berechnen:

$
z = \sum_{i=0}^{n-1} a_i b^i = a_0b^0 + a_1b^1 + ... + a_{n-1}b^{n-1}
$

-  $a_{n-1},...,a_0$ sind Ziffern einer Zahl
- $0 \leq a_i \leq b$
- $b$ heisst Basis der Zahlendarstellung
- $b$-adische Darstellung von $z$

Beispiel: $z = 152 = 2 \times 10^0 + 5 \times 10^1 +  1 \times 10^2$

### Dezimalsystem

Basis 10 $z = \sum_{i=0}^{n-1} d_i 10^i$ mit $d_i \in {0 ... 9}$

### Hexadezimalsystem

Basis 16 $z = \sum_{i=0}^{n-1} h_i 16^i$ mit $h_i \in {0 ... 9, A ... F}$

### Binärsystem

Basis 2 $z = \sum_{i=0}^{n-1} b_i 2^i$ mit $b_i \in {0,1}$
