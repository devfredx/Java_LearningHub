public class Main {
    public static void main(String[] args) {

        int smallNumber = 100;
        double largeNumber = smallNumber;

        System.out.println("Original integer: " + smallNumber);
        System.out.println("Automatic widening to double: " + largeNumber);

        double productPrice = 99.75;
        int integerPrice = (int) productPrice;

        System.out.println("Original double price: " + productPrice);
        System.out.println("Manual narrowing to integer: " + integerPrice);

        char initial = 'F';
        int asciiValue = initial;

        System.out.println("Character: " + initial);
        System.out.println("Converted ASCII value: " + asciiValue);

        int totalPoints = 250;
        int participants = 40;
        double averageScore = (double) totalPoints / participants;

        System.out.println("Total points: " + totalPoints);
        System.out.println("Participants: " + participants);
        System.out.println("Calculated average with casting: " + averageScore);
    }
}