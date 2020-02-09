package adapter.zadanie;

public class TemperatureInFImpl implements TemperatureAdapter {

    private Temperature temp;

    public TemperatureInFImpl(Temperature temp) {
        this.temp = temp;
    }

    @Override
    public double getTemperature() {
        return convert(temp.getTemperature());
    }

    private double convert(double temp) {
        return (temp * 9/5)+ 32;
    }
}
