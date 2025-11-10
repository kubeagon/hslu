# Series 1 Aufgabe 1 - Booleans

Priorität:
1. NOT
2. AND
3. OR

Es wird von links nach rechts verarbeitet → Linksassoziativität

```
a) False or True and False and True or False

False or False or False
= False
```
```    
b) False and True or False and not True or False

False and True or False and False or False
False or False or False
= False
```
```    
c) not False or not not True and False or not True

True or True and False or False
True or False or False
= True
```
```    
d) not(not True or not(False and not True)) or False

not(not True or not(False and False)) or False
not(not True or not False) or False
not(False or True) or False
not(True) or False
False or False
= False
```
```
e) not((False or not True) or True) and not(False or True)

not((False or False) or True) and not(True)
not((False) or True) and False
not(True) and False
False and False
= False
```
