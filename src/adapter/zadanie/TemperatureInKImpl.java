package adapter.zadanie;

public class TemperatureInKImpl implements TemperatureInK {

    private Temperature temp;

    public TemperatureInKImpl(Temperature temp) {
        this.temp = temp;
    }

    @Override
    public double getTemperature() {
        return convert(temp.getTemperature());
    }

    private double convert(double temp) {
        return temp + 273.15;
    }
}
