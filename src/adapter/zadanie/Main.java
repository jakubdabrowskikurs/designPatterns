package adapter.zadanie;

public class Main {
    public static void main(String[] args) {

        City warsaw = new City(2000000, 15, "Poland", "pl", "Warszawa");
        City radom = new City(220000, 30, "Poland", "pl", "Radom");
        City berlin = new City(3800000, 18, "Germany", "de", "Berlin");

        tempAdapter(warsaw);
        tempAdapter(radom);
        tempAdapter(berlin);

    }

    private static void tempAdapter(City city) {
        System.out.println("Temperatura w " + city.getName() + " wynosi " + city.getTemperature() + " \u00b0C");
        TemperatureInKImpl temperatureInK = new TemperatureInKImpl(city);
        System.out.println("Temperatura w " + city.getName() + " wynosi " + temperatureInK.getTemperature() + " \u00b0K");
        TemperatureInFImpl temperatureInF = new TemperatureInFImpl(city);
        System.out.println("Temperatura w " + city.getName() + " wynosi " + temperatureInF.getTemperature() + " \u00b0F");
    }
}
