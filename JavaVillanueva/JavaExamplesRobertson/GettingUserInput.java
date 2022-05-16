package JavaExamplesRobertson;

import java.util.Scanner;

public class GettingUserInput {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Some Number");
        int user_input_number = scan.nextInt();// user will type numbere here

        System.out.println("The entered value is");
        System.out.println(user_input_number); // user's entered number

     
        System.out.println("Enter Some Decimal Value");
        double user_input_double = scan.nextDouble(); // user will type decimal here

        System.out.println("The entered Decimal is");
        System.out.println(user_input_double); // user's entered value


        System.out.println("Enter Some String"); // user will type String here
        String user_input_String = scan.nextLine();

        System.out.println("The entered String is");
        System.out.println(user_input_String); // user's Entered String
        scan.close();

    }
}
