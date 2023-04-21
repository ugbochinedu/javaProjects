package main

import (
	_ "fmt"
)

//func main() {
//	var firstName string = "ugbo chinedu"
//	fmt.Println(firstName)
//}

//func main() {
//	fmt.Print("Enter a number: ")
//	var firstNumber float64
//	fmt.Scanf("%f", &firstNumber)
//	output := firstNumber * 2
//	fmt.Println(output)
//}

//func main() {
//	var newArray [6]float64
//	newArray[0] = 3
//	newArray[1] = 7
//	newArray[2] = 8
//	newArray[3] = 2
//	newArray[4] = 9
//	newArray[5] = 6
//	fmt.Println(newArray)
//	fmt.Println(newArray[4])
//
//	var total float64 = 0
//	for i := 0; i < len(newArray); i++ {
//		total += newArray[i]
//	}
//	fmt.Println(total)
//	fmt.Println(total / float64(len(newArray)))
//
//	for _, value := range newArray {
//		total += value
//	}
//	fmt.Println(total)

//func main() {
//	var number int = 10
//	for i := 0; i <= number; i++ {
//		if i%2 == 0 {
//			fmt.Println("even")
//		} else {
//			fmt.Println("odd")
//		}
//	}
//}

//func main() {
//	var total float64 = 0
//	x := [5]float64{98, 93, 77, 82, 83}
//
//	for _, value := range x {
//		total += value
//	}
//	fmt.Println(total)
//}

//func main() {
//	x := make([]float64, 5)
//	x[0] = 1
//	x[1] = 8
//	x[2] = 3
//	x[3] = 6
//	fmt.Println(x)
//}

//func main() {
//	arr := []float64{1, 2, 3, 4, 5, 6}
//	x := arr[0:5]
//	fmt.Println(x)
//

//func main() {
//	x := []float64{1, 2, 3, 4}
//	//fmt.Append(x, 5, 6, 7)
//	y := append(x, 5, 6, 7)
//	fmt.Println(y)
//}

//func main() {
//	x := make(map[string]string)
//	x["hy"] = "hydrogen"
//	x["he"] = "helium"
//	x["li"] = "lit"
//	fmt.Println(x)
//	if name, ok := x["he"]; ok {
//		fmt.Println(name, ok)
//	}
//}

//func main() {
//	elements := map[string]map[string]string{
//		"H": {
//			"name":  "hyd",
//			"state": "state",
//		},
//		"He": {
//			"name":  "helium",
//			"state": "gas",
//		},
//		"Li": {
//			"name":  "Lithium",
//			"state": "solid",
//		},
//	}
//	if element, isAvailable := elements["H"]; isAvailable {
//		fmt.Println(element["name"], "and", element["state"])
//	}
//}

//func main() {
//	arr := []float64{1, 3, 4, 5, 6}
//	fmt.Println(average(arr))
//}
//
//func average(arr []float64) float64 {
//	total := 0.0
//	for _, value := range arr {
//		total += value
//	}
//	return total / float64(len(arr))
//}

//func main() {
//	x := 2
//	y := 5
//	f(x, y)
//}
//
//func f(x int, y int) {
//	var sum int
//	sum = x + y
//	fmt.Println(sum)
//}
