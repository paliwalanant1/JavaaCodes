package constructor.parameterizeconstructor.dynamicvalues.parameterizesix;

public class CityPopulation {
    private String cityName;
    private int population;

    public CityPopulation(String cityName, int population) {
        this.cityName = cityName;
        this.population = population;
    }

    public void display() {
        System.out.println("City: " + cityName + ", Population: " + population);
    }
}
