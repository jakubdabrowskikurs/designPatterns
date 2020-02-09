package observer.observer_interface;

import java.util.Observable;

public class OMagazine extends Observable {

    private String news;

    public void setNews(String news) {
        this.news = news;
        setChanged();
        notifyObservers(news);
    }
}