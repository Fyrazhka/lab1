import java.util.List;

public class Bouquet {
    private Flower[] flowers;

    public Bouquet(Flower[] flowers) {
        this.flowers = flowers;
    }

    public double getPrice() {
        return FlowerShop.calculateBouquetPrice(flowers);
    }

    public double getWeight() {
        return FlowerShop.calculateBouquetWeight(flowers);
    }


    public Flower[] findMostExpensiveFlowers() {
        double maxPrice = Double.MIN_VALUE;
        int count = 0;

        for (Flower flower : flowers) {
            if (flower.getPrice() > maxPrice) {
                maxPrice = flower.getPrice();
                count = 1;
            } else if (flower.getPrice() == maxPrice) {
                count++;
            }
        }

        Flower[] result = new Flower[count];
        int index = 0;

        for (Flower flower : flowers) {
            if (flower.getPrice() == maxPrice) {
                result[index++] = flower;
            }
        }

        return result;
    }

    public Flower[] findCheapestFlowers() {
        double minPrice = Double.MAX_VALUE;
        int count = 0;

        for (Flower flower : flowers) {
            if (flower.getPrice() < minPrice) {
                minPrice = flower.getPrice();
                count = 1;
            } else if (flower.getPrice() == minPrice) {
                count++;
            }
        }

        Flower[] result = new Flower[count];
        int index = 0;

        for (Flower flower : flowers) {
            if (flower.getPrice() == minPrice) {
                result[index++] = flower;
            }
        }

        return result;
    }
}





