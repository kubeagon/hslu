package main

import "fmt"

func main() {
	var password string
	fmt.Print("Geben Sie ein Passwort ein: ")
	fmt.Scanln(&password)

	hash := hashPassword(password)
	fmt.Println("Der Hash des Passworts lautet:", hash)
}

func hashPassword(password string) string {
	var hash string
	for _, char := range password {
		hash += string(char + 3)
		hash += string(char - 3)
	}

	return hash
}
