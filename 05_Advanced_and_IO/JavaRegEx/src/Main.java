import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String sampleText = "Log report: ID 12345, status: SUCCESS, date: 2026-01-23. Email: tester@domain.com";

        Pattern wordPattern = Pattern.compile("SUCCESS", Pattern.CASE_INSENSITIVE);
        Matcher wordMatcher = wordPattern.matcher(sampleText);

        while (wordMatcher.find()) {
            System.out.println("Status found at index: " + wordMatcher.start());
        }

        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern emailPattern = Pattern.compile(emailRegex);
        Matcher emailMatcher = emailPattern.matcher("tester@domain.com");
        System.out.println("Is email valid: " + emailMatcher.matches());

        String digitsRegex = "\\d+";
        Pattern digitsPattern = Pattern.compile(digitsRegex);
        Matcher digitsMatcher = digitsPattern.matcher(sampleText);

        while (digitsMatcher.find()) {
            System.out.println("Number found: " + digitsMatcher.group());
        }

        String cleanedText = sampleText.replaceAll("\\s+", "_");
        System.out.println("Cleaned text: " + cleanedText);
    }
}