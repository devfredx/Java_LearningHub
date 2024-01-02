public class Main {

    public static void main(String[] args) {


        for (int i = 1; i < 10; i += 2)
            System.out.println(i);

        System.out.println(" - for loop completed\n\n");


        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        System.out.println(" - while loop completed \n\n");


        int j = 100;
        do {
            System.out.println(j);
            j++;
        } while (j < 10);
        System.out.println(" - do-while loop completed");


    }
}
