package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AutomaticPowerBikeTest {

    @Test

    public void AutomaticPowerBikeIsOn(){
        // given a bike
        AutomaticPowerBike automaticPowerBike = new AutomaticPowerBike();
        // when it is on
        automaticPowerBike.setOn(true);
        // check it is on
        assertTrue(automaticPowerBike.isOn());
    }

    @Test

    public void AutomaticPowerBikeIsOff(){
        // given a bike
        AutomaticPowerBike automaticPowerBike = new AutomaticPowerBike();
        // when it is on; put it off
        automaticPowerBike.setOn(true);
        automaticPowerBike.setOff(true);
        // check if it off
        assertTrue(automaticPowerBike.isOff());
    }

    @Test

    public void SetGearOnDrive(){
       //given a bike
        AutomaticPowerBike automaticPowerBike = new AutomaticPowerBike();
       // bike is powered on
        automaticPowerBike.setOn(true);
       //gear is set
        automaticPowerBike.setGearOnDrive(1);
       //check gear
        assertEquals(1,automaticPowerBike.getGearOnDrive());
    }

    @Test

    public void IncreaseSpeedBetween0and20(){
        //given a power bike
        AutomaticPowerBike automaticPowerBike = new AutomaticPowerBike();
        // when I increase speed
        automaticPowerBike.setGearOnDrive(1);
        //increase speed by 1m/s until 20m/s;
        automaticPowerBike.increaseSpeed(13);
        //check if speed increases by 1
        assertEquals(14, automaticPowerBike.getSpeed());
    }

    @Test

    public void speedBetween20and30(){
        //given a power bike
        AutomaticPowerBike automaticPowerBike = new AutomaticPowerBike();
        //bike set at gear 1
        automaticPowerBike.setGearOnDrive(1);
        // increase speed between 20 and 30
        automaticPowerBike.increaseSpeed(22);
        //gear shifts to gear 2
        automaticPowerBike.setGearOnDrive(2);
        // speed increases by 2
        automaticPowerBike.getSpeed();
        // check gear increases by 1
        assertEquals(2,automaticPowerBike.getGearOnDrive());
        //check if speed increases by 2
        assertEquals(24,automaticPowerBike.getSpeed());
    }

    @Test

    public void SpeedBetween30and40(){
        //given a power bike
        AutomaticPowerBike automaticPowerBike = new AutomaticPowerBike();
        // set gear to gear 2
        automaticPowerBike.setGearOnDrive(2);
        // increase speed to between 30 and 40
        automaticPowerBike.increaseSpeed(31);
        // gear shifts to gear 3
        automaticPowerBike.setGearOnDrive(3);
        //speed begins to increase by 3
        automaticPowerBike.getSpeed();
        //check if gear increases by 1
        assertEquals(3,automaticPowerBike.getGearOnDrive());
        //check if speed increases by 3
        assertEquals(34,automaticPowerBike.getSpeed());
    }

    @Test

    public void SpeedAbove40(){
        AutomaticPowerBike automaticPowerBike = new AutomaticPowerBike();
        automaticPowerBike.setGearOnDrive(3);
        automaticPowerBike.increaseSpeed(41);
        automaticPowerBike.setGearOnDrive(4);
        automaticPowerBike.getSpeed();
        assertEquals(4, automaticPowerBike.getGearOnDrive());
        assertEquals(45, automaticPowerBike.getSpeed());
    }
}
