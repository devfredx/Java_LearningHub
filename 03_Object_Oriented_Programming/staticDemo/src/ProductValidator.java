public class ProductValidator {

    static {
        System.out.println("Static");
    }

    public ProductValidator() {
        System.out.println("Constructive");
    }

    public static boolean isValid(Product product) {

        if (product.price > 0 && !product.name.isEmpty())
            return true;
        else
            return false;
    }

    public void Something() {

    }
}
