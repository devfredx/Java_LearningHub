import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write("Automatic resource management is efficient.");
            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try (CustomResource resource = new CustomResource()) {
            resource.execute();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

class CustomResource implements AutoCloseable {
    public void execute() {
        System.out.println("Custom resource is performing an action.");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Custom resource is automatically closed.");
    }
}