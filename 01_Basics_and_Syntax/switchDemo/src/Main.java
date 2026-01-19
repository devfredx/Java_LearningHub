public class Main {

    public static void main(String[] args) {



        char grade = 'F';

        switch (grade) {
            case 'A':
                System.out.println("Perfect : You passed");
                break;
            case 'B':
                System.out.println("Very good : Your passed");
                break;
            case 'C':
                System.out.println("Good : Your passed");
                break;
            case 'D':
                System.out.println("Not bad : Your passed");
                break;
            case 'F':
                System.out.println("Worse : You failed");
                break;
            default:
                System.out.println("You entered an invalid grade");
        }





    }
}
