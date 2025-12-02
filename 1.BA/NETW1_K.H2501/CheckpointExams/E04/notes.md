# Exam: IP Addressing

> [!NOTE]
> These answers pass the exam with 94%!

## Question 1

![alt text](question01.png)

## Question 2

![alt text](question02.png)

Memorize

```
128 /25
192 /26
224 /27
240 /28
248 /29
252 /30
```

## Question 3

![alt text](question03.png)

## Question 4

![alt text](question04.png)

## Question 5

![alt text](question05.png)

## Question 6

![alt text](question06.png)

## Question 7

![alt text](question07.png)

- 2^2 = 4 Not enough
- 2^3 = 8 Thats enough

We need to borrow 3 Bits

## Question 8

![alt text](question08.png)

```
A /22 Mask is 255.255.252.0, which means the block size is 256 - 252 = 4
Add the block size to the 3rd octet: 16 + 4 = 20 that means the next network is 172.16.20.0/22
The broadcast has to be 172.16.19.255 of the original network
```

## Question 9

![alt text](question09.png)

/24 = 256 addresses, /2 /2 /2 = 32 addresses

## Question 10

![alt text](question10.png)

## Question 11

![alt text](question11.png)

## Question 12

![alt text](question12.png)

An IPv6 anycast address is a unicast address that is assigned to multiple hosts.
Traffic sent to an anycast address is delivered to the nearest host (according to routing distance).

- Global unicast → assigned to one device
- Link-local → one per interface, used on local LAN only
- Unique local → private IPv6, still one per interface
- Anycast → same address on multiple devices (but still a unicast-type address)

## Question 13

![alt text](question13.png)

- ::1 → Reversed loopback address
- 2001:DB8::/32 → Documentation prefix, but still a global unicast type
- FF02::1:FFxx:xxxx → Always a solicited-node multicast
- FF02::1 → "All nodes" multicast group

## Question 14

![alt text](question14.png)

## Question 15

![alt text](question15.png)

A link-local IPv6 address must:

- Start with the prefix FE80::/10: Meaning it must begin with: FE80, FE81, FE82, or FE83
- Be a unicast address (not multicast)
- Be used only on the local network segment

## Question 16

![alt text](question16.png)

The destination address FF02::1 is a multicast address.
Specifically:

- FF02::1 → All-nodes multicast (all IPv6 devices on the local link)
- FF02::2 → All-routers multicast (all IPv6 routers on the local link)

## Question 17

![alt text](question17.png)

A /64 prefix means the first 64 bits (first 4 hextets) represent the network. Break it down:

- 2001 → 1st hextet
- DB8 → 2nd hextet
- BC15 → 3rd hextet
- A → 4th hextet (this is 000A in full notation)

## Question 18

![alt text](question18.png)

## Question 19

![alt text](question19.png)

## Question 20

![alt text](question20.png)

## Question 21

![alt text](question21.png)

SLAAC (Stateless Address Autoconfiguration)

- Provides dynamic global IPv6 addressing
- Does NOT use a DHCPv6 server to track addresses
- End devices self-generate their IPv6 addresses using:
    - Router Advertisements (RA)
    - The advertised prefix
    - Their own interface identifier (EUI-64 or random)

## Question 22

![alt text](question22.png)

## Question 23

![alt text](question23.png)

0000 represent 16bits so 0000 0000 0000 0000, of which the first 4 are the site, the next 8 are the subsite and the last 4 are the subnet. 2^4 = 16

## Question 24

![alt text](question24.png)

## Question 25

![alt text](question25.png)

## Question 26

![alt text](question26.png)

## Question 28

![alt text](question28.png)

## Question 29

![alt text](question29.png)

## Question 30

![alt text](question30.png)

## Question 31

![alt text](question31.png)

## Question 32

![alt text](question32.png)

## Question 33

![alt text](question33.png)

| Code  | Meaning                                                    |
| ----- | ---------------------------------------------------------- |
| 0     | No route to destination                                    |
| 1     | Communication with destination administratively prohibited |
| 2     | Beyond scope of source address                             |
| 3     | Address unreachable                                        |
| **4** | **Port unreachable**                                       |
| 5     | Source address failed ingress/egress policy                |
| 6     | Reject route to destination                                |
