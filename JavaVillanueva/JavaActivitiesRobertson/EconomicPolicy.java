package JavaActivitiesRobertson;

import java.util.Scanner;
/**
* Java Course 1, Module 2
*
*Application of economic policy practices.
 *
* @author Val Villanueva
 *
*/
public class EconomicPolicy {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Please Enter Annual Growth Rate: ");//Prompts the user to state Annual Growth Rate
        double annualGrowthRate = userInput.nextDouble();
        System.out.print("Please Enter Inflation: ");
        double inflation = userInput.nextDouble();
        if (annualGrowthRate < 0.01) { //If user input is lesser than 0.01, then it shall do the following statements below.
            if (inflation < 0.03) {
                System.out.println("Increase welfare spending, reduce personal taxes, and decrease discount rate.");
            } else {
                System.out.println("Reduce business taxes.");
            }
        } else if (annualGrowthRate > 0.04) { //else if recognizes user input if it is greater than 0.04, then it shall do the following statements below.
            if (inflation < 0.01) {
                System.out.println("Increase personal and business taxes, and decrease discount rate.");
            } else if (inflation > 0.03) {
                System.out.println("Increase discount rate");
            }
            userInput.close();
        }

    }

}
