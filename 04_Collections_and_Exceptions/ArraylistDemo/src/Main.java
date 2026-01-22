import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList numbers = new ArrayList ();
        numbers.add (1);
        numbers.add(10);
        numbers.add("Ankara");

        // System.out.println (numbers.size());

        // numbers.set (2,100);

        // numbers.remove(index: 0);
        // numbers.clear();
        // System.out.println (numbers.get(0));

        for (Object i :numbers){
            System.out.println(i);
        }

    }
}