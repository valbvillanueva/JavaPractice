package JavaActivitiesRobertson;


import java.util.Scanner;

/**
 * Java Course 1, Module 3
 * 
 * Checks the properness of a given variable name.
 *
 * @author Val Villanueva
 *
 */
public class VariableNamerChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String usrStr;
        do {
            System.out.print("Enter a variable name (q to quit):");
            usrStr = sc.nextLine();
       
        } while (!usrStr.equalsIgnoreCase("q"));
        System.out.println("QUIT");
        sc.close();
    }

}
