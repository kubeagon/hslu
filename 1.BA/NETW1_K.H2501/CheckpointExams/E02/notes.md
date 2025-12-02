# Exam: Ethernet Concepts

> [!NOTE]
> These answers pass the exam with 97%!

## Question 1

![alt text](question01.png)

## Question 2

![alt text](question02.png)

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

The other options are not Layer 2.

## Question 8

![alt text](question08.png)

The data link layer includes many different protocols (Ethernet, Wi-Fi, PPP, HDLC, Frame Relay, etc.).
Each of these uses different frame formats and header fields, so the structure is not universal.

## Question 9

![alt text](question09.png)

- Frame Check Sequence (CRC): Ethernet uses it to verify that the frame is error free, else the NIC discards it
- Minimum frame size: Ethernet requires a frame to be atleast 64 Bytes, otherwize it discards it

## Question 10

![alt text](question10.png)

## Question 11

![alt text](question11.png)

This is the fundamental rule of CSMA/CD (Carrier Sense Multiple Access with Collision Detection) used in half-duplex Ethernet.

## Question 12

![alt text](question12.png)

CSMA/CD (Carrier Sense Multiple Access with Collision Detection) defines how devices on a shared medium decide when they can transmit and how they react to collisions.

## Question 13

![alt text](question13.png)

## Question 14

![alt text](question14.png)

## Question 15

![alt text](question15.png)

- Ethernet utilizes CSMA/CD for half-duplex on shared media
- MAC ist part f the Data Link Layer (Layer 2) and defines these rules
- MAC controlls how frames are put onto the physical medium

## Question 16

![alt text](question16.png)

- Fast-forward has the lowest latency as it immediatly forwards the frame after reading MAC and does not perform error checking
- Cut-through is the general method of which fast-forward is a subtype
- Fragement-free waits for the first 64 Bytes to avoid forwarding runts
- Store-and-forward must recieve the entire frame before sending and is the slowest

## Question 17

![alt text](question17.png)

## Question 18

![alt text](question18.png)

## Question 19

![alt text](question19.png)

## Question 20

![alt text](question20.png)

## Question 21

![alt text](question21.png)

## Question 22

![alt text](question22.png)

Auto-MDIX (Automatic Medium-Dependent Interface Crossover) allows a switch or router interface to automatically detect:

- Whether the connected device requires MDI or MDI-X
- Whether the cable is straight-through or crossover

It adjusts the interface accordingly eliminating the need for crossover cables.

## Question 23

![alt text](question23.png)

When switching between ports of different speeds (e.g., 1000BASE-T → 100BASE-T), the switch must be able to handle incoming frames faster than the outgoing port can transmit them.

Two main buffering methods:

- Port-based buffering
    - Each port has its own fixed buffer
    - Slow ports can easily overflow because fast-port traffic cannot use extra buffer space

- Shared memory buffering
    - All ports draw from a common buffer pool
    - Fast port sending to a slower port can borrow more buffer space

## Question 24

![alt text](question24.png)

Always the next-hop router default-gateway!

## Question 25

![alt text](question25.png)

## Question 26

![alt text](question26.png)

An Ethernet multicast MAC address always starts with: 01-00-5E (for IPv4 multicast)

## Question 27

![alt text](question27.png)

## Question 28

![alt text](question28.png)

## Question 30

![alt text](question30.png)

## Question 31

![alt text](question31.png)

## Question 32

![alt text](question32.png)

## Question 33

![alt text](question33.png)

## Question 34

![alt text](question34.png)


