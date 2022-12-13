public class PetrolPurchaseTest {
    public static void main(String[] args) {
        PetrolPurchase petrolPurchase = new PetrolPurchase ("Yaba", "fuel",
        10, 100,0.05);
        System.out.printf("%.2f", petrolPurchase.getPurchaseAmount());
    }

}
