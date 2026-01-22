class DataVault {
    public String publicData = "Public: Accessible everywhere";
    protected String protectedData = "Protected: Same package and subclasses";
    String defaultData = "Default: Same package only";
    private String privateData = "Private: This class only";

    public void displayPrivateData() {
        System.out.println("Accessing from within the class: " + privateData);
    }
}

public class Main {
    public static void main(String[] args) {
        DataVault vault = new DataVault();

        System.out.println(vault.publicData);
        System.out.println(vault.protectedData);
        System.out.println(vault.defaultData);

        vault.displayPrivateData();

        System.out.println("Private data cannot be accessed directly: vault.privateData (Error)");
    }
}