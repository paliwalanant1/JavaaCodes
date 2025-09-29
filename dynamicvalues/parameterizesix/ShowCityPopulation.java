package constructor.parameterizeconstructor.dynamicvalues.parameterizesix;
import java.util.Scanner;

public class ShowCityPopulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter City Name: ");
        String c = sc.nextLine();
        System.out.print("Enter Population: ");
        int p = sc.nextInt();
        CityPopulation cp = new CityPopulation(c, p);
        cp.display();
    }
}
