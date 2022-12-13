package tdd;

public class AirConditioner {
    private boolean isOn;
    private int temperature;
    private String productName;


    public void setProductName(String name) {
        productName = name;
    }
    public String getProductName() {
        return productName;
    }
    public void setOn(boolean ON) {
        isOn = ON;
    }
    public boolean isOn() {
        return isOn;
    }
    public void setOff(boolean off) {
        isOn = off;
    }
    public boolean isOff() {
        return isOn;
    }
    public void setTemperature(int assignTemperature) {
        if(assignTemperature < 16 ) temperature = 16;
        else temperature = assignTemperature;
        if(assignTemperature > 30) temperature = 30;
    }
    public int getTemperature() {
        return temperature;
    }
    public void increaseTemp() {
        temperature += 1;
    }
    public void decreaseTemperature() {
        temperature -= 1;
    }

}
