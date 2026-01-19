import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double usdToEuroRate = 0.85;
        double usdToGBPRate = 0.73;
        double eurToUsd = 1.09;
        double eurToGbpRate = 0.86;
        double gbpToUsdRate = 1.27;
        double gbpToEuroRate = 1.16;

        String inputCurrency = "";
        String unitToConvert ="";

        double currencyAmount = 0;
        double result = 0;



        System.out.print("\nSelect the number of the currency you have:" +
                "\n1- USD\n2- EUR\n3- GBP\n: ");
        inputCurrency = scanner.nextLine().toUpperCase();

        System.out.print("\nSelect the number of the currency you want to convert:" +
                "\n1- USD\n2- EUR\n3- GBP\n: ");
        unitToConvert = scanner.nextLine().toUpperCase();

        System.out.print("Enter the amount in " + inputCurrency + ": ");
        currencyAmount = scanner.nextDouble();



        if (inputCurrency.equals("1") && unitToConvert.equals("2"))
            result = currencyAmount * usdToEuroRate;
        else if (inputCurrency.equals("1") && unitToConvert.equals("3"))
            result = currencyAmount * usdToGBPRate;
        else if (inputCurrency.equals("2") && unitToConvert.equals("1"))
            result = currencyAmount * eurToUsd;
        else if (inputCurrency.equals("2") && unitToConvert.equals("3"))
            result = currencyAmount * eurToGbpRate;
        else if (inputCurrency.equals("3") && unitToConvert.equals("1"))
            result = currencyAmount * gbpToUsdRate;
        else if (inputCurrency.equals("3") && unitToConvert.equals("2"))
            result = currencyAmount * gbpToEuroRate;
        else
            System.out.println("\nUnsupported currency. Exiting...");

        System.out.println("\nYour currency after conversion: " + result);
    }
}
