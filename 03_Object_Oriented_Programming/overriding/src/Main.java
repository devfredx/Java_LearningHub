public class Main {

    public static void main(String[] args) {

        Base_CreditManager[] creditManagers = new Base_CreditManager[] {new Teacher_CreditManager(),new Agriculture_CreditManager(),new Student_CreditManager()};

        for (Base_CreditManager creditManager : creditManagers)
            System.out.println(creditManager.calculate(1000));

    }

}
