public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager(new Oracle_CustomerDal());
        //customerManager.customerDal = new Oracle_CustomerDal();
        customerManager.add();


    }
}