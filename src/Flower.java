public class Flower {
    private String name;
    private double price;
    private double weight;

    // Конструктор по умолчанию
    public Flower() {}

    // Конструктор с параметрами
    public Flower(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    // Конструктор-копирования
    public Flower(Flower other) {
        this.name = other.name;
        this.price = other.price;
        this.weight = other.weight;
    }

    // Блок инициализации
    {

        name = "Rose";
        price = 0.0;
        weight = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}