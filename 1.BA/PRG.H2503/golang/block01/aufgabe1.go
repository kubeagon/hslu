package main

import "fmt"

func main() {
	var breite float64
	var hoehe float64

	fmt.Print("Geben Sie die Breite des Rechtecks ein: ")
	fmt.Scanln(&breite)
	fmt.Print("Geben Sie die Höhe des Rechtecks ein: ")
	fmt.Scanln(&hoehe)

	flaeche := breite * hoehe
	umfang := 2 * (breite + hoehe)

	fmt.Println("\nErgebnisse für das Rechteck:")
	fmt.Println("Fläche: ", flaeche)
	fmt.Println("Umfang: ", umfang)
}

