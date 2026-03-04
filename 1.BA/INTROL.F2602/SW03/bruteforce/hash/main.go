package main

import (
	"fmt"
)

func main() {
	fmt.Print("Geben Sie den Hash ein: ")
	var hash string
	fmt.Scanln(&hash)

	password := bruteForce(hash)

	fmt.Println("Das urspruengliche Passwort lautet:", password)
}

func bruteForce(hash string) string {

	var password string
	for i := 0; i < len(hash); i += 2 {
		first := rune(hash[i])
		second := rune(hash[i+1])

		originalFromFirst := first - 3
		originalFromSecond := second + 3

		if originalFromFirst != originalFromSecond {
			return ""
		}

		password += string(originalFromFirst)
	}

	return password
}
