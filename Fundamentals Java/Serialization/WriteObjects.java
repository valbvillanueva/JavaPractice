package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteObjects {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Writing Objects");

        Person mike = new Person(543, "mike");
        Person sue = new Person(123, "sue");

        System.out.println(mike);
        System.out.println(sue);

        try (FileOutputStream fs = new FileOutputStream("people.bin")) {
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
