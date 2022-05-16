package JavaActivitiesRobertson;

/**
* Java Course 1, Module 3
*
*Practice Activity 3 Input a String and Output Its Length and first initial
 *
* @author Val Villanueva
 *
*/
import java.util.Scanner;

public class nameTell {
    public static void main(String[] args) {
        System.out.print("Enter your name: "); // Prompts the user his/her name.

        Scanner userInput = new Scanner(System.in);
        String userName = userInput.nextLine();
        System.out.println();
        System.out.println("Your name has " + userName.length() + " letters including spaces."); // Counts how many
                                                                                                  // characters the user
                                                                                                  // input has.
        System.out.println();
        System.out.println("The first letter is: " + userName.charAt(0)); // Starts with index 0 so it means that the
                                                                            // first character will be recognized.

        userInput.close();

    }
}
