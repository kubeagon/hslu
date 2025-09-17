package main

import "fmt"

func main()	{
	var guthaben float64 = 1000
	var zinsSatz float64 = 3
	var guthabenMitZinsen float64

	guthabenMitZinsen = guthaben * (1 + zinsSatz / 100)
	fmt.Println ( guthabenMitZinsen )
}