package observer.zadanie2;

import java.util.Observable;
import java.util.Observer;

public class CarObserver implements Observer {

    private double price;

    @Override
    public void update(Observable o, Object sale) {
        double priceTemp = price - (price * ((double) sale)/100);
        this.setPrice(priceTemp);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
