public class Main {

    public static void main(String[] args) {

        Product product = new Product();

        product.name = "Laptop";
        product.id = 1;
        product.description = "Asus Laptop";
        product.price = 5000;
        product.stockAmount = 3;

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        /*
        productManager.Add2(1, "", "", 2, 200);
        productManager.Add3(1, "", "", 2, 200);
        productManager.Add4(1, "", "", 2, 200);
        productManager.Add5(1, "", "", 2, 200);
        productManager.Add6(1, "", "", 2, 200);
        productManager.Add7(1, "", "", 2, 200);
        */


    }
}