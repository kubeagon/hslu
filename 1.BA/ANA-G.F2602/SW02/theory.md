# Grenzwerte

## Definition

Hat die Funktion $f(x)$ an der Stelle $x_0 \in \mathbb{R}$ den Grenzwert (Limes) $L \in \mathbb{R}$, schreibt man:

$$
\lim_{x \to x_0} f(x) = L
$$

Je näher die Werte von $x$ der Stelle $x_0$ auf der x-Achse kommen, desto näher kommen die Werte von $f(x)$ dem Wert $L$ auf der y-Achse.

Die **strenge mathematische Definition** lautet:

$$
\forall \varepsilon > 0 \; \exists \delta > 0 :
x \in U_{\delta}(x_0) \Rightarrow f(x) \in U_{\varepsilon}(L)
$$

Wenn man den Grenzwert $L$ noch so einen kleinen Bereich vorgibt, dann kann man um $x_0$ einen Bereich finden, sodass alle $x$ aus diesem Bereich mit ihren Funktionswerten $f(x)$ im gewünschten Bereich um $L$ landen.

- $\forall \varepsilon > 0$ bedeutet für jedes $\varepsilon > 0$, dabei ist $\varepsilon$ eine beliebige kleine positive Zahl die beschreibt, wie nahe $f(x)$ an $L$ liegen soll

---

### $\delta$-Umgebung

Dabei bezeichnet $U_{\delta}(x_0)$ eine **$\delta$-Umgebung der Stelle $x_0$**. Es gilt:

$$
U_{\delta}(x_0)
=
\{x \mid |x - x_0| < \delta\}
=
\{x \mid x_0 - \delta < x < x_0 + \delta\}
$$

---

### $\varepsilon$-Umgebung

Analog ist

$$
U_{\varepsilon}(L)
=
\{y \mid |y - L| < \varepsilon\}
$$

die **$\varepsilon$-Umgebung des Grenzwerts $L$**.

---

## Alternative Darstellung (häufiger verwendet)

Die Definition wird oft auch so geschrieben:

$$
\forall \varepsilon > 0 \; \exists \delta > 0 :
|x - x_0| < \delta \Rightarrow |f(x) - L| < \varepsilon
$$