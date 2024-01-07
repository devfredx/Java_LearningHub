import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the General Knowledge Quiz!");

        int totalQuestions = 5;
        int correctAnswers = 0;


        System.out.println("\nQuestion 1: What is the capital of Japan?");
        System.out.println("a) Beijing");
        System.out.println("b) Tokyo");
        System.out.println("c) Seoul");
        System.out.print("Your answer: ");
        String answer1 = scanner.next();
        if (answer1.equalsIgnoreCase("b"))
            correctAnswers++;


        System.out.println("\nQuestion 2: In which year did World War II end?");
        System.out.println("a) 1943");
        System.out.println("b) 1945");
        System.out.println("c) 1950");
        System.out.print("Your answer: ");
        String answer2 = scanner.next();
        if (answer2.equalsIgnoreCase("b"))
            correctAnswers++;


        System.out.println("\nQuestion 3: What is the largest ocean on Earth?");
        System.out.println("a) Atlantic Ocean");
        System.out.println("b) Indian Ocean");
        System.out.println("c) Pacific Ocean");
        System.out.print("Your answer: ");
        String answer3 = scanner.next();
        if (answer3.equalsIgnoreCase("c"))
            correctAnswers++;


        System.out.println("\nQuestion 4: Who wrote 'Romeo and Juliet'?");
        System.out.println("a) William Shakespeare");
        System.out.println("b) Jane Austen");
        System.out.println("c) Charles Dickens");
        System.out.print("Your answer: ");
        String answer4 = scanner.next();
        if (answer4.equalsIgnoreCase("a"))
            correctAnswers++;


        System.out.println("\nQuestion 5: What is the currency of Brazil?");
        System.out.println("a) Peso");
        System.out.println("b) Euro");
        System.out.println("c) Real");
        System.out.print("Your answer: ");
        String answer5 = scanner.next();
        if (answer5.equalsIgnoreCase("c"))
            correctAnswers++;

        // Display total score
        System.out.println("\nThanks for playing the General Knowledge Quiz!");
        System.out.println("You got " + correctAnswers + " out of " + totalQuestions + " questions correct.");
        scanner.close();

    }
}
