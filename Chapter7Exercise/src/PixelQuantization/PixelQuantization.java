package PixelQuantization;

public class PixelQuantization {

    private final int[] pixelArray;
    private final int[] pixelArray1;
    private final int[] pixelArray2;
    private final int[] pixelArray3;
    private final int[] pixelArray4;
    private final int[] pixelArray5;
    private final int[] pixelArray6;
    private final int[] pixelArray7;
    private final int[] pixelArray8;
    private final int[] pixelArray9;

    public PixelQuantization(int[] pixelArray, int[] pixelArray1,
            int[] pixelArray2, int[] pixelArray3,
            int[] pixelArray4, int[] pixelArray5,
            int[] pixelArray6, int[] pixelArray7,
            int[] pixelArray8 ,int[] pixelArray9){
        this.pixelArray = pixelArray;
        this.pixelArray1 = pixelArray1;
        this.pixelArray2 = pixelArray2;
        this.pixelArray3 = pixelArray3;
        this.pixelArray4 = pixelArray4;
        this.pixelArray5 = pixelArray5;
        this.pixelArray6 = pixelArray6;
        this.pixelArray7 = pixelArray7;
        this.pixelArray8 = pixelArray8;
        this.pixelArray9 = pixelArray9;
    }

    public void newArray(){
        int[] quantizedValue = new int[10];

        System.out.printf("%s%4s","Pixel range","Quantized value");

        for (int value:quantizedValue) {
            for (int counter:pixelArray) {
                pixelArray[counter] = 10;
            }
            for (int i = 0; i < pixelArray1.length; i++) {
                pixelArray1[i] = 30;
            }
            for (int counter:pixelArray2) {
                pixelArray2[counter] = 50;
            }
            for (int counter:pixelArray3) {
                pixelArray3[counter] = 70;
            }
            for (int counter:pixelArray4) {
                pixelArray4[counter] = 90;
            }
            for (int counter:pixelArray5) {
                pixelArray5[counter] = 110;
            }
            for (int counter:pixelArray6) {
                pixelArray6[counter] = 130;
            }
            for (int counter:pixelArray7) {
                pixelArray7[counter] = 150;
            }
            for (int counter:pixelArray8) {
                pixelArray8[counter] = 170;
            }
            for (int counter:pixelArray9) {
                pixelArray9[counter] = 190;
            }
        }
    }
}
