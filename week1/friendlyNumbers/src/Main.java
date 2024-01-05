public class Main {


    public static void main(String[] args) {

        /* In mathematics, the term "friend numbers" refers to two positive
        integers that are equal to the sum of each other's divisors.
        That is, the sum of the divisors of one number must be equal to the other number.*/

        int number1 = 6232;
        int number2 = 6368;
        int total1 = 0;
        int total2 = 0;

        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0)
                total1 = total1 + i;
        }


        for (int i = 1; i < number2; i++) {
            if (number2 % i == 0)
                total2 = total2 + i;
        }

        if(number1 == total2 && number2 == total1)
            System.out.println(" - These numbers are friends");
        else
            System.out.println(" - these numbers are not friends");


    }
}
