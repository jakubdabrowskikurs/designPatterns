package observer.zadanie;

import java.util.Observable;

public class Shop extends Observable {

    private double price;

    public void setPrice(double price) {
        this.price = price;
        setChanged();
        notifyObservers(price);
    }
}