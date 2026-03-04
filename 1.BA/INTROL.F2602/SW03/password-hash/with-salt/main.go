package main

import (
	"fmt"
	"math/rand"
	"time"
)

func main() {
	rand.Seed(time.Now().UnixNano())

	var password string
	fmt.Print("Geben Sie ein Passwort ein: ")
	fmt.Scanln(&password)

	hash, salt := hashPassword(password)
	fmt.Println("Der Hash des Passworts lautet:", hash)
	fmt.Println("Der Salt lautet:", salt)
}

func hashPassword(password string) (string, string) {
	salt := randString(4)
	input := password + salt

	var hash string
	for _, char := range input {
		hash += string(char + 3)
		hash += string(char - 3)
	}

	return hash, salt
}

func randString(n int) string {
	var letters = []rune(
		"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789")
	var result string
	for i := 0; i < n; i++ {
		result += string(letters[rand.Intn(len(letters))])
	}
	return result
}
