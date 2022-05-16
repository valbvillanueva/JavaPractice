
package JavaActivitiesRobertson;

import java.util.Scanner;

/**
 * Java Course 1, Module 2
 *
 *Calculate years it takes to reach $100,000 & $1,000,000.
 *
 * @author Val Villanueva
 *
 */
public class BankBalance {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter Starting balance: ");// Prompts the user for the starting the balance.
        int balance = userInput.nextInt();

        int yearCounter = 0; // This counts the year evertime the while loop increments until the condition
                             // is satisfied.

        while (balance <= 100_000) { // While balance does not reach 100,000 it will keep incrementing using the
                                     // formula stated (balance*2 = balance).
            balance *= 2;
            yearCounter++;
        }
        System.out.println("It takes " + yearCounter + " years to reach $100,000."); // This displays the year it takes
                                                                                     // to reach 100,000.

        while (balance <= 1_000_000) {
            balance *= 2;
            yearCounter++;
        }
        System.out.println("It takes " + yearCounter + " years to reach $1,000,000."); // This displays the year it
                                                                                       // takes to reach 1,000,000.

        userInput.close();

    }

}
