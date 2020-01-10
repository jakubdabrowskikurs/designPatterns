package observer.zadanie;

import java.util.Observable;

public class ObservableItemsList extends Observable {

    private double price;

    public void setPrice(double price) {
        this.price = price;
        setChanged();
        notifyObservers(price);
    }
}