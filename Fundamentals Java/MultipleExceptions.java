import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

class Test {
    public void run() throws IOException, ParseException {
        throw new ParseException("Error in command list.", 2);
    }
    public void input() throws IOException, FileNotFoundException{

    }
}

public class MultipleExceptions {
    public static void main(String[] args) {
        // throw new IOException();
        Test test = new Test();
        // try {
        // test.run();
        // } catch (IOException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // } catch (ParseException e) {
        // System.out.println("Couldn't parse command file.");
        // }
        // try {
        // test.run();
        // } catch (IOException | ParseException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }

        try {
            test.run();
        } catch (Exception e) {
           
            e.printStackTrace();
        }
        try {
            test.input();
        } catch (FileNotFoundException e) {
           
            e.printStackTrace();
        } catch (IOException e) {
           
            e.printStackTrace();
        }

        try {
            test.input();
        } catch (IOException e) {
            
            e.printStackTrace();
        }
    }
}
