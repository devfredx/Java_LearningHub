import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Integer myInt = 10;
        Double myDouble = 15.75;
        Character myChar = 'G';

        int primitiveInt = myInt;
        double primitiveDouble = myDouble;

        String scoreText = "100";
        int score = Integer.parseInt(scoreText);

        String priceText = "45.99";
        double price = Double.parseDouble(priceText);

        ArrayList<Integer> points = new ArrayList<>();
        points.add(50);
        points.add(Integer.valueOf("75"));

        System.out.println("Max value of Integer: " + Integer.MAX_VALUE);
        System.out.println("Is digit: " + Character.isDigit('5'));
        System.out.println("Parsed score: " + score);
    }
}