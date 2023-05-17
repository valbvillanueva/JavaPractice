import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Temp implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Closing!");
        throw new Exception("oh no!");
    }

}

// public class TryWithResources {
// public static void main(String[] args) {
// try (Temp temp = new Temp()) {

// } catch (Exception e) {

// }

// }
// }

// Other way of doing it with one try
public class TryWithResources {
    public static void main(String[] args) {
        File file = new File("test.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            System.out.println("Can't find file" + file.toString());
        }catch(IOException e){
            System.out.println("Unable to read file" + file.toString());
        }
    }
}