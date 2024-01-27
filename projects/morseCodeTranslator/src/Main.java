import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Morse Code Translator!");
        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Text to Morse Code");
            System.out.println("2. Morse Code to Text");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter text to convert to Morse Code: ");
                    String textInput = scanner.nextLine();
                    break;
                case 2:
                    System.out.print("Enter Morse Code to convert to text: ");
                    String morseInput = scanner.nextLine();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
