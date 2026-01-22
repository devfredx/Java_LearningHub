import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> dictionary = new HashMap<String, String>();

        dictionary.put("book", "kitap");
        dictionary.put("table", "masa");
        dictionary.put("computer", "bilgisayar");

        System.out.println("Total items: " + dictionary.size());

        for (String item : dictionary.keySet()) {
            System.out.println("Key: " + item + " Value: " + dictionary.get(item));
        }

        dictionary.remove("table");

        System.out.println("Result for 'table': " + dictionary.get("table"));
    }
}