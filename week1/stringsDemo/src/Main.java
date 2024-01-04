public class Main {


    public static void main(String[] args) {


        String message = "the weather's good today";
        System.out.println(message);

        System.out.println(" - Number of characters : " + message.length());
        System.out.println(" - 5. character : " + message.charAt(4));
        System.out.println(message.concat(" well!\n"));

        System.out.println(message.startsWith("A"));
        System.out.println(message.endsWith("."));

        char[] characters = new char[5];
        message.getChars(0, 5, characters, 0);
        System.out.println(characters);
        System.out.println(message.indexOf('a'));
        System.out.println(message.lastIndexOf('e'));


    }
}