import java.io.IOException;
import java.util.Scanner;

public class close_application {
    public static void main(String[] args) throws IOException {
        try {
            Scanner in = new Scanner(System.in); // read from standard input
            String process = "taskkill /F /IM " + in.nextLine();; // read the process name
            Runtime.getRuntime().exec(process); // execute the process
            in.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            // close scanner
        }
    }
}
