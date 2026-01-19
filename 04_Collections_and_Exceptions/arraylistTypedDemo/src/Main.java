import java.util.ArrayList;

public class Main {

        public static void main(String[] args) {

            ArrayList<String> cities = new ArrayList<String> ();

            cities.add("Ankara");
            cities.add("İstanbul");
            cities.add("İzmir");
            cities.add("Izmit");

            cities.remove("İstanbul");
            Collections.sort(cities);
            for (String city: cities) {
                System.out.println (city);
            }

        }
}