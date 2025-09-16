package main

import "fmt"

func main() {

	var notePRG, noteMAT, noteICF float64

	fmt.Print("Note PRG: ")
	fmt.Scan(&notePRG)

	fmt.Print("Note MAT: ")
	fmt.Scan(&noteMAT)

	fmt.Print("Note ICF: ")
	fmt.Scan(&noteICF)

	durchschnitt := (notePRG + noteMAT + noteICF) / 3

	fmt.Printf("Der Durchschnitt der Noten ist: %.2f\n", durchschnitt)
}