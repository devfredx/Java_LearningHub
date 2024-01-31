import java.util.Scanner;

public class Quiz {
    private Question[] questions;
    private Scanner scanner;

    public Quiz(Question[] questions) {
        this.questions = questions;
        this.scanner = new Scanner(System.in);
    }

    public void startQuiz() {
        System.out.print("\nEnter your name: ");
        String userName = scanner.nextLine();
        System.out.print("\nHello, " + userName + "! Welcome to Java Exam.\n");
        System.out.print("Starting the program");
        PauseUtil.pause(1);
        System.out.print(".");
        PauseUtil.pause(1);
        System.out.print(".");
        PauseUtil.pause(1);
        System.out.println(".\n");


        int correctAnswers = 0;

        for (Question question : questions) {
            System.out.println(question.getQuestion());
            for (String option : question.getOptions()) {
                System.out.println("\t" + option);
            }
            System.out.print("    Your answer: ");
            String userAnswer = scanner.nextLine().toUpperCase();

            if (userAnswer.equals(question.getCorrectAnswer())) {
                correctAnswers++;
            }
            PauseUtil.pause(1);
        }

        System.out.print("\nCalculating Results");
        System.out.print(".");
        PauseUtil.pause(1);
        System.out.print(".");
        PauseUtil.pause(1);
        System.out.println(".\n");
        System.out.println("Total Questions: " + questions.length);
        System.out.println("Correct Answers: " + correctAnswers);
        System.out.println("Incorrect Answers: " + (questions.length - correctAnswers));

        double userScore = ((double) correctAnswers / questions.length) * 100;
        System.out.printf("Your Score: %.2f%%\n", userScore);
        System.out.println("Average User Score: 82%");

        scanner.close();
    }
}
