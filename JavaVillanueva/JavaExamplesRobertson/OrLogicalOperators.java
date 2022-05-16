package JavaExamplesRobertson;

import java.util.Scanner;

public class OrLogicalOperators {
    public static void main(String[] args) {
        System.out.print("Please Enter a character: ");
        Scanner sc = new Scanner(System.in);
        String response = sc.nextLine();
        if (response.equals("q") || response.equals("Q")) {
            {
                System.out.println("Bye");
            }
        } else {
            System.out.println("Hi!");

        }
        if(response.equalsIgnoreCase("q"))//Ignore case another alternative for if (response.equals("q") || response.equals("Q")) 
        {
            System.out.println("Bye");
        }
        sc.close();
    }
}
