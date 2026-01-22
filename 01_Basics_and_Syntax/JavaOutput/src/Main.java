public class Main {
    public static void main(String[] args) {

        System.out.println("This is a standard line with a break.");

        System.out.print("This text stays ");
        System.out.print("on the same line.");
        System.out.println();

        String tool = "Selenium";
        int version = 4;
        double speed = 0.8543;

        System.out.printf("Testing tool: %s\n", tool);
        System.out.printf("Major version: %d\n", version);
        System.out.printf("Execution speed: %.2f seconds\n", speed);

        System.out.printf("Data: %-10s | Value: %05d\n", "ID", 123);
        System.out.printf("Data: %-10s | Value: %05d\n", "Status", 1);

        System.out.println("Tabbed\tContent");
        System.out.println("Backslash: \\");
        System.out.println("Quotes: \"Hello Java\"");
    }
}