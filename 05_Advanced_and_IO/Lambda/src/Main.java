import java.util.ArrayList;
import java.util.Collections;

interface MathOperation {
    int operate(int a, int b);
}

interface MessagePrinter {
    void print(String message);
}

public class Main {
    public static void main(String[] args) {

        MathOperation addition = (a, b) -> a + b;
        MathOperation multiplication = (a, b) -> a * b;

        System.out.println("Addition: " + addition.operate(10, 5));
        System.out.println("Multiplication: " + multiplication.operate(10, 5));

        MessagePrinter printer = message -> System.out.println("Output: " + message);
        printer.print("Lambda expression is working.");

        ArrayList<String> technologyStack = new ArrayList<>();
        technologyStack.add("Java");
        technologyStack.add("Python");
        technologyStack.add("Selenium");
        technologyStack.add("Appium");

        technologyStack.forEach(item -> System.out.println("Tech: " + item));

        Collections.sort(technologyStack, (s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted Stack: " + technologyStack);
    }
}