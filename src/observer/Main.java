package observer;

public class Main {
    public static void main(String[] args) {
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();

        System.out.println(observer.getNews());

        observable.addObserver(observer);
        observable.setNews("news");

        System.out.println(observer.getNews());

        //----------------------------------------------------
        System.out.println("Implementacja z interfejsem Observer");

        ONewsAgency observableO = new ONewsAgency();
        ONewsChannel observerO = new ONewsChannel();
        ONewsChannel observerO2 = new ONewsChannel();

        System.out.println(observerO.getNews());

        observableO.addObserver(observerO);
        observableO.addObserver(observerO2);
        observableO.setNews("news");

        System.out.println(observerO.getNews());
        System.out.println(observerO2.getNews());
    }
}
