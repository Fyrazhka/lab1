public class Main {
    public static void main(String[] args) {
        Flower rose = new Flower("Rose", 2.99, 100);
        Flower daisy = new Flower("Daisy", 1.99, 70);
        Flower tulip = new Flower("Tulip", 0.99, 40);

        Flower[] flowers1 = {rose, rose, daisy};
        Bouquet bouquet1 = new Bouquet(flowers1);

        Flower[] flowers2 = {tulip, tulip, tulip, daisy};
        Bouquet bouquet2 = new Bouquet(flowers2);

        FlowerShop shop = new FlowerShop();
        shop.addBouquet(bouquet1);
        shop.addBouquet(bouquet2);
    }
}
