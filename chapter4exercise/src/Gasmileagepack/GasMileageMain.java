package Gasmileagepack;

import Gasmileagepack.GasMileage;

import java.util.Scanner;

public class GasMileageMain {
    public static void main(String[] args) {
        GasMileage gasMileage = new GasMileage();
        gasMileage.GallonUsed();
        gasMileage.MileDriven();
        gasMileage.averageOfMilesDrivenPerGallon();
    }
}
