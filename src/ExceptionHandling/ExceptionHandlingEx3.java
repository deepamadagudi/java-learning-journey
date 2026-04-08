package ExceptionHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingEx3 {
           // CheckedException

        // 'throws' warns the caller — compiler FORCES you to handle this
        public static void readFile(String fileName) throws IOException {
            File file = new File(fileName);
            FileReader fr = new FileReader(file); // IOException if file not found
            System.out.println("File opened successfully!");
            fr.close();
        }

        public static void main(String[] args) {

            // Caller MUST handle it — compiler won't let you ignore it
            try {
                readFile("data.txt");         // file doesn't exist
            } catch (IOException e) {
                System.out.println("File error: " + e.getMessage());
            } finally {
                System.out.println("File operation attempted.");
            }
        }
    }
