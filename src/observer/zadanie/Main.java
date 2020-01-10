package observer.zadanie;

public class Main {
    public static void main(String[] args) {

        ObservableItemsList itemsList = new ObservableItemsList();

        CarObserver car = new CarObserver();
        PhoneObserver phone = new PhoneObserver();

        System.out.println(car.getPrice());
        System.out.println(phone.getPrice());

        itemsList.addObserver(car);
        itemsList.addObserver(phone);
        itemsList.setPrice(231.8);

        System.out.println(car.getPrice());
        System.out.println(phone.getPrice());
    }
}
