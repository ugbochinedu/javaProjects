package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AirConditionerTest {
    AirConditioner airConditioner;
    @BeforeEach
    void  setUp(){
        airConditioner = new AirConditioner();
    }

    @Test

    public void ProductName(){
        // Given a new AC
        ;
        // what s the name of the AC
        airConditioner.setProductName("Samsung");
        // check name
        assertEquals("Samsung", airConditioner.getProductName());
    }

    @Test

    public void isOn(){
        airConditioner.setOn(true);
        assertTrue(airConditioner.isOn());
    }

    @Test

    public  void isOff(){
        // given an airConditioner
        airConditioner.setOn(true);
        airConditioner.setOff(false);
        assertFalse(airConditioner.isOff());
    }

    @Test

    public void Temperature(){
        // given have an AC
        AirConditioner airConditioner = new AirConditioner();
        //specify the lowest temperature at 16
        airConditioner.setTemperature(25);
        assertEquals(25, airConditioner.getTemperature());
    }

    @Test

    public void TemperatureLessThanLowestTemperature(){
        airConditioner.isOn();
        airConditioner.setTemperature(14);
        assertEquals(16, airConditioner.getTemperature());
    }

    @Test

    public void TemperatureGreaterThanHighestTemperature(){
        airConditioner.isOn();
        airConditioner.setTemperature(31);
        assertEquals(30, airConditioner.getTemperature());
    }

    @Test

    public void IncreaseTemperature(){
        airConditioner.isOn();
        airConditioner.setTemperature(28);
        airConditioner.increaseTemp();
        assertEquals(29, airConditioner.getTemperature());
    }

    @Test

    public void DecreaseTemperature(){
        airConditioner.isOn();
        airConditioner.setTemperature(30);
        airConditioner.decreaseTemperature();
        assertEquals(29, airConditioner.getTemperature());
    }
}
