import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
       
            File file = new File("nonexistent.txt");
            Scanner scanner = new Scanner(file); // File doesn't exist
       
    }
}