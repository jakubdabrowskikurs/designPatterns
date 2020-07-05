package observer.zadanie3;

public class Main {

    public static void main(String[] args) {
        //utworzenie sklepu
        Shop shop = new Shop();

        //utworzenie produktów
        ProductImpl product1 = new ProductImpl();
        product1.setName("Golarka");

        ProductImpl product2 = new ProductImpl();
        product2.setName("Pralka");

        ProductImpl product3 = new ProductImpl();
        product3.setName("Zmywarka");

        print(product1, product2, product3);

        shop.addObserver(product1);
        shop.addObserver(product2);
        shop.addObserver(product3);

        //ustalenie ceny dla wszsytkich produktów
        shop.setPrice(150);

        print(product1, product2, product3);

        //ustawienie przeceny o 20%
        shop.setSale(20);

        print(product1, product2, product3);

        //Ustawienie ceny dla jednego konkretnego produktu
        product1.setPrice(200);

        print(product1, product2, product3);

        shop.setSale(20);

        print(product1, product2, product3);
    }

    private static void print(ProductImpl product1, ProductImpl product2, ProductImpl product3) {
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
    }
}
