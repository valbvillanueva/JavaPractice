package PreBuiltMethods;
import java.util.Scanner;
// Wrapper Class		String --> Number			number --> String
// Integer			Integer.parseInt(<String>)		Integer.toString(<#>)
// Long			Long.parseLong(<String>)		Long.toString(<#>)
// Float			Float.parseFloat(<String>)		Float.toString(<#)
// Double			Double.parseDouble(<String>)		Double.toString(<#>)
public class StringToNumber
{
  public static void main(String[] args)
  {
    Scanner stdIn = new Scanner(System.in);
    String input;
    int winningNumber =1;


    System.out.println("Want to win a million dollars?");
    System.out.println("If so, guess the winning number (a" +
      " number between 1 and " + Integer.MAX_VALUE + ").");
    do
    {
      System.out.print(
        "Insert $1.00 and enter your number or 'q' to quit: ");
      input = stdIn.nextLine();
      if (input.equals("give me a hint"))    //  a back door
      {
        System.out.println("try: " + winningNumber);
      }
      else if (!input.equals("q"))
      {
        if (Integer.parseInt(input) == winningNumber) //Convert String to Int because cannot be compared to winning number which is Int
        {
          System.out.println("YOU WIN!");
          input = "q"; // force winners to quit
        }
        else
        {
          System.out.println(
            "Sorry, good guess, but not quite right.");
        }
      } // end else if
    } while (!input.equals("q"));
    System.out.println("Thanks for playing. Come again!");
    stdIn.close();
  } // end main
} // end Lottery class
