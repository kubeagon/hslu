# Übungen Serie 1

## Aufgabe 1
```
(a) False or True and False and True or False

    = False or False or Fale
    = False

(b) False and True or False and not True or False

    = False or False or False
    = False

(c) not False or not not True and False or not True

    = True or True and False or True
    = True or False or True
    = False

(d) not(not True or not(False and not True)) or False
    
    = not(not True or (True and not True)) or False
    = not(False or False) or False
    = True or False
    = False
```

## Aufgabe 2

```
409 = 204 * 2 + 1
204 = 102 * 2 + 0
102 =  51 * 2 + 0
 51 =  25 * 2 + 1
 25 =  12 * 2 + 1
 12 =   6 * 2 + 0
  6 =   3 * 2 + 0
  3 =   1 * 2 + 1
  1 =   0 * 2 + 1
```

Von unten nach Oben ablesen:

-> 110011001

## Aufgabe 3

```
3.152525252... soll als Bruch dargestellt werden

3152.525252... = 1000 * 3.1525252... |
31.52525252... =   10 * 3.1525252... | (-) Subtraktion
------------------------------------
3121.00....    =  990 * 3.152


                  3121
3.1525252...   =  ----
                   990
```   

## Aufgabe 4

```
0.16666666... soll als Bruch dargestellt werden

16.66666... = 100 * 0.16666...
 1.66666... =  10 * 0.16666...
----------------------------
15          =  90


                15
0.1666...   =   --
                90
```

## Aufgabe 5

```
0.00101010101010..

Die erste Ziffer muss eine 1 sein, deswegen wird hier * 1000 gerechnet was sich als -3 (3 Kommastellen nach links) überträgt
                                            (*2) | (/2)
0.00101010101010... * 1000 -> -3 [ 8 | 4 | 2 | 1 | 1/2 | 1/4 | 1/8 ]

      0.00101010... = 1.0101010... * 2
32-bit:    -3 + 127 = 124 -> Binär(124) = 1111100

           0 01111100 01010101010101010101011 <-- Careful this becomes a 1 because we carried it over
        1bit <-8bit-> <---------23bit-------> 

1bit: 0 = positive, 1 = negative
+127 comes from the IEEE Standard

64bit: -3 + 1023 = 1020 -> Binär(1020) = 1111111100

   0 01111111100 010101010101010101010101010101010
1bit <--11bit--> <--------------52bit------------>
```

