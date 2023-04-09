
public class FlowerShop {
    private Bouquet[] bouquets;
    private int bouquetCount;


    // Конструктор по умолчанию
    public FlowerShop() {
        bouquets = new Bouquet[10];
        bouquetCount = 0;
    }
    // Конструктор с параметром
    public FlowerShop(Bouquet[] bouquets) {
        this.bouquets = bouquets;
        this.bouquetCount = bouquets.length;
    }

    // Конструктор копирования
    public FlowerShop(FlowerShop other) {
        // Копирование массива букетов
        this.bouquets = new Bouquet[other.bouquets.length];
        for (int i = 0; i < other.bouquets.length; i++) {
            this.bouquets[i] = new Bouquet(other.bouquets[i]);
        }
        this.bouquetCount = other.bouquetCount;
    }
    // Блок инициализации
    {
        bouquets = new Bouquet[10];
        bouquetCount = 0;
    }
    public Bouquet[] getBouquets() {
        return bouquets;
    }

    // Сеттер для переменной bouquets
    public void setBouquets(Bouquet[] bouquets) {
        this.bouquets = bouquets;
    }

    // Геттер для переменной bouquetCount
    public int getBouquetCount() {
        return bouquetCount;
    }

    // Сеттер для переменной bouquetCount
    public void setBouquetCount(int bouquetCount) {
        this.bouquetCount = bouquetCount;
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