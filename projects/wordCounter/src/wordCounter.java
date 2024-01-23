import java.util.Scanner;

public class wordCounter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter your text: ");
        String text = scanner.nextLine();
        System.out.println("");

        int sentenceCount = text.split("[!?.:]+").length;
        int wordCount = text.split("\\s+").length;
        int specialCharCount = text.replaceAll("[\\w\\s]+", "").length();
        int numberCount = text.replaceAll("[^0-9]+", "").length();


        System.out.println("Sentences: " + sentenceCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Special characters: " + specialCharCount);
        System.out.println("Numbers: " + numberCount);

    }
}
