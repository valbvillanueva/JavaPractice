package JavaActivitiesRobertson;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VariableNameChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char usr;
        String usrStr;
        System.out.println("This program checks the properness of a proposed Java variable name.");
        do {
          
            System.out.print("Enter a variable name (q to quit):");
            usrStr = sc.nextLine(); //Allows user to type a string.
            usr = usrStr.charAt(0); //first character is read from the input of the string.
          

            Pattern AllowDollarSigns = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE); // Regex pattern for allowing "$".
                                                                                               
            // between
            Matcher usrStrCompareWithAllowDollarSigns = AllowDollarSigns.matcher(usrStr);
            boolean conditionForAllowDollarSign = usrStrCompareWithAllowDollarSigns.find();

            Pattern NoSpaces = Pattern.compile("[^[a-zA-Z0-9_]*$]", Pattern.CASE_INSENSITIVE); // Regex pattern for not allowing spaces.
            // allowing spaces
            Matcher MatcherForNoSpaces = NoSpaces.matcher(usrStr);
            boolean conditionForNospaces = MatcherForNoSpaces.find();
            if (Character.isLowerCase(usr) && !conditionForNospaces) {//Accepts only lowercase letters in front, and no spaces in between.
                System.out.println("Good!");

            }
           else if (Character.isDigit(usr) || conditionForNospaces) {//Does not accept numbers infront and does not allow user to have spaces.
                System.out.println("Illegal.");

            } else if (Character.isUpperCase(usr) || conditionForAllowDollarSign) {//Accepts only uppercase letters and dollar signs in between.
                                                                           
                System.out.println("Legal,but uses poor Style.");
            }

        } while (!Character.equalsIgnoreCase('q'));
      
        sc.close();
    }
}
