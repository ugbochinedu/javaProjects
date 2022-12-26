package xmasSnacktdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesCalculatorTest {
    SalesCalculator salesCalculator;

    @BeforeEach

    void BeforeEachTest(){
        salesCalculator = new SalesCalculator();
    }

    @Test

    void ProductNumber(){
        salesCalculator.setProductNumber();
        assertEquals(1,salesCalculator.getProductNumber());
    }

    @Test

    void ProductQuantity(){
        salesCalculator.setQuantitySold();
        assertEquals(3, salesCalculator.getQuantitySold());
    }

    @Test

    void ProductPriceDetermination(){
        salesCalculator.setProductNumber();
        assertEquals(4.50,salesCalculator.getPriceOfProduct());
    }

    @Test

    void TotalSalesOfProduct(){
        salesCalculator.setQuantitySold();
        salesCalculator.setProductNumber();
        assertEquals(8.98,salesCalculator.getTotalSalesOfProduct());
    }
}
