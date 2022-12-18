package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesCommissionCalcTest {

    @Test

    void SalesInput(){
        SalesCommissionCalc salesCommissionCalc = new SalesCommissionCalc();
        salesCommissionCalc.itemSalesValue();
    }

    @Test

    void SalesBonus(){
        SalesCommissionCalc salesCommissionCalc = new SalesCommissionCalc();
        //salesCommissionCalc.calcBonus(9,5000);
        assertEquals(450,salesCommissionCalc.calcBonus(9,5000));
    }

    @Test

    void SalesPersonEarnings(){
        SalesCommissionCalc salesCommissionCalc = new SalesCommissionCalc();
        salesCommissionCalc.addWeeklyEarnAndBonus(200,salesCommissionCalc.calcBonus(9,5000));
        assertEquals(650, salesCommissionCalc.getTotalSalesPersonEarn());
    }
}
