public class Main {
    public static void main(String[] args) {

        int firstScore = 80;
        int secondScore = 95;
        int thirdScore = 70;

        double averageResult = calculateAverage(firstScore, secondScore, thirdScore);
        System.out.println("Average Result: " + averageResult);

        int[] dataSet = {5, 10, 15, 20};
        int runningTotal = 0;

        for (int i = 0; i < dataSet.length; i++) {
            runningTotal = updateSum(runningTotal, dataSet[i]);
            System.out.println("Iteration " + i + " - Total: " + runningTotal);
        }

        checkStatus(runningTotal);
    }

    public static double calculateAverage(int a, int b, int c) {
        int sum = a + b + c;
        return (double) sum / 3;
    }

    public static int updateSum(int current, int nextValue) {
        return current + nextValue;
    }

    public static void checkStatus(int total) {
        if (total > 40) {
            System.out.println("Status: High");
        } else {
            System.out.println("Status: Low");
        }
    }
}