package observer.zadanie;

public class Main {

    public static void main(String[] args) {
        Shop shop = new Shop();

        CarObserver car = new CarObserver();
        PhoneObserver phone = new PhoneObserver();

        System.out.println(car.getPrice());
        System.out.println(phone.getPrice());

        shop.addObserver(car);
        shop.addObserver(phone);
        shop.setPrice(231.8);

        System.out.println(car.getPrice());
        System.out.println(phone.getPrice());
    }
}
