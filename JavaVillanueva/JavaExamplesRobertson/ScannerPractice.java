package JavaExamplesRobertson;
import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
 
    Scanner stdIn = new Scanner(System.in);
    String name;
    System.out.print("Enter your name: ");
    name = stdIn.nextLine();
    System.out.println("Hello " + name + "!");
    stdIn.close();
  } // end main
} // end class FriendlyHello

