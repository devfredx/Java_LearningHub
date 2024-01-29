import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        System.out.println("\nHello, " + userName + "! Welcome to the Java Exam.\n");


        int correctAnswers = 0;
        int totalQuestions = 5;

        for (int i = 0; i < totalQuestions; i++) {
            System.out.println(QuestionBank.questions[i]);
            System.out.print("Your answer (A/B/C/D/E): ");
            String userAnswer = scanner.nextLine().toUpperCase();

            if (userAnswer.equals(QuestionBank.answers[i])) {
                correctAnswers++;
            }
        }


        System.out.println("\nResults:");
        System.out.println("Total Questions: " + totalQuestions);
        System.out.println("Correct Answers: " + correctAnswers);
        System.out.println("Incorrect Answers: " + (totalQuestions - correctAnswers));

        double userScore = ((double) correctAnswers / totalQuestions) * 100;
        System.out.printf("Your Score: %.2f%%\n", userScore);
        System.out.println("Average User Score: 82%");

        scanner.close();
    }
}