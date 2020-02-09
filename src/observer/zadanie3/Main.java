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

        System.out.println(product1);
        System.out.println(product2);

        shop.addObserver(product1);
        shop.addObserver(product2);

        //ustalenie ceny dla wszsytkich przedmiotów
        shop.setPrice(150);

        System.out.println(product1);
        System.out.println(product2);

        //ustawienie przeceny o 20%
        shop.setSale(20);

        System.out.println(product1);
        System.out.println(product2);

        //Ustawienie ceny dla jednego konkretnego produktu
        product1.setPrice(200);

        System.out.println(product1);
        System.out.println(product2);

        shop.setSale(20);

        System.out.println(product1);
        System.out.println(product2);

    }
}
