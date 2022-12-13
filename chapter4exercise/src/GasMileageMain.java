import java.util.Scanner;

public class GasMileageMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GasMileage gasMileage = new GasMileage();
        System.out.println("Enter miles driven 0r -1 to continue");
        int milesDrivenInput = input.nextInt();
        gasMileage.setMilesDrivenInput(milesDrivenInput);
        System.out.println("Enter number of gallons used or -1 to quit");
        int gallonUsedInput = input.nextInt();
        gasMileage.setGallonUsed(gallonUsedInput);
        double milesDrivenAverage = (double) gasMileage.getMilesDrivenTotal()/ gasMileage.counterMilesDriven();
        double gallonUsedAverage = (double) gasMileage.getGallonUsedTotal() / gasMileage.counterGallonUsed();
        System.out.printf("Average value for miles driven is %.2f", milesDrivenAverage);
        System.out.printf("Average value for gallon used is %.2f", gallonUsedAverage);
    }
}
