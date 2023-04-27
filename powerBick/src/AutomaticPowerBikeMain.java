import tdd.AutomaticPowerBike;

public class AutomaticPowerBikeMain {
    public static void main(String[] args) {
        AutomaticPowerBike automaticPowerBike = new AutomaticPowerBike();
        automaticPowerBike.setGearOnDrive(5);
        System.out.println(automaticPowerBike.getSpeed());
    }
}
