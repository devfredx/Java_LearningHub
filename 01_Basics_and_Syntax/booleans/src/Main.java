public class JavaBooleans {
    public static void main(String[] args) {

        boolean isJavaFun = true;
        boolean isFishTasty = false;

        System.out.println("Is Java fun: " + isJavaFun);
        System.out.println("Is fish tasty: " + isFishTasty);

        int age = 25;
        int votingAge = 18;
        System.out.println("Is age enough to vote: " + (age >= votingAge));

        int x = 10;
        System.out.println("Is x equal to 10: " + (x == 10));
        System.out.println("Is x equal to 15: " + (x == 15));

        boolean hasAccount = true;
        boolean isPasswordCorrect = false;

        System.out.println("Login status: " + (hasAccount && isPasswordCorrect));
        System.out.println("Access allowed: " + (hasAccount || isPasswordCorrect));
        System.out.println("Negative status: " + (!hasAccount));

        int temperature = 25;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println("Is weather warm: " + isWarm);
    }
}