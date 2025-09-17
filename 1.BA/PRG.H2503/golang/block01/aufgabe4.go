package main

import "fmt"

func main() {
	var guthaben float64
	var zinsSatz float64
	var guthabenMitZinsen float64

	fmt.Print("Geben Sie das Guthaben ein: ")
	fmt.Scanln(&guthaben)
	fmt.Print("Geben Sie den Zinssatz ein: ")
	fmt.Scanln(&zinsSatz)

	guthabenMitZinsen = guthaben * (1 + zinsSatz / 100)
	fmt.Println("Guthaben mit Zinsen:", guthabenMitZinsen)
}