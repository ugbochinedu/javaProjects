package AverageCalc;

import java.util.Scanner;

public class ClassAverage {
    int total;
    int counter;
    int average;

    Scanner scanner = new Scanner(System.in);

    public int calcAverage(){
        while(counter < 3){
            System.out.println("Enter the grades");
            int grade = scanner.nextInt();
            total = total + grade;
            counter = counter + 1;
        }
        return counter;
    }

    public int getAverage() {
        average = total / counter;
        return average;
    }
}