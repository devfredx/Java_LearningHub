public class Main {

    public static void main(String[] args) {
        numberPuzzle();
    }

    public static void numberPuzzle() {


        int[] numbers = new int[] { 32, 20, 51, 79, 117, 0 };
        int dialedNumber = 98;
        boolean isThere = false;


        for (int number : numbers) {
            if (number == dialedNumber) {
                isThere = true;
                break;
            }
        }



        String message = "";
        if (isThere) {
            message = "Number Available";
            sendMessage(message);

        } else {
            System.out.println("Number Not Available: " + dialedNumber);
        }
    }


    public static void sendMessage(String message) {
        System.out.println(message);



    }
}