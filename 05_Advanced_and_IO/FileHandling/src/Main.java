import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File myFile = new File("data_report.txt");

            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }

            FileWriter writer = new FileWriter("data_report.txt");
            writer.write("Log Entry: System check completed.\n");
            writer.write("Status: SUCCESS\n");
            writer.close();
            System.out.println("Successfully wrote to the file.");

            System.out.println("Absolute path: " + myFile.getAbsolutePath());
            System.out.println("File size in bytes: " + myFile.length());

            Scanner reader = new Scanner(myFile);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println("Content: " + data);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred during file operations.");
            e.printStackTrace();
        }
    }
}