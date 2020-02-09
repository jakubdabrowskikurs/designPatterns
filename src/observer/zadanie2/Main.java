package observer.zadanie2;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        CarObserver car = new CarObserver();
        PhoneObserver phone = new PhoneObserver();

        System.out.println(car.getPrice());
        System.out.println(phone.getPrice());

        car.setPrice(100000);
        phone.setPrice(1235);

        System.out.println(car.getPrice());
        System.out.println(phone.getPrice());

        shop.addObserver(car);
        shop.addObserver(phone);
        shop.setSale(50);

        System.out.println(car.getPrice());
        System.out.println(phone.getPrice());

        shop.setSale(10);

        System.out.println(car.getPrice());
        System.out.println(phone.getPrice());
    }
}
