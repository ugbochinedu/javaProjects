public class PetrolPurchase {
    private String stationLocation;
    private String typeOfPetrol;
    private int quantityOfPetrol;
    private double pricePerLitre;
    private double percentageDiscount;
    private double purchaseAmount;

    public PetrolPurchase(String stationLocation, String typeOfPetrol, int quantityOfPetrol,
                          double pricePerLitre, double percentageDiscount) {
        this.stationLocation = stationLocation;
        this.typeOfPetrol = typeOfPetrol;
        this.quantityOfPetrol = quantityOfPetrol;
        this.pricePerLitre = pricePerLitre;
        this.percentageDiscount = percentageDiscount;
    }

    /*public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }

    public String getStationLocation() {
        return stationLocation;
    }

    public void setTypeOfPetrol(String typeOfPetrol) {
        this.typeOfPetrol = typeOfPetrol;
    }

    public String getTypeOfPetrol() {
        return typeOfPetrol;
    }

    public void setQuantityOfPetrol(int quantityOfPetrol) {
        this.quantityOfPetrol = quantityOfPetrol;
    }

    public int getQuantityOfPetrol() {
        return quantityOfPetrol;
    }

    public void setPricePerLitre(double pricePerLitre) {
        this.pricePerLitre = pricePerLitre;
    }

    public double getPricePerLitre() {
        return pricePerLitre;
    }
    public void setPercentageDiscount(double percentageDiscount){
        this.percentageDiscount = percentageDiscount;
    }*/
    public double getPurchaseAmount() {
        purchaseAmount = quantityOfPetrol * pricePerLitre;
        return purchaseAmount -= purchaseAmount * percentageDiscount;
    }
}

