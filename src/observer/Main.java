package observer;

import observer.manually.Magazine;
import observer.manually.Reader;
import observer.observer_interface.OMagazine;
import observer.observer_interface.OReader;

public class Main {

    public static void main(String[] args) {
        Magazine observable = new Magazine();
        Reader observer = new Reader();

        System.out.println(observer.getNews());

        observable.addObserver(observer);
        observable.setNews("news");

        System.out.println(observer.getNews());

        //----------------------------------------------------
        System.out.println("Implementacja z interfejsem Observer");

        OMagazine observableO = new OMagazine();
        OReader observerO = new OReader();
        OReader observerO2 = new OReader();

        System.out.println(observerO.getNews());

        observableO.addObserver(observerO);
        observableO.addObserver(observerO2);
        observableO.setNews("news");

        System.out.println(observerO.getNews());
        System.out.println(observerO2.getNews());
    }
}
