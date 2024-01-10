public class Main {

    public static void main(String[] args) {

        String message = "Weather's Nice";
        String newMessage = cityEntry();
        System.out.println(newMessage);

        int number = gather(5, 7);
        System.out.println(number);

        int total = gather2(21, 35, 54, 79);
        System.out.println(total);

    }


    public static void add() {
    }

    public static void delete() {
    }

    public static void update() {
    }

    public static int gather(int number1, int number2) {
        return number1 + number2;
    }

    public static int gather2(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public static String cityEntry() {
        return "Istanbul";
    }

}
