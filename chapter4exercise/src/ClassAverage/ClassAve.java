package ClassAverage;

import java.util.Scanner;

public class ClassAve {
 int total;
 int counter;

 Scanner scanner = new Scanner(System.in);
 public void calcAverage() {
  int grade = 0;

  while (grade != -1) {
   System.out.println("Enter grade or -1 to end");
   grade = scanner.nextInt();
   total = total + grade;
   counter = counter + 1;
   //System.out.println();
  }

  if (counter != 0){
   double average = (double) total / counter;
   System.out.printf("average = %f%n", average);
  }else {
   System.out.println("No grade was entered");
  }
 }
}
