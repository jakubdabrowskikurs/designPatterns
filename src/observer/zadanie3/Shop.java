package observer.zadanie3;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private double price;
    private List<Product> channels = new ArrayList<>();
    private double sale;

    public void addObserver(Product channel) {
        this.channels.add(channel);
    }

    public void removeObserver(Product channel) {
        this.channels.remove(channel);
    }

    public void setPrice(double price) {
        this.price = price;
        for (Product channel : this.channels) {
            channel.update(this.price);
        }
    }

    public void setSale(double sale) {
        this.sale = sale;
        for (Product channel : this.channels) {
            channel.sale(this.sale);
        }
    }
}
