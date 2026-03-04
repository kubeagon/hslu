package main

import (
    "bufio"
    "fmt"
    "os"
)

func main() {
    file, _ := os.Open("/Users/dan/Git/hslu/1.BA/INTROL.F2602/SW03/bruteforce/password/list.txt")
    fscanner := bufio.NewScanner(file)
    for fscanner.Scan() {
        password := fscanner.Text()
		if password == "hslu123" {
			fmt.Println("Das Passwort wurde gefunden:", password)
			break
		}
    }
}