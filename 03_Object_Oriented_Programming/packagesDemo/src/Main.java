import java.util.Scanner;
import math.*;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nWhat's ur name: ");

        String name = scanner.nextLine();

        System.out.println("Hi " + name);

        fourOperations fourOperations = new fourOperations();
        fourOperations.add(2,3);

        logarithm logarithm = new logarithm();

    }
}