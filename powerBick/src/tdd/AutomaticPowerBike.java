package tdd;

public class AutomaticPowerBike {
    private boolean powerOn;
    private int gear;
    private int speed;

    public void setOn(boolean On) {
        powerOn = On;
    }
    public void setOff(boolean off) {
        powerOn = off;
    }
    public boolean isOn() {
        return powerOn;
    }
    public boolean isOff() {
        return powerOn;
    }

    public void setGearOnDrive(int gearOnDrive) {
        gear = gearOnDrive;
    }

    public int getGearOnDrive() {
        return gear;
    }

    public void increaseSpeed(int speed) {

        if (speed <= 20) {
            this.gear = 1;
            this.speed = speed + 1;
        }
        if (speed > 20 && speed <= 30) {
            gear += 1;
            this.speed = speed + 2;
        }
        if (speed > 30 && speed <= 41){
            gear += 1;
            this.speed = speed + 3;
        }
        if (speed > 40){
            gear += 1;
            this.speed = speed + 4;
        }
    }

    public int getSpeed() {
        return speed;
    }
}
