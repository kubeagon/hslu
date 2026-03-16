# Logik und Arithmetik

## Basic Gatter

### NOR

![alt text](/1.BA/OSA.F2601/img/sw04-nor.png)

$$
\begin{array}{c c | c}
A & B & Y = \text{A NOR B} \\
\hline
0 & 0 & 1 \\
0 & 1 & 0 \\
1 & 0 & 0 \\
1 & 1 & 0
\end{array}
$$

### XOR

![alt text](/1.BA/OSA.F2601/img/sw04-xor.png)

$$
\begin{array}{c c | c}
A & B & Y = \text{A XOR B} \\
\hline
0 & 0 & 0 \\
0 & 1 & 1 \\
1 & 0 & 1 \\
1 & 1 & 0
\end{array}
$$

## Multiplexer (MUX)

## Demultiplexer (DEMUX)

## Komparator

Püft zwei Binärzahlen bzgl. der Relation (=,<,>)

![alt text](/1.BA/OSA.F2601/img/sw04-komparator.png)

$$
\begin{array}{c c c c | c c c}
a_3,b_3 & a_2,b_2 & a_1,b_1 & a_0,b_0 & A > B & A = B & A < B \\
\hline
> & - & - & - & 1 & 0 & 0 \\
< & - & - & - & 0 & 0 & 1 \\
= & > & - & - & 1 & 0 & 0 \\
= & < & - & - & 0 & 0 & 1 \\
= & = & > & - & 1 & 0 & 0 \\
= & = & < & - & 0 & 0 & 1 \\
= & = & = & > & 1 & 0 & 0 \\
= & = & = & < & 0 & 0 & 1 \\
= & = & = & = & 0 & 1 & 0
\end{array}
$$

### Gleicheit

![alt text](/1.BA/OSA.F2601/img/sw04-komparator-gleichheit.png)

## Addierer

## Subtrahierer

## Barrel Shifter

## Arithmetisch-logische Einheit (ALU)