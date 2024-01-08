import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of subjects: ");
        int numSubjects = getInputInt(scanner);
        int[] grades = new int[numSubjects];
        int sum = 0;

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the grade for Subject " + (i + 1) + ": ");
            grades[i] = getInputGrade(scanner);
            sum += grades[i];
        }

        double average = (double) sum / numSubjects;

        char letterGrade;
        if (average >= 90) {
            letterGrade = 'A';
        } else if (average >= 80) {
            letterGrade = 'B';
        } else if (average >= 70) {
            letterGrade = 'C';
        } else if (average >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }
        System.out.println("\nAverage Grade: " + average);
        System.out.println("Letter Grade: " + letterGrade);
        scanner.close();
    }

    private static int getInputInt(Scanner scanner) {
        int input;
        while (true) {
            try {
                input = scanner.nextInt();
                if (input > 0) {
                    return input;
                } else {
                    System.out.print("Please enter a positive integer. Try again.\n: ");
                }
            } catch (InputMismatchException e) {
                System.out.print("Please enter a valid integer. Try again.\n: ");
                scanner.next();
            }
        }
    }

    private static int getInputGrade(Scanner scanner) {
        int input;
        while (true) {
            try {
                input = scanner.nextInt();
                if (input >= 0 && input <= 100) {
                    return input;
                } else {
                    System.out.print("Please enter a grade between 0 and 100. Try again.\n: ");
                }
            } catch (InputMismatchException e) {
                System.out.print("Please enter a valid integer. Try again.\n: ");
                scanner.next();
            }
        }
    }
}
