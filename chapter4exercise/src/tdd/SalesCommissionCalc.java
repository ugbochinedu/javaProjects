package tdd;

import java.util.Scanner;

public class SalesCommissionCalc {
    private int totalItemSalesValue;
    private double bonus;
    int itemSalesValue;
    int counterForSalesItems;
    private double totalSalesPersonEarn;

    Scanner input = new Scanner(System.in);

    public void itemSalesValue() {

        System.out.println("Enter values of items sold");

        while (itemSalesValue != -1){

            itemSalesValue = input.nextInt();

            totalItemSalesValue = totalItemSalesValue + itemSalesValue;
             counterForSalesItems = counterForSalesItems + 1;

            System.out.printf("%d   %d%n", counterForSalesItems, itemSalesValue);
        }

        System.out.printf("The total amount of Items sold is %d%n", totalItemSalesValue);
    }
    public double calcBonus(double percentage, int totalSales) {

        bonus = percentage/100 * totalSales;
        return bonus;
    }

    public void addWeeklyEarnAndBonus(int weeklyEarn, double calcBonus) {
        totalSalesPersonEarn = weeklyEarn + calcBonus;
        System.out.printf("total earning is %f%n", totalSalesPersonEarn);
    }

    public double getTotalSalesPersonEarn() {
        return totalSalesPersonEarn;
    }
}
