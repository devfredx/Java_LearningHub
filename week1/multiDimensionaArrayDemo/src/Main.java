public class Main {

    public static void main(String[] args) {


        String[][] cities = new String[3][3];

        cities[0][0] = "istanbul";
        cities[0][1] = "Antalya";
        cities[0][2] = "Izmir";
        cities[1][0] = "Mugla";
        cities[1][1] = "Canakkale";
        cities[1][2] = "Adana";
        cities[2][0] = "Denizli";
        cities[2][1] = "Urfa";
        cities[2][2] = "Antep";

        for (int i = 0; i <= 2; i++) {
            System.out.println("--------------");
            for (int j = 0; j <= 2; j++) {
                System.out.println(cities[i][j]);
            }
        }



    }
}
