package opagve2;

public class Drink {
    double price;

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Pris må ikke være negativ: " + price);
        }
        this.price = price;
    }
}
