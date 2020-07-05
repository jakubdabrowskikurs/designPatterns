package adapter.zadanie;

public class City implements Temperature {

    private int population;
    private double temp;
    private String country;
    private String language;
    private String name;

    public City(int population, double temp, String country, String language, String name) {
        this.population = population;
        this.temp = temp;
        this.country = country;
        this.language = language;
        this.name = name;
    }

    //W C
    @Override
    public double getTemperature() {
        return this.temp;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
