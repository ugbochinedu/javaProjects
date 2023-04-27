package main

import "fmt"

func main() {
	fmt.Print("How many salespersons do u have? ")
	var input int
	_, _ = fmt.Scanf("%d", &input)
	fmt.Println(maximumUnit(input))
}

func maximumUnit(input int) int {
	var salesUnit int
	max := 0

	for i := 1; i <= input; i++ {
		fmt.Printf("Enter number of units sold by salesperson %d: \n", i)
		_, _ = fmt.Scanf("%d", &salesUnit)
		if salesUnit > max {
			max = salesUnit
		}
	}
	return max
}

//func maximumUnit(salesUnit int) int {
//	max := 0
//	if salesUnit > max {
//		max = salesUnit
//	}
//	return max
//}
