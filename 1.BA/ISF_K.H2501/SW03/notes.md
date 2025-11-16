# Navigation

# Intercepten

## Kryptographie




### Asymmetrische Kryptographie
(Auch Pub-Key Kryptographie genannt)

- Jeder generiert ein eigenes Schlüsselpaar (pub and private key)
- Das eigene private key wird nur für Entschlüsselung gebraucht
- Für die Verschlüsselung wird der public key des Kommunikationspartner verwendet

### Digitale Signaturen

Eigenschaften einer Signatur

    • Fälschungssicherheit → Daten können nicht unbemerkt verändert werden
    • Authentizität → Die Signatur kann zweifelsfrei einer Person zugeordnet werden
    • Unleugbarkeit →  Der Unterschreiber kann später nicht abstreiten die Dateien unterschrieben zu haben
    • Willenserklärend → Die Signatur kann nur willentlich Daten angefügt werden

Algorithmen für Digitale Signaturen

    • Oft ähnliche oder die gleiche Algorithmen wie die asymmetrische Kryptographie
Bsp: RSA

Hash-then-Sign Verfahren



Digitale Zertifikate und PKI

Verwaltung der Schlüsselpaare

    • Digitale Zertifikate zeigen die zugehörigkeit von öffentlichen Schlüssel (public keys) auf
    • PKI stellt die Identität des public key owners sicher
    • Bsp: X.509

    • 

Certificate Authority (CA)

Chain of Trust

    • Die höchste CA heisst Root CA
    • Dazwischen Intermediate CA
        ○ CAs ersetzen braucht grossen aufwand, deswegen werden Intermediates gebraucht
→ ersetzbarkeit da intermediates durch Root neu ausgestellt werden können
    • Der Endnutzer Zertifikat heisst End-Entity Zertifikat



Public Key Infrastructure (PKI)

Ein System das digitale Zertifikate ausstellt, verteilt und prüft bestehend aus:

    • CA → Certificate Authority
    • RA → Registration Authority
    • VA →  Validation Authority
