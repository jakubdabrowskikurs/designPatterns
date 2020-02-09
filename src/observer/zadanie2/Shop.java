package observer.zadanie2;

import java.util.Observable;

public class Shop extends Observable {

    private double sale;

    public void setSale(double sale) {
        this.sale = sale;
        setChanged();
        notifyObservers(sale);
    }
}