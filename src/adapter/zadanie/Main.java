package adapter.zadanie;

public class Main {
    public static void main(String[] args) {
        TemperatureInWarsaw warsaw = new TemperatureInWarsaw();

        System.out.println("Temperatura w Warszawie wynosi " + warsaw.getTemperature() + " \u00b0C");

        TemperatureInKImpl warsawTemperatureInK = new TemperatureInKImpl(warsaw);

        System.out.println("Temperatura w Warszawie wynosi " + warsawTemperatureInK.getTemperature() + " \u00b0K");
    }
}
