import java.util.Scanner;

public class temperatureConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome to the Temperature Converter!\n");
        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();

        System.out.println("Select the current temperature unit:");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.print("Enter the corresponding number: ");
        int currentUnit = scanner.nextInt();

        System.out.println("\nSelect the unit you want to convert to:");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.print("Enter the corresponding number: ");
        int targetUnit = scanner.nextInt();

        double convertedTemperature = convertTemperature(temperature, currentUnit, targetUnit);

        System.out.println("\nResult: " + convertedTemperature + " " + getUnitName(targetUnit));
        scanner.close();
    }

    private static double convertTemperature(double temperature, int currentUnit, int targetUnit) {
        if (currentUnit == targetUnit) {
            return temperature; // No conversion needed
        }

        if (currentUnit == 1)
            temperature = toCelsius(temperature, targetUnit);
        else if (currentUnit == 2)
            temperature = toFahrenheit(temperature, targetUnit);
        else if (currentUnit == 3)
            temperature = toKelvin(temperature, targetUnit);
        else {
            System.out.println("Invalid temperature unit selection.");
            System.exit(1);
        }
        return temperature;
    }

    private static double toCelsius(double temperature, int targetUnit) {
        if (targetUnit == 2)
            return (temperature - 32) * 5 / 9;
        else if (targetUnit == 3)
            return temperature - 273.15;
        else {
            System.out.println("Invalid temperature unit conversion.");
            System.exit(1);
            return 0;
        }
    }

    private static double toFahrenheit(double temperature, int targetUnit) {
        if (targetUnit == 1)
            return temperature * 9 / 5 + 32;
        else if (targetUnit == 3)
            return temperature * 9 / 5 - 459.67;
        else {
            System.out.println("Invalid temperature unit conversion.");
            System.exit(1);
            return 0;
        }
    }

    private static double toKelvin(double temperature, int targetUnit) {
        if (targetUnit == 1)
            return temperature + 273.15;
        else if (targetUnit == 2)
            return (temperature + 459.67) * 5 / 9;
        else {
            System.out.println("Invalid temperature unit conversion.");
            System.exit(1);
            return 0;
        }
    }

    private static String getUnitName(int unit) {
        if (unit == 1)
            return "Celsius";
        else if (unit == 2)
            return "Fahrenheit";
        else if (unit == 3)
            return "Kelvin";
        else
            return "Invalid Unit";
    }
}
