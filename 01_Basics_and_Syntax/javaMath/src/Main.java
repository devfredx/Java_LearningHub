public class JavaMath {
    public static void main(String[] args) {

        int x = 25;
        int y = 10;

        System.out.println("Max value: " + Math.max(x, y));
        System.out.println("Min value: " + Math.min(x, y));

        double number = 64.0;
        System.out.println("Square root: " + Math.sqrt(number));

        int negative = -50;
        System.out.println("Absolute value: " + Math.abs(negative));

        double base = 2;
        double exponent = 3;
        System.out.println("Power: " + Math.pow(base, exponent));

        System.out.println("Random double (0.0 - 1.0): " + Math.random());

        int randomInt = (int) (Math.random() * 101);
        System.out.println("Random integer (0 - 100): " + randomInt);

        double decimal = 7.85;
        System.out.println("Round: " + Math.round(decimal));
        System.out.println("Ceil: " + Math.ceil(decimal));
        System.out.println("Floor: " + Math.floor(decimal));
    }
}