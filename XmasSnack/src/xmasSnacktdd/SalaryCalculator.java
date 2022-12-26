package xmasSnacktdd;

import java.util.Scanner;

public class SalaryCalculator {

    private String employeeName;
    private int numberOfHours;
    private double hourlyRate;

    Scanner input = new Scanner(System.in);

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public String getEmployeeName() {
        return employeeName;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getEmployeeGrossPay() {
        double employeeGrossPay;
        if (numberOfHours <= 40) employeeGrossPay = hourlyRate * numberOfHours;
        else {
            double employeePayForFirst40hours = 40 * hourlyRate;
            double employeePayForExcessOf40hours = (numberOfHours - 40) * (hourlyRate * 3 / 2);
            employeeGrossPay = employeePayForExcessOf40hours + employeePayForFirst40hours;
        }
        return employeeGrossPay;
    }

    public void newEmployee(){

        System.out.println("Enter the name of employee");
        String nameOfEmployee = input.nextLine();
        setEmployeeName(nameOfEmployee);
        System.out.println("Enter the number of hours worked by " + getEmployeeName());
        int numberOfHoursForEmployee = input.nextInt();
        setNumberOfHours(numberOfHoursForEmployee);
        System.out.println("Enter the hourly rate of " + getEmployeeName());
        int hourlyRateForEmployee = input.nextInt();
        setHourlyRate(hourlyRateForEmployee);
        System.out.println("The gross pay for: " + getEmployeeName() +" is "
                + getEmployeeGrossPay());
        System.out.println();
    }

}
