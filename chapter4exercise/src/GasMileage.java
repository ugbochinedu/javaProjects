public class GasMileage {
    private int milesDrivenTotal;
    private int gallonUsedTotal;
    private int counterMilesDriven;
    private int counterGallonUsed;

    public void setMilesDrivenInput(int milesDrivenInput){
        while (milesDrivenInput != -1) {
            milesDrivenTotal += milesDrivenInput;
            counterMilesDriven = counterMilesDriven + 1;
            System.out.println("Enter miles driven 0r -1 to continue");
        }
    }

    public int getMilesDrivenTotal() {
        return milesDrivenTotal;
    }

    public void setGallonUsed(int gallonUsed) {
        while (gallonUsed != 1){
            gallonUsedTotal += gallonUsed;
            counterGallonUsed++;
        }
    }

    public int getGallonUsedTotal() {
        return gallonUsedTotal;
    }

    public double counterMilesDriven() {
        return counterMilesDriven;
    }

    public double counterGallonUsed() {
        return counterGallonUsed;
    }
}
