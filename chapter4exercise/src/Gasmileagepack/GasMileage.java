package Gasmileagepack;

import java.util.Scanner;

public class GasMileage {

   private int totalGallonUsed;
   private int gallonCounter;
   private int totalMileDriven;
   private int mileDrivenCounter;


    Scanner input = new Scanner(System.in);

    public void GallonUsed() {
        int gallonUsed = 0;

        while (gallonUsed != -1){
            System.out.println("Enter number of gallons used");
            gallonUsed = input.nextInt();
            totalGallonUsed = totalGallonUsed + gallonUsed;
            gallonCounter = gallonCounter + 1;
        }

        if (gallonCounter != 0){
            double averageOfTotalGallonUsed = (double) totalGallonUsed / gallonCounter;
            System.out.printf("Average of mile driven is :%f%n", averageOfTotalGallonUsed);
        }else{
            System.out.println("No number of gallon used entered");
        }
    }

    public void MileDriven() {
        int mileDriven = 0;

       while(mileDriven != -1){
           System.out.println("Enter number of miles covered");
           mileDriven = input.nextInt();
           totalMileDriven = totalMileDriven + mileDriven;
           mileDrivenCounter = mileDrivenCounter + 1;
       }

       if (mileDrivenCounter != 0){
           double mileDrivenAverage = (double) totalMileDriven / mileDrivenCounter;
           System.out.printf("mile driven average is: %f%n", mileDrivenAverage);
       }else{
           System.out.println("No Number of miles driven entered");
       }
    }

    public void averageOfMilesDrivenPerGallon(){
        double averageMilesDrivenPerGallon = totalMileDriven / totalGallonUsed;
        System.out.printf("The average miles driven per gallon used is: %f%n", averageMilesDrivenPerGallon);
    }
}
