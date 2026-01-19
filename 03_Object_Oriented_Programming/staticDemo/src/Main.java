public class Main {

    public static void main(String[] args) {

        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.price = 1099;
        product.name = "";

        manager.add(product);

        DatabaseHelper.Crud.Delete();
        DatabaseHelper.Connection.createConnection();

    }

}
