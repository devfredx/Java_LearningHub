import java.util.Scanner;

public class Quiz {
    private Question[] questions;
    private Scanner scanner;

    public Quiz(Question[] questions) {
        this.questions = questions;
        this.scanner = new Scanner(System.in);
    }

    public void startQuiz() {
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        System.out.println("\nHello, " + userName + "! Welcome to the Java Exam.\n");

        int correctAnswers = 0;

        for (Question question : questions) {
            System.out.println(question.getQuestion());
            for (String option : question.getOptions()) {
                System.out.println("\t" + option);
            }
            System.out.print("Your answer (A/B/C/D/E): ");
            String userAnswer = scanner.nextLine().toUpperCase();

            if (userAnswer.equals(question.getCorrectAnswer())) {
                correctAnswers++;
            }
        }

        System.out.println("\nResults:");
        System.out.println("Total Questions: " + questions.length);
        System.out.println("Correct Answers: " + correctAnswers);
        System.out.println("Incorrect Answers: " + (questions.length - correctAnswers));

        double userScore = ((double) correctAnswers / questions.length) * 100;
        System.out.printf("Your Score: %.2f%%\n", userScore);
        System.out.println("Average User Score: 82%");

        scanner.close();
    }
}
