public class CustomerManager {
    privat ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal){
        this.customerDal = customerDal;
    }
    public void add(){
        customerDal.Add();
    }
}
