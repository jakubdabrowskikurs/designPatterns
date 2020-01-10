package observer.zadanie;

import java.util.Observable;
import java.util.Observer;

public class PhoneObserver implements Observer {

    private double price;

    @Override
    public void update(Observable o, Object price) {
        this.setPrice((Double) price);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
