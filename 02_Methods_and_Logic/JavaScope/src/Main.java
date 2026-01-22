public class Main {

    static int classLevelVariable = 100;

    public static void main(String[] args) {

        int methodLevelVariable = 50;

        System.out.println("Class variable in main: " + classLevelVariable);
        System.out.println("Method variable in main: " + methodLevelVariable);

        if (methodLevelVariable > 10) {
            int blockLevelVariable = 25;
            System.out.println("Accessing method variable in block: " + methodLevelVariable);
            System.out.println("Block variable: " + blockLevelVariable);
        }

        displayOtherScope();
    }

    public static void displayOtherScope() {
        int anotherMethodVariable = 10;

        System.out.println("Class variable in another method: " + classLevelVariable);
        System.out.println("Variable local to this method: " + anotherMethodVariable);
    }
}