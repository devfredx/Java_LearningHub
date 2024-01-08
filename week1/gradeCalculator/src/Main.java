import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int[] grades = new int[numSubjects];
        int sum = 0;

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the grade for Subject " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
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

        // Display results
        System.out.println("\nAverage Grade: " + average);
        System.out.println("Letter Grade: " + letterGrade);
        scanner.close();
    }
}
