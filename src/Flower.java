public class Flower {
    private String name;
    private double price;
    private double weight;

    public Flower(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }
}
