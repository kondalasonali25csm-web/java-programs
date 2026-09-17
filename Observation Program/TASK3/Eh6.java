package observation;
import java.io.FileReader;
import java.io.IOException;

    public class Eh6 {
        public static void main(String[] args) {
            try {
                FileReader file = new FileReader("data.txt");
                file.read(); // Might fail if the file gets corrupted or unplugged
            } catch (IOException e) {
                System.out.println("Error: Something went wrong while reading the file.");
            }
        }
    }
