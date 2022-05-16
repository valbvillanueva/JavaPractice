package JavaExamplesRobertson;
import java.util.Scanner;

public class BooleanExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entry;               // user's entry - enter key or q
        boolean upDirection = true; // Is the current direction up?
        boolean inMotion = false;   // Is garage door currently moving?
    
        System.out.println("GARAGE DOOR OPENER SIMULATOR\n");
    
        do
        {
          System.out.print("Press Enter, or enter 'q' to quit: ");
          entry = sc.nextLine();
    
          if (entry.equals(""))    // pressing Enter generates ""
          {
            inMotion = !inMotion;  // button toggles motion state
            if (inMotion)
            {
              if (upDirection)
              {
                System.out.println("moving up");
              }
              else
              {
                System.out.println("moving down");
              }
            }
            else
            {
              System.out.println("stopped");
              upDirection = !upDirection;  // direction reverses at stop
            }
          } // end if entry = ""
        } while (entry.equals(""));
        sc.close();
    
    }//end main
}//end BooleanExample class
