package xmasSnacktdd;

import java.util.Scanner;

public class ClassAve {
 int total;
 int counter = 0;
 int grade = 0;


 Scanner scanner = new Scanner(System.in);
 public void calculateAverage() {
  System.out.println("Enter grade or -1 to end");
  grade = scanner.nextInt();

  while (grade != -1) {
   total = total + grade;
   counter = counter + 1;
   System.out.println("Enter grade or -1 to end");
   grade = scanner.nextInt();
  }

  if (counter != 0){
   double average = (double) total / counter;
   System.out.printf("average = %f%n", average);
  }else {
   System.out.println("No grade was entered");
  }
 }
}
