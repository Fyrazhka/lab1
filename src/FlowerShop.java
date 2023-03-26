import java.util.ArrayList;
import java.util.List;

public class FlowerShop {
    private Bouquet[] bouquets;
    private int bouquetCount;
    public FlowerShop() {
        bouquets = new Bouquet[10];
        bouquetCount = 0;
    }

    public void addBouquet(Bouquet bouquet) {
        if (bouquetCount == bouquets.length) {
            Bouquet[] newBouquets = new Bouquet[bouquets.length * 2];
            System.arraycopy(bouquets, 0, newBouquets, 0, bouquets.length);
            bouquets = newBouquets;
        }
        bouquets[bouquetCount] = bouquet;
        bouquetCount++;
    }

    static public double calculateBouquetPrice(Flower[] bouquet) {
        double totalPrice = 0.0;
        for (Flower flower : bouquet) {
            totalPrice += flower.getPrice();
        }
        return totalPrice;
    }

    static public double calculateBouquetWeight(Flower[] bouquet) {
        double totalWeight = 0.0;
        for (Flower flower : bouquet) {
            totalWeight += flower.getWeight();
        }
        return totalWeight;
    }
}
