public class Main {
    public static void main(String[] args) {

        /* For a number to be perfect, the sum of its positive divisors,
        excluding itself, must be equal to itself */

        int number1 = 28;
        int total = 0;


        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0)
                total = total + i;
        }

        if (number1 == total)
            System.out.println("this is perfect number");
        else
            System.out.println("this is not perfect number");

    }

}