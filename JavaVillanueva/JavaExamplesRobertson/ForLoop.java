package JavaExamplesRobertson;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        // When to use a for loop:
        // If you know the exact number of loop iterations before the loop begins.

        for (int i = 10; i > 0; i--) {

            System.out.println(i);
        }
        System.out.println("Lift of!");
        /////////////////////////////////////////////////////////////////
        Scanner sc = new Scanner(System.in);

        int number; // user entered number
        double factorial = 1.0; // factorial of user entry

        System.out.print("Enter a whole number: ");
        number = sc.nextInt();

        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        System.out.println(number + "! = " + factorial);
        sc.close();
        // end second loop
        // for (int k = 1; k <= 99; k++) { // printing squares
        //     System.out.println(k * k);
        }
    }
