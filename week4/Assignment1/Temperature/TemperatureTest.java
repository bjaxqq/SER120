// importing Scanner util
import java.util.Scanner;

// creating TemperatureTest class
public class TemperatureTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // asks user for temperature
        System.out.print("Enter the temperature: ");
        double temperature = input.nextDouble();
        input.close();
        
        // shows which substances will freeze
        Temperature t = new Temperature(temperature);
        System.out.print("At " + temperature + " degrees, these substances will freeze: ");
        if (t.isEthylFreezing()) {
            System.out.print("Ethyl Alcohol ");
        }
        if (t.isOxygenFreezing()) {
            System.out.print("Oxygen ");
        }
        if (t.isWaterFreezing()) {
            System.out.print("Water");
        }
        
        // shows which substances will boil on a new line
        System.out.print("\nAt " + temperature + " degrees, these substances will boil: ");
        if (t.isEthylBoiling()) {
            System.out.print("Ethyl Alcohol ");
        }
        if (t.isOxygenBoiling()) {
            System.out.print("Oxygen ");
        }
        if (t.isWaterBoiling()) {
            System.out.print("Water");
        }
    }
}