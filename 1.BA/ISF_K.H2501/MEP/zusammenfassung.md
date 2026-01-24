
<!-- Table of Contents -->
1. [SW01 Begriffe und Common Ground](#sw01-begriffe-und-common-ground)
2. [SW02 (Self-) Awareness](#sw02-self--awareness)
3. [SW03 Intercepten](#sw03-intercepten)
4. [SW04 Anwendungssicherheit: Session Handling](#sw04-anwendungssicherheit-session-handling)
5. [SW05 Symmetrische Kryptologie](#sw05-symmetrische-kryptologie)
6. [SW06 Asymmetrische Kryptologie](#sw06-asymmetrische-kryptologie)
7. [SW07 Anforderungen kryptographische Protokolle](#sw07-anforderungen-kryptographische-protokolle)
8. [SW09 Risiko-Management](#sw09-risiko-management)
9. [SW11 Vulnerabilities](#sw11-vulnerabilities)
10. [SW12 Anwendungssicherheit: Injection](#sw12-anwendungssicherheit-injection)
11. [SW14 Quantencomputing und -kryptographie](#sw14-quantencomputing-und--kryptographie)

---

# Zusammenfassung ISF

In dieser Zusammenfassung werden explizit die Lernziele angeschaut und deren Kerninhalte revidiert.

##  1. <a name='SW01BegriffeundCommonGround'></a>SW01 Begriffe und Common Ground

###  1.1. <a name='VerstehendenSinnvonInformation-Security-ManagementISM'></a>Verstehen den Sinn von Information-Security-Management (ISM)

####  1.1.1. <a name='ISMInformationSecurityMangament'></a>ISM (Information Security Mangament)

ISM ist das Systematische Managment von Infromationssicherheit, es sorgt dafür dass Informationssicherheit geplant, messbar und wirtschaftlich umgestzt wird.

Die Ziele von ISM sind:

- Confidentiality: Kein unautorisirter Zugriff
- Integrity: Keine unautorisierte Veränderung
- Availability: Informationen müssen verfügbar sein
- Privacy: Schutz persönlicher Daten
- Anonymität: Identität soll nicht rekonstruirbar sein

###  1.2. <a name='KennendieUnterschiedeundGemeinsamkeitenvonSicherheitimSinnevonSafetyundSecurity'></a>Kennen die Unterschiede und Gemeinsamkeiten von Sicherheit im Sinne von "Safety" und "Security"

####  1.2.1. <a name='Safetyvs.Security'></a>Safety vs. Security

- Safety: Schutz vor unbeabsichtigten Gefahren
- Security: Schutz vor absichtlichen Angriffen

####  1.2.2. <a name='KnnenBegriffeIT-Daten-Cyber-Informations-integraleSicherheitgegeneinanderabgrenzenundanwenden'></a>Können Begriffe IT- , Daten-, Cyber-, Informations-, integrale Sicherheit gegeneinander abgrenzen und anwenden

- Informationssicherheit
    - Alle Daten und Informationen durch Massnahmen schützen
    - Wir durch Gesetze, Standards und Normen reguliert

- IT-/Cyber-Sicherheit
    - Schutz von IT-Systemen, Netzen und Anwendungen vor Angriffen und Ausfall
    - Fokus auf technische Infrastruktur

- Datenschutz
    - Personenbezogene Daten
    - Reguliert durch das Datenschutzgesetz (DSG)

- Integrale Sicherheit
    - Ganzheitliche Sicht auf Sicherheit einer Organisation
    - Umfasst IMS, physische Sicherheit, Personensicherheit und Notfall sowie Krisenmanagement

- Funktionale Sicherheit (Safety)
    - Schutz von Leib und Leben, Umwelt und Sachwerten
    - Airbags, Notschalter, etc
    - Reguliert durch Normen und Gesetze

##  2. <a name='SW02Self-Awareness'></a>SW02 (Self-) Awareness

###  2.1. <a name='KnnenMalware-Kategorienunterscheiden'></a>Können Malware-Kategorien unterscheiden

####  2.1.1. <a name='Malware'></a>Malware

- Virus
  - Benötigt ein Wirt-Datei/Programm (Träger)
  - Wird durch den Benutzer verbreitet (Datei öffnen / Programm starten)
- Wurm
  - Verbreitet sich selbständig über Netzwerke ohne Benutzerinteraktion
  - Nutzt Sicherheitslücken in Diensten/Protokokllen
- Trojaner
  - Gibt sich als nützliches Programm aus
  - Verbreitet sich nicht selbst
  - Versteckt die Schadfunktion (Keylogger / Backdoor)
- Ransomware
  - Verschlüsselt Daten
  - Fordert Lösegeld


###  2.2. <a name='Kennendie5-SchrittederInformationssicherheitundknnenBeispielefrjedenSchrittgebenunderklren'></a>Kennen die 5-Schritte der Informationssicherheit und können Beispiele für jeden Schritt geben und erklären

####  2.2.1. <a name='SchrittederInformationssicherheit'></a>5 Schritte der Informationssicherheit

1. Sichern (Wiederherstellbarkeit)
    - Backups mit bspw. 3-2-1 Prinzip (3 Kopien, 2 Speichermedien, 1 offline Backup)
    - Desaster-Recovery-Plan
2. Schützen (Angriffe abwehren)
    - Virenschutz, Firewall
3. Überwachen (Mitbekommen wenn etwas passiert)
    - Intrusion Detection, Log-Überwachung
4. Vorbeugen (Risiken reduzieren)
    - Software Updates, Patching, Hardening
5. Aufpassen (Awareness)
    - Verstand benutzen, Schulungen, Gefahren erkennen

###  2.3. <a name='Kennendie3SulenderInformationssicherheit'></a>Kennen die 3 Säulen der Informationssicherheit

####  2.3.1. <a name='SulenderInfomrationssicherheit'></a>3 Säulen der Infomrationssicherheit

1. Gut funktionierende Technik
2. Optimierte und Nachhaltige Prozesse
3. Geschulte und Bewusstsein habende Menschen/Mitarbeiter

##  3. <a name='SW03Intercepten'></a>SW03 Intercepten

###  3.1. <a name='SieknnenerklrenwieeinProxybzw.Reverse-ProxyfunktioniertundwelcheNetzwerkverbindungendabeigemachtwerden'></a>Sie können erklären wie ein Proxy bzw. Reverse-Proxy funktioniert und welche Netzwerkverbindungen dabei gemacht werden

####  3.1.1. <a name='Forward-ProxyundReverse-Proxy'></a>(Forward-) Proxy und Reverse-Proxy

- Ein Forward Proxy ist ein auf Application-Layer agierender Intermediär, der Client-Anfragen entegennimmt, sie im Namen des Clients an Zielserver weiterleitet, optional cached, filtert, authentisiert und loggt.
- Ein Reverse Proxy ist eine auf Application-Layer agierender Intermediär, der Anfragen externer Clients engegennimmt, sie im Namen dieser Clients an interne Backend-Server weiterleitet, Antworten sammelt, ggf. load-balanced, cached, filtert terminiert (TLS) und loggt.

![](img\fwp-vs-rvp.png)

##  4. <a name='SW04Anwendungssicherheit:SessionHandling'></a>SW04 Anwendungssicherheit: Session Handling

###  4.1. <a name='SiekennenOWASPTop102021'></a>Sie kennen OWASP Top 10 (2021)

####  4.1.1. <a name='OWASPTop102021'></a>OWASP Top 10 (2021)

- A01: Broken Access Control
- A02: Cryptographic Failures
- A03: Injection
- A04: Insecure Design
- A05: Security Misconfiguration
- A06: Vulnerable and Outdated Componants
- A07: Identification and Authentication Failures
- A08: Software and Data Integrity Failures
- A09: Security Logging and Monitoring Failures
- A10: Server-Side Request Forgery (SSRF)

###  4.2. <a name='SieknnenAngriffeaufverschiedenenStufendesInternet-Protokoll-Stacksbeschreiben'></a>Sie können Angriffe auf verschiedenen Stufen des Internet-Protokoll-Stacks beschreiben

####  4.2.1. <a name='Angriffe'></a>Angriffe

- Man-in-the-Middle (Netzwerk und Internetschicht)
    - Teilhaben an fremden Sessions
    - Aktiv: Daten abändern bevor sie ankommen
    - Passiv: Zuhören

- Session Hijacking (Anwendungsschicht)
    - Eine laufende Websession eines Benutzers übernehmen

- Session Fixation (Anwendungsschicht)
    - Eine Session offen halten und darauf Transaktionen machen

- SQL-Injections (Anwendungschicht)
    - Abfragen und Manipulieren von Daten auf Datenbanken

- Cross-Site-Scripting (Anwendungsschicht)
    - Script auf Webseiten einbetten, der beim Laden ausgeführt wird

- SYN-Flooding (Transportschicht)
    - Grosse Anzahl Abfragen absenden (bspw. mittels Botnet)

- IP Spoofing (Internet und Netzwerkschicht)
    - IP fälschen

###  4.3. <a name='SieknnenBeispielevonSpoofingOverflowundDoS-Angriffeangeben'></a>Sie können Beispiele von Spoofing, Overflow und DoS-Angriffe angeben

####  4.3.1. <a name='Spoofing'></a>Spoofing

IP-Spoofing

- Angreifer fälscht die Quell-IP-Adesse in Packeten

ARP-Spoofing

- Angreifer gibt sich als Gerät im lokalen Netz oder Default-Gateway aus (fälscht MAC-Adresse)

DNS-Spoofing

- Manipulation von DNS-Antworten, sodass der Resolver die falsche IP antwortet

####  4.3.2. <a name='Overflow'></a>Overflow

Integer Overflow

```c
unsigned char x = 255;
x = x + 1; // das resultat ist 0 (Overflow)
```

Buffer-Overflow

- Zu viele Daten in einem zu kleinen Puffer schreiben
- Bsp: unsichere Funtion wie `gets()` in C verwenden um Return-Adressen zu überschreiben und Code-Auszuführen

DoS / DDoS (Denial of Service)

- SYN-Flooding
    - Viele halboffene TCP-Verbindungen (Nur SYN, kein ACK)
    - Server Ressourcen werden erschöpft

- HTTP-FLood
    - Viele gleichzeitige HTTP-Requests per Botnet 
    - Server Ressourcen werden erschöpft

###  4.4. <a name='SieknneninwenigenStzenbeschreibenwieARP-SpoofingSYN-FloodingDistributedReflectionDenialofServiceundHeartbleedablaufen'></a>Sie können in wenigen Sätzen beschreiben wie ARP-Spoofing, SYN-Flooding, Distributed Reflection Denial of Service und Heartbleed ablaufen

####  4.4.1. <a name='DistributedReflectionDenialofServiceDRDoS'></a>Distributed Reflection Denial of Service (DRDoS)

Bei einem DRDoS-Angriff fälscht der Angreifer die Quell-IP-Adresse seiner Pakete so, dass sie auf die IP des Opfers zeigen. Er schickt diese Pakete an viele sogenannte Reflektoren (z. B. offene DNS-, NTP- oder andere UDP-Server). Diese Reflektoren antworten dann alle an das Opfer, nicht an den Angreifer – oft mit größeren Antworten als die Anfrage (Amplification). So wird das Opfer mit einer riesigen Menge Traffic überflutet und der Dienst fällt aus.

####  4.4.2. <a name='Heartbleed'></a>Heartbleed

Heartbleed ist eine Schwachstelle in OpenSSL (Heartbeat-Erweiterung von TLS). Der Angreifer sendet ein spezielles Heartbeat-Request, bei dem die angegebene Länge der Nutzdaten größer ist als die tatsächlich gesendeten Daten. Die fehlerhafte Implementierung prüft dies nicht korrekt und schickt dem Angreifer daraufhin zusätzlich Speicherinhalte des Servers zurück (bis zu 64 KB). So können z. B. Passwörter, Session-Cookies oder sogar private Schlüssel aus dem Arbeitsspeicher ausgelesen werden.

###  4.5. <a name='SieknneneinfacheInteger-Overflow-Angriffeselbstausfhren'></a>Sie können einfache Integer-Overflow-Angriffe selbst ausführen

Beispiel in Java

```java
public class IntegerOverflowDemo {
    public static void main(String[] args) {
        int x = Integer.MAX_VALUE;   // 2_147_483_647
        System.out.println("Vor Overflow:  " + x);

        x = x + 1; // Overflow passiert hier
        System.out.println("Nach Overflow: " + x);
    }
}
```

In Java führen Ganzzahlen (int, long) bei Überlauf nicht zu einer Exception, sondern zu einem Wrap-around im Zweierkomplement – das kann von Angreifern ausgenutzt werden (z. B. um Längenprüfungen oder Limits zu umgehen).

###  4.6. <a name='SiekennendiesicherheitsrelevantenServer-Headersundknnendiesekorrektsetzen'></a>Sie kennen die sicherheitsrelevanten Server-Headers und können diese korrekt setzen

####  4.6.1. <a name='Strict-Transport-Security'></a>Strict-Transport-Security

Erzwingt HTTPS im Browser

```http
Strict-Transport-Security: max-age=31536000; includeSubDomains; preload
```

####  4.6.2. <a name='X-Content-Type-Options'></a>X-Content-Type-Options

Verhindert MIME-Type-Sniffing, Browser benutzt den deklarierten Content-Type

```http
X-Content-Type-Options: nosniff
```

####  4.6.3. <a name='X-Frame-Options'></a>X-Frame-Options

Schützt vor Clickjacking, indem Framing eingeschränkt wird

```http
X-Frame-Options: SAMEORIGIN
```

####  4.6.4. <a name='Content-Security-PolicyCSP'></a>Content-Security-Policy (CSP)

Begrenzt, woher Inhalte (Scripts, Styles, Bilder, etc.) geladen werden dürfen

```http
Content-Security-Policy: default-src 'self'; script-src 'self';
```

####  4.6.5. <a name='Referrer-Policy'></a>Referrer-Policy

Steuert, welche Referrer-Infos (URL des Ursprungs) mitgeschickt werden

```http
Referrer-Policy: strict-origin-when-cross-origin
```

####  4.6.6. <a name='Permissions-Policy'></a>Permissions-Policy

Begrenzt Browser-APIs (Kamera, Mikrofon, Geolocation, usw.).

```http
Permissions-Policy: geolocation=(), microphone=(), camera=()
```

####  4.6.7. <a name='Cookie-Attributekeinheader'></a>Cookie-Attribute (kein header)

```http
Set-Cookie: SESSIONID=abc123; Secure; HttpOnly; SameSite=Strict
```


###  4.7. <a name='SieknneninwenigenStzenbeschreibenwaseineSessionistundwissenwelcheEigenschafteneinesichereSessionausmacht'></a>Sie können in wenigen Sätzen beschreiben, was eine Session ist und wissen, welche Eigenschaften eine sichere Session ausmacht

####  4.7.1. <a name='WasisteineSession'></a>Was ist eine Session?

Eine Session ist eine zustandsbehaftete Verbindung zwischen Client und Server über mehrere HTTP-Requests hinweg. Da HTTP selbst zustandslos ist, merkt sich der Server den Benutzerzustand (Login, Warenkorb, Rollen etc.) mithilfe einer Session-ID, die meist in einem Cookie gespeichert wird.

> Der Server merkt sich wer du bist, und was du gerade tust

####  4.7.2. <a name='EigenschafteneinersicherenSession'></a>Eigenschaften einer sicheren Session

- Zufällige, lange, nicht vorhersagbare Session-ID (kryptographisch starke Randomness)
- bertragung nur über HTTPS (Schutz vor Mitlesen/Diebstahl)
- Session-ID z. B. im Cookie mit Secure und HttpOnly gespeichert
- Zeitliche Begrenzung (Session-Timeout, Inaktivitäts-Timeout)
- Regeneration der Session-ID nach Login (Schutz vor Session-Fixation)
- Sauberes Logout (Session-Invalidierung auf dem Server)
- Optional: Bindung an Kontext (z. B. User-Agent / IP) für zusätzliche Sicherheit.

###  4.8. <a name='SiekennendeSame-Origin-PolicyundwissenwiesiebeiCookieswirkt'></a>Sie kennen de Same-Origin-Policy und wissen, wie sie bei Cookies wirkt

Browser senden Cookies anhand von Domain/Pfad, aber lesen kann sie per JavaScript nur Code aus derselben Origin. Das ist der Schutz durch die Same-Origin-Policy.

###  4.9. <a name='SieknneninwenigenStzeneinenAngriffmitSession-Fixationbeschreiben'></a>Sie können in wenigen Sätzen einen Angriff mit Session-Fixation beschreiben

####  4.9.1. <a name='AblaufeinesSession-FixationAngriffs'></a>Ablauf eines Session-Fixation Angriffs

1. Der Angreifer erhält vom Server eine gültige Session-ID (bspw. durch Aufruf einer Login-Seite)
2. Er gibt die Session-ID an das Opfer weiter (bspw. per manipulierter Link: `...?SESSIONID=12345)
3. Der Opfer benutzt das Link und loggt sich mit dieser Session-ID ein
4. Da der Server diesselbe Session-ID wiederverwendet ist der Angreifer nun eingeloggt

###  4.10. <a name='SieknneneinsicheresSession-ManagementmitCookiesimplementieren'></a>Sie können ein sicheres Session-Management mit Cookies implementieren

1. Session-ID sicher erzeugen
    - Kryptographisch starke Zufallszahl (z. B. 128+ Bit Entropie)
    - Keine Infos über Benutzer, Zeit, IP o. Ä. kodieren
    - Auf Serverseite in einer Session-Tabelle speichern (User-ID, Rolle, Timeout, …)

2. Session-ID nur im Cookie speichern
    - Keine Session-ID in URL, GET-Parametern oder Hidden-Feldern

3. Sichere Cookie-Attribute setzen
    - Secure → nur über HTTPS senden
    - HttpOnly → nicht per JavaScript auslesbar (Schutz vor XSS-Diebstahl)
    - SameSite=Lax/Strict → Schutz vor CSRF
    - Path=/ → nur dort, wo nötig
    - Domain nur setzen, wenn wirklich Subdomains teilen sollen

4. Session-Lebensdauer begrenzen
    - Inaktivitäts-Timeout (z. B. nach 15–30 Minuten ohne Aktivität)
    - Optional: absolutes Timeout (z. B. nach 8 Stunden unabhängig von Aktivität)
    - Beim Logout: Session serverseitig invalidieren, Cookie überschreiben/ablaufen lassen.

5. Session-ID-Regeneration
    - Nach Login und bei Rechtewechsel (z. B. User → Admin) eine neue Session-ID ausgeben
    - Alte Session ungültig machen
    - Schutz vor Session-Fixation

##  5. <a name='SW05SymmetrischeKryptologie'></a>SW05 Symmetrische Kryptologie

###  5.1. <a name='SieverstehenwassymmetrischeKryptographieistwelcheArtenvonSicherheitundAngriffsartenesgibt'></a>Sie verstehen was symmetrische Kryptographie ist, welche Arten von Sicherheit und Angriffsarten es gibt

Symmetrische Kryptographie benutzt denselben geheimen Schlüssel zum Verschlüsseln und Entschlüsseln

- Beipiele: AES, ChaCha20
- Wird vorallem bei grossen Datenmengen verwendet (schnell) um ihre Vertraulichkeit zu gewähren

####  5.1.1. <a name='ArtenanSicherheitbeisymmetrischeKryptographie'></a>Arten an Sicherheit bei symmetrische Kryptographie

- Vertraulichkeit: Aus dem Ciphertext kann nichts über den Klartext gelernt werden
- Integrität: Mit MAC/HMAC kann erkannt werden ob die Daten verändert wurden
- Authentizität: Mit einer Signatur erkennen ob der Sender der richtige ist

####  5.1.2. <a name='AngriffsartenaufsymmetrischeKryprographie'></a>Angriffsarten auf symmetrische Kryprographie

- Ciphertext-only attack (COA)
    - Nur der Ciphertext bekannt
- Known-plaintext attack (KPA)
    - Einige Paare aus Ciphertext und Klartext bekannt
- Chosen-plaintext attack (CPA)
    - Beliebige Klartext können verschlüsselt werden
- Chosen-ciphertext attack (CPA)
    - Beliebige Ciphertexte können entschlüsselt werden
- Brute-Force
    - Alle mögliche Schlüssel werden getestet
- Krypto-Analyse
    - Ausnützen der Schwächen des Algorithmus
- Side-Channel attack
    - Informationen über den Schlüssel per analyse von Stromverbrauch, Dauer, Cache-Zugriffe gewinnen

###  5.2. <a name='SieverstehenwaseineHashfunktionistundwelcheEigenschafteneinekryptographischeHashfunktionausmachenbzw.wasesheisstwenneineHashfunktiongebrochenist'></a>Sie verstehen was eine Hashfunktion ist und welche Eigenschaften eine kryptographische Hashfunktion ausmachen, bzw. was es heisst wenn eine Hashfunktion gebrochen ist

####  5.2.1. <a name='EigenschafteneinerkryptographischenHashfunktion'></a>Eigenschaften einer kryptographischen Hashfunktion

Damit eine Hashfunktion kryptographisch sicher ist, soll sie:

- Einwegfunktion (Preimage-Resistenz)
    - Aus dem Hashwert soll es praktisch unmöglich sein, die ursprüngliche Eingabe zu berechnen. (Gegeben H, finde M mit H(M) = H.)

- Zweite-Präimage-Resistenz
    - Zu einer gegebenen Nachricht M₁ soll man keine zweite Nachricht M₂ ≠ M₁ finden können, die denselben Hash hat. (Gegeben M₁, finde M₂ mit H(M₁) = H(M₂).)

- Kollisionsresistenz
    - Es soll sehr schwer sein, irgendein Paar M₁ ≠ M₂ zu finden, mit H(M₁) = H(M₂). (Noch stärkeres Kriterium als Zweite-Präimage.)

####  5.2.2. <a name='GebrocheneHashfunktion'></a>Gebrochene Hashfunktion

Eine Hashfunktion gilt als gebrochen, wenn eine oder mehrere dieser Eigenschaften praktisch angreifbar sind, z. B.:

- Es gibt effiziente Verfahren, um Kollisionen zu finden (z. B. bei MD5, SHA-1 → nicht mehr für Signaturen verwenden).
- Preimage- oder Zweite-Präimage-Angriffe sind deutlich besser als Brute-Force.

###  5.3. <a name='SiekennenverschiedeneAnwendungenvonHashfunktionenundknnenmitHilfevonHashfunktionendieIntegrittvonnachrichtensicherstellen'></a>Sie kennen verschiedene Anwendungen von Hashfunktionen und können mit Hilfe von Hashfunktionen die Integrität von nachrichten sicherstellen

####  5.3.1. <a name='AnwendungvonHashfunktionen'></a>Anwendung von Hashfunktionen

- Integritätsprüfung von Dateien/Nachrichten
    - Download-Checksums (SHA-256 auf Website, lokal vergleichen).

- Passwortspeicherung
    - Passwort wird gehasht (+ Salt), nicht im Klartext gespeichert.

- Digitale Signaturen
    - Es wird nicht die ganze Nachricht signiert, sondern ihr Hashwert.
    - schneller und standardisiert (z. B. „Signatur über SHA-256-Hash“).

- Message Authentication Codes (MAC / HMAC)
    - Hash + geheimer Schlüssel, um Integrität und Authentizität sicherzustellen.

- Deduplication / Fingerprinting
    - Hashwerte als „Fingerabdruck“ von Dateien/Blöcken (Dubletten-Erkennung).

####  5.3.2. <a name='IntegrittmitHashfunktionensicherstellen'></a>Integrität mit Hashfunktionen sicherstellen

1. Sender berechnet: h = H(Nachricht)
2. Sender schickt: Nachricht + Hashwert h
3. Empfänger berechnet selbst H(Nachricht_empfangen) und vergleicht mit h.
    - Gleich → Nachricht unverändert
    - Ungleich → Nachricht verändert / beschädigt

Sicherer (authentifizierter) Ansatz: HMAC
- Statt nur H(Nachricht): HMAC = H(geheimer_Schlüssel || Nachricht)
- Nur wer den Schlüssel kennt, kann einen gültigen HMAC erzeugen → schützt vor Manipulation durch Dritte (Integrität + Authentizität).

###  5.4. <a name='SiewissenwelcheAlgorithmensichersind'></a>Sie wissen, welche Algorithmen sicher sind

- AES (128/192/256 Bit), in sicheren Modi wie:
- GCM, CCM (authenticated encryption)
- CTR, CBC mit korrekt implementiertem IV + MAC
- ChaCha20-Poly1305
- SHA-256, SHA-384, SHA-512

Nicht mehr sicher / veraltet:

- DES, 3DES
- alte Stream-Cipher wie RC4
- MD2, MD4, MD5

##  6. <a name='SW06AsymmetrischeKryptologie'></a>SW06 Asymmetrische Kryptologie

###  6.1. <a name='SieverstehenwasPublic-Key-Kryptographieist'></a>Sie verstehen was Public-Key-Kryptographie ist

Die Grundidee ist, was it dem Public Key verschlüsselt wird, kann nur mit dem Private Key entschlüsselt werden

###  6.2. <a name='SiekennendiegngigenasymmetrischenundhybridenVerschlsselungs-undSignaturalgorithmenwissenworaufderenSicherheitbasiertundwiesieinderPraxisangewendetwerden'></a>Sie kennen die gängigen asymmetrischen und hybriden Verschlüsselungs- und Signaturalgorithmen, wissen worauf deren Sicherheit basiert und wie sie in der Praxis angewendet werden

- RSA
    - Schwierigkeit der Faktorisierung grosser Zahlen (Produkt zweier grossen Primzahlen)

- Diffie-Hellman (DH, DHE)
    - Diskretes Logarithmusproblem in endlichen Gruppen (Modulo grosser Primzahlen)

- Elliptic Curve Cryptography (ECC)
    - ECDH (Elliptic Curve Diffie-Hellman)
    - ECDSA (Ellipic Curve Singature Algorith)
    - EdDSA (Curve25519)

###  6.3. <a name='SiewissenwaskryptographischsichereZufallszahlensindundwodieseverwendetwerden.SieknnenschwachgewhlteZufallszahlenfrAngriffeausntzen'></a>Sie wissen was kryptographisch sichere Zufallszahlen sind und wo diese verwendet werden. Sie können schwach gewählte Zufallszahlen für Angriffe ausnützen

Kryptographisch sichere Zufallszahlen sind Zahlenfolgen, die

- unvorhersagbar sind (auch wenn man viele frühere Werte kennt),
- eine gute Verteilung haben (keine „Muster“),
- und aus einem CSPRNG (Cryptographically Secure Pseudo Random Number Generator) stammen.

####  6.3.1. <a name='WiekanneinAngreiferdasausnutzen'></a>Wie kann ein Angreifer das ausnutzen?

Wenn Session-IDs / Tokens aus einem vorhersagbaren Generator kommen:

1. Angreifer beobachtet einige Tokens,
2. rekonstruiert oder schätzt das RNG-Verhalten (Seed, Algorithmus),
3. kann zukünftige oder benachbarte Werte erraten.

###  6.4. <a name='SiewissenwaseinePublic-Key-InfrastruktureineCertificateAuthorityundeinZertifikatistwofrdieseverwendetwerdenundwieZertifikateausgestelltwerden'></a>Sie wissen was eine Public-Key-Infrastruktur, eine Certificate Authority und ein Zertifikat ist, wofür diese verwendet werden und wie Zertifikate ausgestellt werden

Eine PKI ist das Gesamtsystem aus Rollen, Prozessen und Technologien, das digitale Zertifikate ausstellt, verwaltet, prüft und widerruft. Sie besteht aus:

- Root-CA und evtl. Intermediate-CAs
- Richtlinien/Prozesse (Certificate Policy, CPS)
- Verzeichnisse (Zertifikats- und Sperrlisten-Server)
- Mechanismen zur überprüfung (CRL. OCSP)

####  6.4.1. <a name='AustellungvonZertifikaten'></a>Austellung von Zertifikaten

1. Schlüsselpaar erzeugen
    - Server/Client erzeugt Private + Public Key.

2. CSR (Certificate Signing Request) erstellen
    - Enthält Public Key + Identitätsdaten (z. B. Domainname).
    - Wird mit dem Private Key des Antragstellers signiert.

3. CA prüft den Antrag
    - z. B. Domainkontrolle (DNS, HTTP-Validierung), Identitätsprüfung (Organisation).
    - CA stellt Zertifikat aus

4. CA signiert den Public Key + Identitätsdaten mit ihrem CA-Private-Key.
    - Ergebnis: Zertifikat, das eine Kette zur Root-CA hat.

5. Verteilung & Nutzung
    - Zertifikat wird z. B. auf einem Webserver installiert.
    - Browser prüft:
        - Signatur (stimmt mit CA überein?)
        - Gültigkeit (Datum, Sperrstatus via CRL/OCSP)
        - Name (passt Domain?)

###  6.5. <a name='SiewissenwasSSLTLSistwelcheFunktionalitteserreichtundwiedasProtokollkonzeptionellabluft'></a>Sie wissen was SSL/TLS ist, welche Funktionalität es erreicht und wie das Protokoll konzeptionell abläuft

SSL/TLS ist ein kryptographisches Protokoll zwischen Transport- und Anwendungsschicht, das Verbindungen z. B. für HTTPS, IMAPS, SMTPS, VPNs absichert.

####  6.5.1. <a name='AblaufSSLTLS'></a>Ablauf SSL/TLS

TCP-Handshake (SYN / SYN-ACK / ACK)
1. Client → Server: SYN
    - Client will Verbindung zu server:443 (HTTPS)
    - Schickt ein TCP-Paket mit SYN-Flag (Start Verbindungsaufbau).

2. Server → Client: SYN-ACK
    - Server antwortet mit SYN + ACK, wenn Port offen und akzeptiert.

3. Client → Server: ACK
    - Client bestätigt mit ACK → TCP-Verbindung steht.

Jetzt startet der TLS-Handshake:

4. ClientHello (Client → Server)
    - Der Client sendet eine TLS-„ClientHello“-Nachricht, z. B.: 
        - unterstützte TLS-Versionen (z. B. 1.2, 1.3) 
        - Liste der Cipher Suites (z. B. TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256)
        - Zufallswert (Client Random)
        - Extensions (z. B. SNI = Hostname, ALPN, etc.)

    - Das Paket ist: TCP (ACK) + TLS-Record mit ClientHello.

5. ServerHello, Zertifikat, (Key Exchange: Server → Client)
    - Der Server antwortet mit einer Reihe von TLS-Nachrichten (oft in einem oder mehreren TCP-Paketen):
        - ServerHello
        - Wählt TLS-Version (z. B. TLS 1.3)
        - Wählt eine Cipher Suite aus der Client-Liste
        - Schickt eigenen Zufallswert (Server Random)
    
    - Zertifikat
        - Enthält Server-Zertifikat (CN=www.example.com, Public Key, CA-Signatur)
        - Dient der Authentisierung des Servers

    - Key-Exchange-Nachricht (z. B. ServerKeyExchange bei (EC)DHE in älteren TLS-Versionen)
        - Enthält DH/ECDH-Parameter, mit denen der Client später einen gemeinsamen Schlüssel berechnen kann.

    - Ebenfalls alles als TLS-Records über TCP (ACK).

6. Schlüsselaustausch (z. B. ECDHE Client → Server)
    - Der Client:
        - Prüft das Zertifikat: 
            - Kette zur vertrauenswürdigen Root-CA?
            - Domain passend?
            - Noch gültig? Nicht widerrufen?

        - Berechnet auf Basis der Server-Parameter (z. B. ECDHE) seinen Anteil am Schlüsselaustausch und sendet:
            - ClientKeyExchange (bei TLS 1.2, oder entsprechende Nachricht bei TLS 1.3)
            - Damit kann der Server denselben Pre-Master-Secret berechnen.

    - Beide Seiten (Client & Server) leiten daraus den symmetrischen Sitzungsschlüssel und weitere Schlüsselmaterialien (MAC/AEAD-Keys etc.) ab.

7. Wechsel auf verschlüsselte Kommunikation
    - Noch zwei wichtige Nachrichten:
        - Client → Server: ChangeCipherSpec + Finished
            - Signal: „Ab jetzt benutze ich die ausgehandelten Schlüssel und die ausgewählte Cipher Suite.“
            - Finished-Nachricht ist schon mit dem neuen Schlüssel gesichert und enthält eine Art MAC über den bisherigen Handshake → schützt die Integrität des Handshakes.

        - Server → Client: ChangeCipherSpec + Finished
            - Server macht dasselbe: wechselt auf Verschlüsselung und bestätigt den Handshake.

Ab jetzt laufen alle HTTP-Daten (z. B. GET / POST) innerhalb von TLS-Records verschlüsselt über die bestehende TCP-Verbindung.

##  7. <a name='SW07AnforderungenkryptographischeProtokolle'></a>SW07 Anforderungen kryptographische Protokolle

- Vertraulichkeit
    - Nur berechtigte Parteien können Nachrichten lesen.
    - Wichtig, damit Angreifer beim Mitschneiden (z. B. WLAN, Internet) nichts verstehen.
    - Beispiel: Online-Banking, Messenger.

- Integrität
    - Nachrichten dürfen nicht unbemerkt verändert werden.
    - Wichtig, damit Angreifer keine Beträge, Empfänger oder Befehle manipulieren können.
    - Beispiel: Überweisungsbetrag in einer Banking-Transaktion darf unterwegs nicht geändert werden.

- Authentizität
    - Empfänger kann prüfen, von wem eine Nachricht stammt.
    - Wichtig, um Man-in-the-Middle und Identitätsdiebstahl zu verhindern.
    - Beispiel: Der „Bankserver“ weist mit einem Zertifikat nach, dass er wirklich die Bank ist.

- Frische / Schutz vor Replay
    - Alte Nachrichten dürfen nicht einfach wiederverwendet werden.
    - Wichtig, damit z. B. eine Zahlungsanweisung nicht mehrfach ausgeführt werden kann.
    - Beispiel: Verwendung von Nonces oder Timestamps in Protokollen.

- Verbindlichkeit / Nichtabstreitbarkeit
    - Der Sender kann später nicht bestreiten, eine Nachricht gesendet oder unterschrieben zu haben.
    - Wichtig bei Prozessen mit Rechtswirkung (Verträge, Bestellungen, E-Voting).
    - Beispiel: Digitale Signatur auf einem elektronischen Vertrag.

- Zurechenbarkeit / Accountability
    - Aktionen sind einer Identität zuordenbar (Person, Rolle, System).
    - Wichtig für Forensik, Audits und das Aufklären von Sicherheitsvorfällen.
    - Beispiel: Protokollierung, welcher Benutzer welche Admin-Aktion ausgelöst hat.

- Perfect Forward Secrecy (PFS)
    - Kompromittierte Langzeitschlüssel dürfen vergangene Sitzungen nicht nachträglich angreifbar machen.
    - Wichtig, wenn aufgezeichneter Traffic langfristig vertraulich bleiben muss.
    - Beispiel: Ephemeres (EC)Diffie-Hellman in TLS (ECDHE-Ciphersuites).

- Robustheit & Fehlertoleranz
    - Protokoll verhält sich bei Fehlern und Angriffen definiert und möglichst informationsarm.
    - Wichtig, damit Fehlermeldungen oder Sonderfälle keine zusätzlichen Angriffspunkte bieten.
    - Beispiel: Knappe, generische Fehlermeldungen bei TLS/Authentifizierungsfehlern.

- Effizienz & Praktikabilität
    - Protokoll muss mit vertretbarem Rechenaufwand und Latenz funktionieren.
    - Wichtig, damit es in der Praxis korrekt implementiert und nicht „aus Performance-Gründen“ unsicher umgangen wird.
    - Beispiel: TLS 1.3 mit reduziertem Handshake-Overhead gegenüber älteren Versionen.

##  8. <a name='SW09Risiko-Management'></a>SW09 Risiko-Management

###  8.1. <a name='KnnendieBegriffeBedrohungSchwachstelleExpositionAssetimCyberraumanBeispielenerklren'></a>Können die Begriffe Bedrohung, Schwachstelle, Exposition, Asset im Cyberraum an Beispielen erklären

- Asset
    - Etwas, das für die Firma einen Wert hat und geschützt werden muss.
    - Kann technisch oder nicht-technisch sein (Daten, Systeme, Prozesse, Menschen).
    - Beispiel (Cyber): Kundendatenbank, Webshop-Server, Active-Directory, Quellcode-Repository.

- Bedrohung
    - Potenzielle Ursache eines unerwünschten Ereignisses.
    - Nutzt Schwachstellen aus oder trifft auf exponierte Assets.
    - Beispiel (Cyber): Ransomware-Gruppe, Angreifer im Internet, Fehlbedienung durch Mitarbeitende, Feuer im Rechenzentrum.

- Schwachstelle (Vulnerability)
    - Eine Schwäche in Systemen, Prozessen oder Konfigurationen, die eine Bedrohung ausnutzen kann.
    - Beispiel (Cyber): Ungepatchte Software, Standard-Admin-Passwort, fehlende Zugangskontrollen, falsch konfigurierte Firewall-Regel.

- Exposition
    - Beschreibt, wie stark ein Asset einer Bedrohung ausgesetzt ist.
    - Hängt z. B. von Erreichbarkeit, Sichtbarkeit und Angriffsfläche ab.
    - Beispiel (Cyber): 
        - Ein Webserver mit offenem Port 80/443 ins Internet hat hohe Exposition.
        - Eine Datenbank nur im internen Netz, ohne direkten Internetzugang, hat geringere Exposition.

###  8.2. <a name='KnnenRisikensystematischidentifizieren'></a>Können Risiken systematisch identifizieren

- Risiken systematisch identifizieren
    - Ziel: Alle relevanten Risiken strukturiert erfassen, nicht nur „aus dem Bauchgefühl“.
    - Vorgehen (vereinfacht):
        1. Kontext klären:
            - Welche Systeme, Prozesse, Daten (Assets) sind im Scope?
            - Beispiel: Webshop, Kundendatenbank, Zahlungsabwicklung.
        2. Assets aufnehmen:
            - Liste der wichtigen Assets erstellen (Daten, Systeme, Services).
        3. Bedrohungen erfassen:
            - Mögliche Bedrohungsquellen sammeln:
                - Cyberkriminelle, Mitarbeitende, technische Fehler, Naturereignisse.
            - Bedrohungskataloge / Checklisten nutzen (z. B. BSI, OWASP).
        4. Schwachstellen identifizieren:
            - Technische und organisatorische Schwächen suchen:
                - Ungepatchte Systeme, schwache Passwörter, fehlende Prozesse.
            - Quellen: Penetrationstests, Vulnerability-Scanner, Audits.
        5. Exposition bewerten:
            - Wie stark sind die Assets den Bedrohungen ausgesetzt?
                - Internetzugang, externe Schnittstellen, Remote-Zugriffe.
        6. Risiken formulieren:
            - Kombination aus Bedrohung + Schwachstelle + Asset + Exposition.
            - Beispiel: „Ransomware nutzt ungepatchten Fileserver im Firmennetz aus → Produktionsstillstand.“
    - Wichtig:
        - Systematisches Vorgehen (z. B. Asset-Liste, Bedrohungskatalog, Workshops).
        - Dokumentation der gefundenen Risiken (Risikoliste / Risikoregister).

###  8.3. <a name='KennendasVorgehenimqualitativenRisiko-Assessmentundknnenesbeispielhaftanwenden'></a>Kennen das Vorgehen im qualitativen Risiko-Assessment und können es beispielhaft anwenden

- Qualitatives Risiko-Assessment
    - Ziel:
        - Risiken nach **Eintrittswahrscheinlichkeit** und **Schadensausmass** in Klassen (z. B. niedrig/mittel/hoch) einteilen.
        - Kein exakter CHF-Betrag, sondern **qualitative Bewertung**.
    - Vorgehen (Schritte):
        1. Risiken sammeln:
            - Aus Risikoliste / Workshops / Bedrohungs- & Schwachstellenanalyse.
            - Beispiel: „Ransomware auf Fileserver“, „Datenleck Kundendaten“.
        2. Bewertungsskalen festlegen:
            - Eintrittswahrscheinlichkeit (E): z. B. 1–5 oder niedrig/mittel/hoch.
            - Schadensausmass (S): z. B. 1–5 oder niedrig/mittel/hoch.
            - Risiko (R): Kombination aus E und S (z. B. R = E × S oder Matrix).
        3. Risiken bewerten:
            - Für jedes Risiko E und S abschätzen und **begründet dokumentieren**.
            - Beispiel:
                - Ransomware auf Fileserver: E = hoch, S = hoch.
                - Kurz begründen: „Viele Phishing-Mails, Fileserver geschäftskritisch.“
        4. Risikomatrix (Risk-Map) erstellen:
            - Risiken in eine **Matrix E vs. S** eintragen.
            - So werden **kritische Risiken** (z. B. hoch/hoch) sichtbar.
        5. Akzeptanzlinie ziehen:
            - Festlegen, welche Risiko-Kombinationen **akzeptabel** sind und welche nicht.
            - Risiken oberhalb der Linie → **Massnahmen nötig**.
    - Beispiel (kurz):
        - Risiko: „Ransomware legt Produktionsdateiserver lahm.“
        - E = 4 (von 5) → häufig.
        - S = 5 (von 5) → sehr hoher Schaden.
        - R = 20 → in Rot-Bereich der Matrix → Massnahmen erforderlich (z. B. Backup-Strategie, Patch-Management, Awareness)

###  8.4. <a name='KennenStrategienzurminimierungvonRisiken'></a>Kennen Strategien zur minimierung von Risiken

- Strategien zur Minimierung von Risiken
    - Ziel:
        - Mit passenden Strategien den **Risikowert (Eintritt × Schaden)** senken.
        - Nicht jedes Risiko kann vollständig eliminiert werden → bewusster Umgang.

    1. Risiko vermeiden (Risk Avoidance)
        - Risikoquelle ganz eliminieren, indem man eine Aktivität **nicht durchführt**.
        - Beispiel:
            - Verzicht auf öffentlich erreichbare Remote-Administration.
            - Kein Speichern besonders heikler Daten, wenn nicht zwingend nötig.
        - Effekt:
            - Eintrittswahrscheinlichkeit wird auf (nahe) 0 reduziert.

    2. Risiko vermindern / reduzieren (Risk Mitigation)
        - Eintrittswahrscheinlichkeit und/oder Schadensausmass **senken**.
        - Technische Massnahmen:
            - Firewalls, Patching, Härtung, Verschlüsselung, Netzwerksegmentierung.
        - Organisatorische Massnahmen:
            - Prozesse, Schulungen, Vier-Augen-Prinzip, Richtlinien.
        - Typen von Massnahmen:
            - Präventiv: Angriff verhindern (z. B. Security-Updates, Härtung).
            - Detektiv: Angriff erkennen (z. B. Logging, Monitoring, IDS).
            - Korrektiv: Schaden begrenzen / wiederherstellen (z. B. Backups, Incident Response).
        - Beispiel:
            - Ransomware-Risiko reduzieren durch Patch-Management + Backup-Strategie.

    3. Risiko übertragen (Risk Transfer)
        - Risiko (teilweise) auf Dritte abwälzen.
        - Beispiel:
            - Cyber-Versicherung abschliessen.
            - Outsourcing an Cloud-/Serviceprovider mit vertraglich geregelter Haftung.
        - Wichtig:
            - Risiko „verschwindet“ nicht komplett, aber die **finanzielle Last** kann verschoben werden.

    4. Risiko akzeptieren (Risk Acceptance)
        - Risiko bleibt bestehen; wird bewusst **in Kauf genommen**.
        - Gründe:
            - Kosten von Massnahmen höher als erwarteter Schaden.
            - Restrisiko nach allen sinnvollen Massnahmen.
        - Wichtig:
            - Entscheidung muss **bewusst dokumentiert** und vom Management getragen sein.

##  9. <a name='SW11Vulnerabilities'></a>SW11 Vulnerabilities

###  9.1. <a name='WissenwasVulnerabilitiessind'></a>Wissen, was "Vulnerabilities" sind

- Vulnerabilities (Schwachstellen)
    - Definition:
        - Eine Schwachstelle ist eine **Schwäche in Systemen, Anwendungen, Prozessen oder Konfigurationen**, 
          die von einer Bedrohung **ausgenutzt werden kann**, um Schaden zu verursachen.
    - Beispiele (Cyber):
        - Ungepatchte Software mit bekanntem Exploit.
        - Standard- oder schwache Passwörter (z. B. "admin/admin").
        - Fehlkonfigurierte Firewall (z. B. unnötig offene Ports ins Internet).
        - Webanwendung ohne Input-Validierung → SQL-Injection/XSS möglich.
    - Wichtig:
        - Eine Schwachstelle allein verursacht noch keinen Schaden.
        - Erst zusammen mit einer **Bedrohung** und einem **Asset** entsteht ein **Risiko**.

###  9.2. <a name='DieBedeutungdesDisclosure-ProzesseseinerVulnerabilityverstehen'></a>Die Bedeutung des Disclosure-Prozesses einer Vulnerability verstehen

- Disclosure-Prozess einer Vulnerability
    - Bedeutung:
        - Beschreibt, **wie** und **wann** Informationen über eine Sicherheitslücke (Vulnerability)
          an Hersteller, Betroffene und die Öffentlichkeit weitergegeben werden.
        - Ziel: **Sicherheit erhöhen**, ohne unnötig Angriffsfläche zu schaffen.

    - Typische Schritte (vereinfacht):
        1. Entdeckung:
            - Forscher, Pentester oder Angreifer findet eine Schwachstelle.
        2. Meldung an Hersteller / Betreiber:
            - Verantwortungsvolles Vorgehen: direkte Meldung an Vendor / CERT,
              mit technischen Details und ggf. PoC.
        3. Frist zur Behebung:
            - Dem Hersteller wird eine **angemessene Zeit** gegeben, um einen Patch zu entwickeln (z. B. 30–90 Tage).
        4. Patch / Fix:
            - Hersteller veröffentlicht Update / Gegenmassnahmen.
        5. Veröffentlichung der Details:
            - Nach oder zeitgleich mit dem Patch werden Details zur Schwachstelle veröffentlicht
              (Advisory, CVE-Eintrag), damit Administratoren reagieren können.

    - Warum ist der Disclosure-Prozess wichtig?
        - Verhindert **Zero-Day-Missbrauch**:
            - Wenn eine Lücke sofort öffentlich gemacht wird, können Angreifer sie ausnutzen,
              bevor ein Patch existiert.
        - Ermöglicht **koordiniertes Patchen**:
            - Betreiber können sich vorbereiten und rechtzeitig Updates einspielen.
        - Erhöht **Transparenz und Vertrauen**:
            - Zeigt, dass mit Schwachstellen professionell und nachvollziehbar umgegangen wird.
        - Unterstützt die **Sicherheits-Community**:
            - Forscher werden ermutigt, Lücken verantwortungsvoll zu melden (Responsible / Coordinated Disclosure),
              statt sie zu verkaufen oder auszunutzen.

    - Begriffe:
        - Responsible / Coordinated Disclosure:
            - Gezielte, koordinierte Zusammenarbeit zwischen Finder, Hersteller und ggf. CERT,
              mit Verzögerung der öffentlichen Veröffentlichung bis zur Verfügbarkeit eines Patches.
        - Full Disclosure:
            - Sofortige, vollständige Veröffentlichung der Details – erhöht Druck auf Hersteller,
              aber auch Risiko für Angriffe.

###  9.3. <a name='MethodenzurPriorisierungvonVulnerabilitieskennen'></a>Methoden zur Priorisierung von Vulnerabilities kennen

- Methoden zur Priorisierung von Vulnerabilities
    - Ziel:
        - Nicht alle Schwachstellen können sofort behoben werden.
        - Priorisierung hilft, **zuerst die kritischsten Vulnerabilities** zu behandeln.

    - CVSS-basiert (Common Vulnerability Scoring System)
        - Jede Schwachstelle erhält einen **Score (0.0–10.0)**.
        - Kriterien:
            - Angriffsvektor (Netzwerk/ lokal)
            - Angriffs-Komplexität
            - Erforderliche Rechte
            - Auswirkung auf Vertraulichkeit, Integrität, Verfügbarkeit
        - Nutzung:
            - Hohe CVSS-Scores (z. B. ≥ 7) zuerst behandeln.
            - Basis für automatische Sortierung in Scannern (Nessus, OpenVAS etc.).

    - Risiko-basiert (Risk = Wahrscheinlichkeit × Auswirkung)
        - Neben der technischen Schwere wird auch der **Business-Kontext** betrachtet.
        - Kriterien:
            - Wie wahrscheinlich ist ein Angriff in unserer Umgebung?
            - Welche **Assets** sind betroffen (Produktivsystem, Testsystem)?
            - Welcher **Schaden** entsteht bei Ausnutzung (finanziell, Image, rechtlich)?
        - Nutzung:
            - Vulnerability auf einem kritischen Produktionssystem wird höher priorisiert
              als dieselbe Lücke auf einem isolierten Testsystem.

    - Kontext- & Asset-basiert
        - Priorisierung nach **Kritikalität der betroffenen Systeme**:
            - Kritische Infrastruktur, produktive Datenbanken, AD-Server, Webshop-Frontend.
        - Fragen:
            - Ist das System öffentlich erreichbar (Internet-exponiert)?
            - Sind besonders schützenswerte Daten betroffen (Personendaten, Finanzdaten)?

    - Exploitability / Ausnutzbarkeit
        - Berücksichtigung, wie leicht eine Lücke praktisch ausnutzbar ist.
        - Kriterien:
            - Gibt es **öffentlich verfügbare Exploits** oder PoCs?
            - Wird die Lücke aktiv im Internet angegriffen (Threat-Intel, CERT-Meldungen)?
        - Nutzung:
            - Lücken mit bekannten Exploits und aktiven Angriffen höher einstufen als theoretische Probleme.

    - Patch-/Mitigation-Verfügbarkeit
        - Gibt es bereits einen **Patch oder Workaround**?
        - Systeme mit leicht einspielbaren Updates können schneller gehärtet werden.
        - Kritische Lücke ohne Patch → temporäre **Mitigations** priorisieren
            (z. B. Dienst deaktivieren, Netzwerkzugriff einschränken).

    - Compliance- & Regulatorische Anforderungen
        - Vulnerabilities, die gegen **gesetzliche Vorgaben / Standards** verstossen (z. B. DSG/DSGVO, ISO 27001),
          können höher priorisiert werden.
        - Beispiel:
            - Lücken, die zu Datenschutzverletzungen führen können, höher einstufen.

    - Praktische Kombination
        - In der Praxis werden Methoden kombiniert:
            - CVSS-Score (technische Schwere)
            + Kritikalität des Assets
            + Exploit-Verfügbarkeit / aktive Angriffe
            = Prioritätsstufe (z. B. „High“, „Medium“, „Low“).

##  10. <a name='SW12Anwendungssicherheit:Injection'></a>SW12 Anwendungssicherheit: Injection

###  10.1. <a name='SieknneneinfacheCross-SiteRequestForgery-AngriffeausfhrenundknneneffektiveMassnahmendagegenwhlen'></a>Sie können einfache Cross-Site Request Forgery-Angriffe ausführen und können effektive Massnahmen dagegen wählen

- Was ist CSRF?
    - Ein angemeldeter Benutzer führt unbewusst eine Aktion auf einer Website aus, weil ein Angreifer ihn auf eine präparierte Seite/Request lockt.
    - Der Browser schickt dabei automatisch Cookies/Session mit, sodass die Aktion im Kontext des eingeloggten Users ausgeführt wird.

- Konzeptioneller Ablauf
    - Benutzer ist bei `bank.com` eingeloggt.
    - Benutzer besucht `evil.com`.
    - `evil.com` enthält einen versteckten Request an `bank.com` (z. B. Formular, Bild, Script).
    - Browser schickt die `bank.com`-Cookies automatisch mit → Bank führt Aktion im Namen des Opfers aus.

- Effektive Massnahmen
    - CSRF-Token:
        - Zufälliges, unverhersehbares Token pro Session/Formular.
        - Server prüft bei jeder zustandsverändernden Aktion, ob das Token korrekt ist.
    - SameSite-Cookies:
        - `SameSite=Lax` oder `SameSite=Strict`, um Cookie-Sendungen zwischen Sites einzuschränken.
    - Kritische Aktionen nur mit POST/PUT/DELETE:
        - Keine GET-Requests mit Seiteneffekt.
    - Origin-/Referer-Check:
        - Prüfen, ob der Request von der eigenen Domain kommt.
    - Zusätzliche Bestätigungen:
        - z. B. 2FA oder Passwortabfrage vor sensiblen Aktionen (Passwort ändern, Überweisung).

---

###  10.2. <a name='SieknneninwenigenStzenerklrenwasdasKonzepteinesInjection-Angriffsist'></a>Sie können in wenigen Sätzen erklären, was das Konzept eines Injection-Angriffs ist

- Grundidee
    - Unvertrauenswürdige Eingaben werden in Befehle oder Abfragen eingebettet, ohne korrekt von der Befehlslogik getrennt zu sein.
    - Der Angreifer kann dadurch den ursprünglichen Befehl erweitern oder verändern.

- Allgemeines Muster
    - Anwendung baut z. B. einen String:
        - SQL-Query, Shell-Befehl, LDAP-/XPath-Query, Template, JSON, XML etc.
    - Benutzer-Eingabe landet direkt in diesem String.
    - Angreifer fügt spezielle Zeichen/Strukturen ein, sodass:
        - neue Befehle interpretiert werden,
        - Bedingungen manipuliert werden,
        - Daten offengelegt oder verändert werden.

- Beispiele für Injection-Arten (konzeptionell)
    - SQL Injection: Eingaben verändern eine Datenbankabfrage.
    - Command Injection: Eingaben werden als Teil eines Shell-Kommandos ausgeführt.
    - LDAP-/XPath-/NoSQL-Injection: Ähnliches Prinzip in anderen Query-Sprachen.
    - Template Injection: Eingaben werden als Code innerhalb von Templates ausgewertet.

- Wichtig
    - Problem ist nicht nur „böser Input“, sondern falsche Verarbeitung:
        - fehlende Parametrisierung,
        - fehlendes/kontextloses Escaping.

---

###  10.3. <a name='SieknnendenAblaufvonPathTraversalSQLInjectionundCross-Site-Scripting-AngriffeninwenigenStzenbeschreiben'></a>Sie können den Ablauf von Path Traversal, SQL Injection und Cross-Site-Scripting-Angriffen in wenigen Sätzen beschreiben

- Path Traversal (Directory Traversal)
    - Ziel:
        - Zugriff auf Dateien ausserhalb des vorgesehenen Verzeichnisses.
    - Ablauf:
        - Anwendung nimmt einen Dateinamen/Path aus der Eingabe.
        - Angreifer fügt Pfad-Segmente wie `../` (oder Encodings davon) ein, um in übergeordnete Verzeichnisse zu wechseln.
        - Server prüft den Pfad unzureichend und liest/schickt Dateien, die nicht vorgesehen sind (z. B. Konfigs, Passwörter).
    - Kernproblem:
        - Fehlende oder falsche Normalisierung/Validierung von Dateipfaden.

- SQL Injection
    - Ziel:
        - SQL-Abfragen manipulieren, um unerlaubte Daten zu lesen oder zu verändern.
    - Ablauf:
        - Anwendung baut SQL-String aus statischem Teil + Benutzer-Eingabe (String-Konkatenation).
        - Angreifer fügt SQL-Syntax ein (z. B. logische Operatoren, UNION, Kommentare).
        - Datenbank interpretiert die Eingabe als Teil des Befehls.
        - Resultat: z. B. Auslesen aller Benutzer, Löschen von Tabellen, Umgehen von Logins.
    - Kernproblem:
        - Keine Verwendung von parametrierten Queries / Prepared Statements.

- Cross-Site Scripting (XSS)
    - Ziel:
        - Schad-JavaScript im Browser des Opfers im Kontext einer vertrauenswürdigen Seite ausführen.
    - Ablauf:
        - Anwendung gibt Benutzereingaben im HTML/JS-Kontext aus, ohne korrekt zu escapen.
        - Angreifer bringt schädlichen Code in diese Eingabe ein (z. B. über Formular, URL).
        - Browser des Opfers rendert die Seite und führt den eingeschleusten Code mit den Rechten der Seite aus.
    - Typen:
        - Stored XSS (persistiert, z. B. in DB),
        - Reflected XSS (über URL/Request reflektiert),
        - DOM-based XSS (Fehler im Client-Script).
    - Kernproblem:
        - Fehlendes, falsches oder kontextloses Output-Encoding.

---

###  10.4. <a name='SieknnensinnvolleundeffektiveMassnahmengegenInjection-AngriffeimallgemeinenundPathTraversalSQLInjectionundCross-Site-Scriptuing-Angriffedefinieren'></a>Sie können sinnvolle und effektive Massnahmen gegen Injection-Angriffe im allgemeinen, und Path Traversal, SQL Injection und Cross-Site-Scriptuing-Angriffe definieren

- Allgemeine Massnahmen gegen Injection
    - Eingaben nicht blind vertrauen:
        - Validierung mit Whitelists (Typ, Länge, Format).
    - Trennung von Code und Daten:
        - Keine String-Konkatenation für Befehle/Queries.
    - Least Privilege:
        - Dienste/DB-User bekommen nur minimal nötige Rechte.
    - Security by Design:
        - Sichere Frameworks/APIs verwenden (Parameter-Binding, Encoding, Validation).
    - Logging & Monitoring:
        - Verdächtige Muster erkennen (auffällige Parameter, viele Fehlversuche, Fehler).

- Gegen Path Traversal
    - Pfade normalisieren und prüfen:
        - Keine `../` (oder Encodings davon) zulassen, wenn nicht nötig.
    - Nur aus vordefinierten Verzeichnissen lesen:
        - Whitelist von erlaubten Dateien/Ordnern.
    - Pfade nicht direkt vom Benutzer übernehmen:
        - Statt Pfaden IDs verwenden und intern auf Pfade mappen.
    - Rechte einschränken:
        - Datei- und Verzeichnisrechte so setzen, dass selbst bei Traversal keine kritischen Dateien lesbar sind.

- Gegen SQL Injection
    - Parametrisierte Queries / Prepared Statements:
        - Platzhalter für Werte, DB trennt Query-Struktur und Daten.
    - Keine String-Konkatenation mit Benutzerinput für SQL.
    - Eingaben auf Typ/Format einschränken:
        - Nur Ziffern für IDs, definierte Werte für Enums etc.
    - Datenbankrechte einschränken:
        - Applikations-User darf nur das Minimum (kein `DROP TABLE`, kein `GRANT`, etc.).
    - Fehlerbehandlung:
        - Keine detaillierten SQL-Fehlermeldungen an den Client leaken.

- Gegen Cross-Site Scripting (XSS)
    - Kontextabhängiges Output-Encoding:
        - HTML-Kontext: `<`, `>`, `&`, `"` escapen.
        - In Attributen, JavaScript, URLs jeweils passende Encoding-Funktionen nutzen.
    - Keine Benutzereingaben ungefiltert in HTML/JS ausgeben.
    - Content Security Policy (CSP):
        - Skriptquellen einschränken, `inline`-Scripts vermeiden.
    - HttpOnly-Cookies:
        - Cookies nicht per JavaScript auslesbar machen (Schaden bei XSS begrenzen).
    - Sichere Template-Engines / Frameworks:
        - Standard-Output-Encoding nutzen, `unsafe`-Funktionen vermeiden.


##  11. <a name='SW14Quantencomputingund-kryptographie'></a>SW14 Quantencomputing und -kryptographie

###  11.1. <a name='SiewissenwaseinQuantencomputeristundwasihnvoneinemklassischenComputerunterscheidet'></a>Sie wissen was ein Quantencomputer ist und was ihn von einem klassischen Computer unterscheidet

- Quantencomputer
    - Rechnet nicht mit klassischen Bits (`0` oder `1`), sondern mit **Qubits**, die in Zuständen `0`, `1` und Überlagerungen (Superposition) dazwischen sein können.
    - Nutzt **Superposition** und **Verschränkung (Entanglement)**, um bestimmte Berechnungen parallel in einem sehr großen Zustandsraum auszuführen.

- Unterschiede zum klassischen Computer
    - Klassischer Computer:
        - Bits haben immer klar definiert `0` oder `1`.
        - Berechnungen folgen deterministischen Zustandsübergängen.
    - Quantencomputer:
        - Qubits können gleichzeitig „ein bisschen 0 und 1“ sein (Superposition).
        - Qubits können miteinander verschränkt sein:
            - Messung eines Qubits beeinflusst den Zustand eines anderen.
        - Messung zerstört den Quantenzustand:
            - Ergebnisse sind probabilistisch, man braucht oft viele Wiederholungen.

- Wichtig:
    - Quantencomputer sind **nicht einfach nur schneller in allem**.
    - Sie sind speziell für bestimmte Problemklassen (z. B. Faktorisierung, Suche in unsortierten Daten) deutlich effizienter.


###  11.2. <a name='SieknnenBeispielevonProblemenangebenwelchevoneinemQuantencomputerbesondersschnellgelstwerdenknnen'></a>Sie können Beispiele von Problemen angeben, welche von einem Quantencomputer besonders schnell gelöst werden können

- Faktorisierung großer Zahlen
    - Mit **Shor-Algorithmus**:
        - Zerlegung großer Zahlen in Primfaktoren kann **exponentiell schneller** erfolgen als mit bekannten klassischen Algorithmen.
        - Relevanz: bricht konzeptionell RSA & ähnliche Verfahren.

- Diskretes Logarithmusproblem
    - Ebenfalls effizient mit Shor-Algorithmus lösbar.
    - Relevanz: betrifft klassische **Diffie-Hellman**, **DSA**, viele **ECC-Verfahren**.

- Suche in unsortierten Datenbanken
    - Mit **Grover-Algorithmus**:
        - Quadratische Beschleunigung:
            - statt O(N) → O(√N) Suchaufwand.
        - Relevanz:
            - Reduziert effektive Schlüssellängen (z. B. symmetrische Schlüssel müssen länger gewählt werden).

- Simulation quantenphysikalischer Systeme
    - Quantencomputer können andere Quantensysteme (Chemie, Materialwissenschaft, Quantenphysik) wesentlich effizienter simulieren.
    - Praktische Anwendungen:
        - Medikamentenentwicklung, neue Materialien, Optimierungsprobleme.


###  11.3. <a name='SieverstehenwelchenEinflussdieExistenzeinesQuantencomputersaufdieKryptographiehat'></a>Sie verstehen welchen Einfluss die Existenz eines Quantencomputers auf die Kryptographie hat

- Einfluss auf **asymmetrische Kryptographie**
    - Shor-Algorithmus bricht:
        - RSA (Faktorisierung),
        - klassische Diffie-Hellman-Verfahren,
        - viele elliptische Kurven Verfahren (ECDH, ECDSA).
    - Konsequenz:
        - heutige Public-Key-Verfahren wären bei hinreichend großen Quantencomputern **nicht mehr sicher**.
        - → Bedarf nach **Post-Quanten-Kryptographie** (PQ-Krypto).

- Einfluss auf **symmetrische Kryptographie**
    - Grover-Algorithmus beschleunigt brute-force-Schlüssel-Suche:
        - effektive Sicherheit von `n` Bit Schlüssel ≈ `n/2` Bit klassische Sicherheit.
    - Konsequenz:
        - Symmetrische Schlüssel müssen **länger** gewählt werden:
            - z. B. AES-256 statt AES-128, um ausreichend Sicherheitsniveau zu halten.

- Einfluss auf **Hashfunktionen**
    - Grover kann auch Preimage-Suche beschleunigen:
        - Für Hash-Funktionen bedeutet das ebenfalls eine Reduktion der effektiven Sicherheit.
    - Konsequenz:
        - Längere Hash-Ausgaben verwenden (z. B. 256 Bit und höher).

- Langfristige Vertraulichkeit
    - „Store now, decrypt later“:
        - Angreifer könnten heute verschlüsselten Traffic speichern,
          um ihn später mit Quantencomputern zu entschlüsseln.
    - Kritisch für Daten, die lange vertraulich bleiben müssen
        (z. B. Gesundheitsdaten, staatliche/geheime Informationen).


###  11.4. <a name='SieknnenerklrenwieQuantenschlsselaustauschundQuantenzufallszahlengeneratorenfunktionierenundwissenwelcheSicherheitseigenschaftendadurcherreichtwerden'></a>Sie können erklären wie Quantenschlüsselaustausch und Quantenzufallszahlengeneratoren funktionieren und wissen, welche Sicherheitseigenschaften dadurch erreicht werden

- Quantenschlüsselaustausch (Quantum Key Distribution, QKD)
    - Idee:
        - Nutzung von **Quantenzuständen (z. B. Photonen-Polarisation)** zum Austausch eines Schlüssels.
        - Beispielprotokoll: **BB84**.
    - Funktionsprinzip (stark vereinfacht):
        - Sender kodiert Bits in Quantenzustände (z. B. unterschiedliche Polarisationsrichtungen von Photonen).
        - Empfänger misst diese mit zufällig gewählten Basen.
        - Danach vergleichen beide über einen klassischen Kanal bestimmte Informationen (z. B. verwendete Basen).
        - Falsche Messungen und Störungen werden sichtbar:
            - Ein Abhörer (Eavesdropper) stört das System zwingend (Messung verändert den Zustand).
        - Wenn Fehlerquote zu hoch → Verbindung gilt als kompromittiert.
    - Sicherheitseigenschaften:
        - Abhören hinterlässt **physikalisch nachweisbare Spuren**.
        - Sicherheit basiert auf den **Gesetzen der Quantenphysik**, nicht nur auf Rechenannahmen.
        - QKD erzeugt einen gemeinsamen, „informationstheoretisch sicheren“ Schlüssel bei idealer Implementierung.

- Quantenzufallszahlengeneratoren (QRNG)
    - Idee:
        - Nutzen **quantummechanische Prozesse**, die fundamentale Zufälligkeit besitzen (z. B. Zerfall, Photonen-Splitting).
    - Funktionsprinzip:
        - Ein quantenphysikalisches Experiment hat zwei oder mehr mögliche Ausgänge mit gleicher Wahrscheinlichkeit.
        - Jeder Ausgang wird als Bit (0/1) interpretiert.
        - Durch viele Wiederholungen entsteht eine Folge **echter** zufälliger Bits.
    - Sicherheitseigenschaften:
        - Zufallszahlen sind **nicht deterministisch** und nicht von einem Seed abhängig.
        - Kein Angreifer kann den internen Zustand „erraten“, weil es **keinen versteckten Determinismus** gibt.
        - Ideal für Schlüsselerzeugung und sicherheitskritische Anwendungen.

- Wichtiger Punkt:
    - QKD und QRNG lösen nicht alle Kryptoprobleme:
        - Sie ergänzen klassische Kryptosysteme:
            - QKD liefert „perfekte“ Schlüssel.
            - QRNG liefert „perfekte“ Zufallszahlen.
        - Die **praktische Implementierung & Integration** (Geräte-Sicherheit, Protokoll-Fehler etc.) bleibt weiterhin kritisch.
