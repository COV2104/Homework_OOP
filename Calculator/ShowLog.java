package Calculator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ShowLog {

    public static void showLog() {
        try (BufferedReader reader = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
