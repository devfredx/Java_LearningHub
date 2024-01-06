public class Main {

        public static void main(String args []){

            findNumber();
            findNumber();
            findNumber();
            findNumber();
        }

        public static void findNumber(){
            int [] numbers = new int [] {1,2,5,7,9,0};
            int sought =6;
            boolean isThere= false;

            for (int number : numbers){
                if (number==sought) {
                    isThere = true;
                    break;
                }
            }
            if(isThere){
                giveMessage("number available: " +sought);
            }else{
                giveMessage("number not available: " +sought);
            }
        }

        public static void giveMessage(String message){
            System.out.println(message);
        }
}