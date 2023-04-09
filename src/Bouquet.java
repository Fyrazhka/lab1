

public class Bouquet {
    private Flower[] flowers;
    public Bouquet(){}
    public Bouquet(Flower[] flowers) {
        this.flowers = flowers;
    }
    // Блок инициализации
    {
        flowers = new Flower[0];
    }
    public Bouquet(Bouquet other) {
        // Копирование массива цветов
        this.flowers = new Flower[other.flowers.length];
        for (int i = 0; i < other.flowers.length; i++) {
            this.flowers[i] = new Flower(other.flowers[i]);
        }
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





