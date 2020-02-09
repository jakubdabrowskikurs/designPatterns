package observer.zadanie3;

public class ProductImpl implements Product {

    private double price;
    private String name;

    @Override
    public void update(Object price) {
        this.setPrice((double) price);
    }

    @Override
    public void sale(Object sale) {
        double priceTemp = price - (price * ((double) sale) / 100);
        this.setPrice(priceTemp);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " (" + price + ") ";
    }
}
