import java.util.ArrayList;
import java.util.List;
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
        PauseUtil.pause(0.3);
        System.out.print(".");
        PauseUtil.pause(0.3);
        System.out.print(".");
        PauseUtil.pause(0.3);
        System.out.println(".\n");
        PauseUtil.pause(0.3);


        int correctAnswers = 0;
        List<Integer> correctIndices = new ArrayList<>();
        List<Integer> incorrectIndices = new ArrayList<>();
        List<String> userAnswers = new ArrayList<>();

        for (int i = 0; i < questions.length; i++) {
            Question question = questions[i];
            System.out.println(question.getQuestion());
            for (String option : question.getOptions()) {
                System.out.println("\t" + option);
            }
            System.out.print("    Your answer: ");
            String userAnswer = scanner.nextLine().toUpperCase();
            userAnswers.add(userAnswer);

            if (userAnswer.equals(question.getCorrectAnswer())) {
                correctAnswers++;
                correctIndices.add(i + 1);
            } else {
                incorrectIndices.add(i + 1);
            }
            //PauseUtil.pause(0.35);
        }

        System.out.print("\nCalculating Results");
        PauseUtil.pause(0.3);
        System.out.print(".");
        PauseUtil.pause(0.3);
        System.out.print(".");
        PauseUtil.pause(0.3);
        System.out.println(".\n");
        PauseUtil.pause(0.3);
        System.out.println("Total Questions: " + questions.length);
        System.out.println("Correct Answers: " + correctAnswers);
        System.out.println("Incorrect Answers: " + (questions.length - correctAnswers));

        double userScore = ((double) correctAnswers / questions.length) * 100;
        System.out.printf("Your Score: %.2f%%\n", userScore);
        System.out.println("Average User Score: 82%");

        System.out.println("\n1. List details of answers");
        System.out.println("2. Restart the exam");
        System.out.println("3. Exit");
        System.out.print("Choose: ");

        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            System.out.println("\nDetails of answers:");
            System.out.println("Question\tStatus\t  User Answer\t Correct Answer");

            for (int i = 0; i < questions.length; i++) {
                Question question = questions[i];
                String status = correctIndices.contains(i + 1) ? "✅" : "🟥";
                String userAnswer = userAnswers.get(i);
                String correctAnswer = question.getCorrectAnswer();

                System.out.println("   " + (i + 1) + "\t\t  " + status + "\t\t   " + userAnswer + "\t\t\t  " + (status.equals("🟥") ? correctAnswer : ""));
            }
        } else if (choice.equals("2")) {
            startQuiz();
        } else if (choice.equals("3")) {
            System.exit(0);
        }

        scanner.close();
    }
}
