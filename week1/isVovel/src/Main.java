public class Main {

    public static void main(String[] args) {


        char character = 'I';


        switch (character) {
            case 'A':
            case 'I':
            case 'U':
                System.out.println("Bold vowel");
                break;
            default:
                System.out.println("Thin vowel");
        }



    }
}