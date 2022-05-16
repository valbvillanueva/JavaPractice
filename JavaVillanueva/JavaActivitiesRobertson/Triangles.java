package JavaActivitiesRobertson;

import java.util.Scanner;

public class Triangles {
    /**
* Java Course 1, Module 2
* 
*Generating an isosceles triangle made of asterisks. 
 *
* @author Val Villanueva
 *
*/
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the size of the equal sides in an isosceles triangle: "); //Asks for the user input.
        int triangleSize = userInput.nextInt();
        for (int col = 0; col < triangleSize; col++) {
            System.out.println(); // To print the asterisk vertically.

            for (int row = 0; row <= triangleSize; row++) {
                if (row <= col) { // deducts the sides if rows <= columns.
                    System.out.print("*"); // prints the rows of the asterisk.
                }
                userInput.close();
            }

        }
    }
}