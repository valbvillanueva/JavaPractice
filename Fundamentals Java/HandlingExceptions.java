// import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.FileReader;

// public class HandlingExceptions {
//     public static void main(String[] args) throws FileNotFoundException {
//         //two ways
//         File file = new File("test.txt");

//         FileReader fr = new FileReader(file);
//     }
// }

//other way
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class HandlingExceptions {
    public static void main(String[] args) {
        // two ways
        File file = new File("test.txt");

        try {
            FileReader fr = new FileReader(file);
            System.out.println("Continuing ....");
        } catch (FileNotFoundException e) {
            System.out.println("File not found please insert: " + file.toString());
        }
        System.out.println("Finished");
    }
}
