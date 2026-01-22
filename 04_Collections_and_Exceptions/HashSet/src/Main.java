import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> cities = new HashSet<String>();

        cities.add("London");
        cities.add("New York");
        cities.add("Tokyo");
        cities.add("London"); // Duplicate entry, will be ignored

        System.out.println("Set size: " + cities.size());

        System.out.println("Contains Tokyo: " + cities.contains("Tokyo"));

        cities.remove("New York");

        for (String city : cities) {
            System.out.println("City: " + city);
        }

        cities.clear();
        System.out.println("Is set empty: " + cities.isEmpty());
    }
}