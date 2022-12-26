package xmasSnacktdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaryCalculatorTest {

    SalaryCalculator salaryCalculator;

    @BeforeEach

    void BeforeEachMethod(){
        salaryCalculator = new SalaryCalculator();
    }

    @Test

    void EmployeeName(){
        salaryCalculator.setEmployeeName("John");
        assertEquals("John", salaryCalculator.getEmployeeName());
    }

    @Test

    void NumberOfHours(){
        salaryCalculator.setNumberOfHours(3);
        assertEquals(3,salaryCalculator.getNumberOfHours());
    }

    @Test

    void hourlyRate() {
        salaryCalculator.setHourlyRate(200.50);
        assertEquals(200.50, salaryCalculator.getHourlyRate());
    }

    @Test

    void grossPayForFirst40Hours(){
        salaryCalculator.setNumberOfHours(30);
        salaryCalculator.setHourlyRate(200);
        assertEquals(6000.00,salaryCalculator.getEmployeeGrossPay());
    }

    @Test

    void grossPayAfter40Hours(){
        salaryCalculator.setNumberOfHours(50);
        salaryCalculator.setHourlyRate(10);
        assertEquals(450,salaryCalculator.getEmployeeGrossPay());
    }
}
