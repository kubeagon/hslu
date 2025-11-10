# Series 3 Aufgabe 2

Sei P(x) ein Prädikat mit Universum 𝑼 = {x<sub>1</sub>,x<sub>2</sub>,...,x<sub>n</sub>}

Schreibe die folgenden zwei Aussagen ohne Quantoren und gebe je einen Algorithmus an, der den Wahrheitswert solcher Aussagen berechnet:

a) ∀x ∈ 𝑼 :P(x) ≡ ? → Für alle Elemente x aus der Menge 𝑼 gilt die Aussage P(x)

b) ∃x ∈ 𝑼 :P(x) ≡ ? → Es existiert mindestens ein Element x aus der Menge 𝑼, für das die Aussage P(x) wahr ist

> [!TIP]
> ≡ bedeutet logische Äquivalenz

## Lösungsweg a

Bei ∀x ∈ 𝑼 :P(x) kann bei der Umwandelung in Aussagenlogik (ohne Quantoren) eine "Für alle" (∀) Regel verwendet werden.

> [!TIP]
> ∧ = und

P(x<sub>1</sub>) ∧ P(x<sub>2</sub>) ∧ ... ∧ P(x<sub>n</sub>)

Dies ist möglich da alle x<sub>i</sub> P(x) erfüllen

Algorythmus in Python:

```python
# Define the Universe
U = [1,2,3,4,5]

# Define a predicate function, here: is x even?
def P(x):
    return x % 2 == 0

# now the allquantor function
def forall(U, P):
    for x in U:
        if not P(x):
            return False
    return False

print("Are all elements even?", forall(U, P))
```

## Lösungsweg b

Bei ∃x ∈ 𝑼 :P(x) kann bei der Umwandelung in Aussagelogik (ohne Quantoren) eine "Es existiert" (∃) Regel verwendet werden.

> [!TIP]
> ∨ = oder

P(x<sub>1</sub>) ∨ P(x<sub>2</sub>) ∨ ... ∨ P(x<sub>n</sub>)

Dies ist möglich mindestens ein x<sub>i</sub> P(x) erfüllt

Algorythmus in Python:

```python
# Define the Universe
U = [1,2,3,4,5]

# Define a predicate function, here: is x even?
def P(x):
    return x % 2 == 0

# now the existencequantor function
def forall(U, P):
    for x in U:
        if P(x):
            return True
    return False

print("Is there atleast one even element?", forall(U, P))
```



