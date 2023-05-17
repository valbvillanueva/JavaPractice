import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaders {

  
    public static void main(String[] args) {
        BufferedReader br = null;
        File file = new File("test.txt");
        try {
            FileReader fr = new FileReader(file);
          br = new BufferedReader(fr);

            String line;

         while(   (line = br.readLine()) != null){
            System.out.println(line);
         }
        } catch (FileNotFoundException e) {
            System.out.println("File Not found: " + file.toString());
        } catch (IOException e) {
           System.out.println("Unable to read file: " + file.toString());
        }
        finally {
            try {
                br.close();
            } catch (IOException e) {
              System.out.println("Unable to close file: "  + file.toString());
            }
            catch(NullPointerException ex){
                //File was probably never opened!
            }
        }
        

    }

}
