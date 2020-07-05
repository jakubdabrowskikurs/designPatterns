package observer.zadanie3;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Shop extends Observable {

    private double price;
    private List<Product> productList = new ArrayList<>();
    private double sale;

    public void addObserver(Product product) {
        this.productList.add(product);
    }

    public void removeObserver(Product product) {
        this.productList.remove(product);
    }

    public void setPrice(double price) {
        this.price = price;
        for (Product product : this.productList) {
            product.update(this.price);
        }
    }

    public void setSale(double sale) {
        this.sale = sale;
        for (Product product : this.productList) {
            product.sale(this.sale);
        }
    }
}
