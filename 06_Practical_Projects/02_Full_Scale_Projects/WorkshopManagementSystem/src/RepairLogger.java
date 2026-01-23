import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RepairLogger {
    private static final String FILE_NAME = "repair_logs.txt";

    public void logNewJob(String customerName, String vehicleDetails) {
        try (FileWriter fw = new FileWriter(FILE_NAME, true);
             BufferedWriter bw = new BufferedWriter(fw)) {

            String logEntry = "Customer: " + customerName + " | Vehicle: " + vehicleDetails;
            bw.write(logEntry);
            bw.newLine();

            System.out.println("[FILE] Activity successfully logged to file.");

        } catch (IOException e) {
            System.out.println("[ERROR] Could not write to log file: " + e.getMessage());
        }
    }
}