package observer.zadanie2;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        CarObserver car = new CarObserver();
        PhoneObserver phone = new PhoneObserver();
        CarObserver car2 = new CarObserver();
        PhoneObserver phone2 = new PhoneObserver();

        print(car, phone, car2, phone2);

        car.setPrice(100000);
        phone.setPrice(1235);
        car2.setPrice(8790);
        phone2.setPrice(1500);

        print(car, phone, car2, phone2);

        shop.addObserver(car);
        shop.addObserver(phone);
        shop.addObserver(car2);
        shop.addObserver(phone2);

        shop.setSale(50);

        print(car, phone, car2, phone2);

        shop.setSale(10);

        print(car, phone, car2, phone2);
    }

    private static void print(CarObserver car, PhoneObserver phone, CarObserver car2, PhoneObserver phone2) {
        System.out.println(car.getPrice());
        System.out.println(phone.getPrice());
        System.out.println(car2.getPrice());
        System.out.println(phone2.getPrice());
        System.out.println("~~~~~~~~~~~~~~~~");
    }
}
