package main

import (
	"fmt"
	"time"
)

func main() {
	var password string
	fmt.Print("Enter a Password: ")
	fmt.Scanln(&password)

	timer := time.Now()

	password = bruteForce(password)

	fmt.Println("Password Cracked:", password)
	fmt.Println("Duration:", time.Since(timer))

}

func bruteForce(target string) string {
	charset := []rune("abcdefghijklmnopqrstuvwxyz0123456789")

	for length := 1; length <= len(target); length++ {
		if password, found := tryLength(target, charset, "", length); found {
			return password
		}
	}

	return ""
}

func tryLength(target string, charset []rune, current string, remaining int) (string, bool) {
	if remaining == 0 {
		if current == target {
			return current, true
		}
		return "", false
	}

	for _, char := range charset {
		password, found := tryLength(target, charset, current+string(char), remaining-1)
		if found {
			return password, true
		} else {
			fmt.Printf("Current: %s\n", current+string(char))
		}
	}

	return "", false
}
