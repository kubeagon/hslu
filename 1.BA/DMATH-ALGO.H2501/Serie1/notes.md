# Elementare Datentypen

## Booleans

einstelliger Operator (BSP: Kehrwert, Betrag etc.)
zweistelliger Operator (BSP: 1 + 5, 2 + 2, etc.)

### NOT

```
not True = False
not False = True
```

### AND

```
True and True = True
True and False = False
False and True = False
False nad False = False
```

### OR

```
True or True = True
True or False = True
False or True = True
False or False = False
```

### Priorität (Linksassoziativität)

1. NOT -> Highest Prio
2. AND
3. OR  -> Lowest Prio

False or False and True or False = False or False or False = False

## Integers

Definition: Eine positive ganze Zahl, die Zahl Null oder eine ganze negative Zahl

`Z` = {...,-4,-3,-2,-1,0,1,2,3,4,...}

Die einstellige Negationsoperator sowie die wzeistelligen Operatoren Addition, Subtraktion und Multiplikation sind für Integers wohldefiniert. Division ändert potentiell den Datentyp und ist deswegen bei Integers nicht anwendbar.

### Python Operatoren

Ganzzahldivision:

```
    10 // 3 = 3
    10 // 7 = 1
    10 // 5 = 2
```

Rest:

```
    10 % 3 = 1
    10 % 7 = 3
    10 % 5 = 0
```

### Integer Werte als Bits

34 kann folgendermassen in Binär umgerechnet werden

```
34 = 17 * 2 + 0
17 =  8 * 2 + 1
 8 =  4 * 2 + 0
 4 =  2 * 2 + 0
 2 =  1 * 2 + 0
 1 =  0 * 2 + 1

 -> 100010 = 2^0 * 0 + 2^1 * 1 + 2^2 * 0 + 2^3 * 0 + 2^4 * 0 + 2^5 * 1
           = 2^1 * 1 + 2^5 * 1 = 34
```

## Floats

Die menge aller reellen Zahlen `R`
Alle Zahlen bei denen sich die Nachkommastellen periodisch wiederholen können als Bruch dargestellt werden. Die Menge der rationalen Zahlen wird mit `Q`bezeichnet.

Reelle Zahl in Binär umrechnen

```
0.625 * 2 = 1 + 0.25
0.25  * 2 = 0 + 0.5
0.5   * 2 = 1 + 0
```

Von Oben nach Unten ablesen:

-> 0.101

Ein float Wert inst eine Kommazahl mit endlich vielen Nachkommastellen. Ein gängiger Standard ist die Darstellung als Fliesskommazahl nach IEEE 754

Da die Periode gekürzt werden sind sie Mathematisch nicht perfekt präzise. Ein BSP anhand Python:

0.7 + 0.1 == 0.9 - 0.1

Python returned FALSE

## Set, List und Matrix

Mengen können verglichen werden:

die zweistellige Relation = (Gleichheit)
{a,b,c} = {a,b,c}   -> True
{a,b,c} = {a,b,c,x} -> False
{a,b,c} = {a,b,x}   -> False

die zweistellige Relation ⊂ (Teilmenge)
{a,b,c} ⊂ {a,b,c} -> True
{a,b}   ⊂ {a,c,x} -> False

Mit Mengen rechnen

der zweistellige Operator ∩ (Durchschnitt)
{a,b,c} ∩ {b,c,d} = {b,c}
{a,b} ∩ {c,d} = {}

der zweistellige Operator u (Vereinigung)
{a,b} u {c,d} = {a,b,c,d}

der zweistellige Operator \ (Differenz)
{a,b,c} \ {b,c,d} = {a}

{a,b} \ {b,c} = {a,b}

Der einstellige Operator - (Komplement)

{a,b} ⊂ {a,b,c,d} = {a,b,c,d}

kompliment = {c,d}