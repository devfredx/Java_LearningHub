import java.util.Scanner;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Morse Code Translator!");
        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Text to Morse Code");
            System.out.println("2. Morse Code to Text");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter text to convert to Morse Code: ");
                String textInput = scanner.nextLine();
                String morseCodeOutput = textToMorse(textInput);
                System.out.println("Morse Code: " + morseCodeOutput);
            } else if (choice == 2) {
                System.out.print("Enter Morse Code to convert to text: ");
                String morseInput = scanner.nextLine();
                String textOutput = morseToText(morseInput);
                System.out.println("Text: " + textOutput);
            } else if (choice == 3) {
                System.out.println("Exiting...");
                System.exit(0);
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }

    public static String textToMorse(String text) {
        text = text.toUpperCase();
        StringBuilder morseCode = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (c == ' ') {
                morseCode.append(" ");
            } else if (morseCodeMap.containsKey(c)) {
                morseCode.append(morseCodeMap.get(c)).append(" ");
            }
        }
        return morseCode.toString();
    }

    public static String morseToText(String morse) {
        StringBuilder text = new StringBuilder();
        String[] words = morse.split("   ");
        for (String word : words) {
            String[] letters = word.split(" ");
            for (String letter : letters) {
                if (charMap.containsKey(letter)) {
                    text.append(charMap.get(letter));
                }
            }
            text.append(" ");
        }
        return text.toString().trim();
    }

    private static final HashMap<Character, String> morseCodeMap = new HashMap<>();
    private static final HashMap<String, Character> charMap = new HashMap<>();

    static {
        morseCodeMap.put('A', ".-");
        morseCodeMap.put('B', "-...");
        morseCodeMap.put('C', "-.-.");
        morseCodeMap.put('D', "-..");
        morseCodeMap.put('E', ".");
        morseCodeMap.put('F', "..-.");
        morseCodeMap.put('G', "--.");
        morseCodeMap.put('H', "....");
        morseCodeMap.put('I', "..");
        morseCodeMap.put('J', ".---");
        morseCodeMap.put('K', "-.-");
        morseCodeMap.put('L', ".-..");
        morseCodeMap.put('M', "--");
        morseCodeMap.put('N', "-.");
        morseCodeMap.put('O', "---");
        morseCodeMap.put('P', ".--.");
        morseCodeMap.put('Q', "--.-");
        morseCodeMap.put('R', ".-.");
        morseCodeMap.put('S', "...");
        morseCodeMap.put('T', "-");
        morseCodeMap.put('U', "..-");
        morseCodeMap.put('V', "...-");
        morseCodeMap.put('W', ".--");
        morseCodeMap.put('X', "-..-");
        morseCodeMap.put('Y', "-.--");
        morseCodeMap.put('Z', "--..");

        morseCodeMap.put('1', ".----");
        morseCodeMap.put('2', "..---");
        morseCodeMap.put('3', "...--");
        morseCodeMap.put('4', "....-");
        morseCodeMap.put('5', ".....");
        morseCodeMap.put('6', "-....");
        morseCodeMap.put('7', "--...");
        morseCodeMap.put('8', "---..");
        morseCodeMap.put('9', "----.");
        morseCodeMap.put('0', "-----");

        morseCodeMap.put('.', ".-.-.-");
        morseCodeMap.put(',', "--..--");
        morseCodeMap.put('?', "..--..");
        morseCodeMap.put('!', "-.-.--");
        morseCodeMap.put(':', "---...");
        morseCodeMap.put(';', "-.-.-.");
        morseCodeMap.put('-', "-....-");
        morseCodeMap.put('(', "-.--.");
        morseCodeMap.put(')', "-.--.-");
        morseCodeMap.put('/', "-..-.");
        morseCodeMap.put('@', ".--.-.");
        morseCodeMap.put('=', "-...-");
        morseCodeMap.put('+', ".-.-.");
        morseCodeMap.put('_', "..--.-");
        morseCodeMap.put('$', "...-..-");
        morseCodeMap.put('&', ".-...");
        //morseCodeMap.put('\', ".----.");


        for (char key : morseCodeMap.keySet()) {
            charMap.put(morseCodeMap.get(key), key);
        }
    }
}
