public class Main {

    public static void main(String[] args) {


        int number1 = 427 ;
        int number2 = 259;
        int number3 = 222 ;
        int biggest = number1;


        if(biggest < number2)
            biggest = number2;

        if(biggest < number3)
            biggest = number3;

        System.out.println(biggest);

    }

}