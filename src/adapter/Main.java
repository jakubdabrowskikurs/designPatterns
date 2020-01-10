package adapter;

public class Main {
    public static void main(String[] args) {
        AudiA7 audiA7 = new AudiA7();
        System.out.println("Prędkość samochodu w mph = " + audiA7.getSpeed());

        SpeedAdapterImpl speedAdapter = new SpeedAdapterImpl(audiA7);

        System.out.println("Prędkość samochodu w km/h = " + speedAdapter.getSpeed());

    }
}
