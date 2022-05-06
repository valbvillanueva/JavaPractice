package JavaExercises.JavaExcercisePenny.Penny.src.application;

import java.util.*;
import attributes.Penny; //to use extends keyword

public class MySavings {
    public static void main(String[] args) {

        Penny myObj = new Penny(); // Creating an instance of class

        Scanner mySc = new Scanner(System.in);

        // myObj.setDime(10);
        // System.out.print("The value of a dime is : ");
        // System.out.println(myObj.getDime());

        // myObj.setNickel(5);
        // System.out.print("The value of a nickel is : ");
        // System.out.println(myObj.getNickel());

        // myObj.setQuarter(25);
        // System.out.print("The value of a quarter is : ");
        // System.out.println(myObj.getQuarter());

        // myObj.setPenny(1);
        // System.out.print("The value of a penny is : ");
        // System.out.println(myObj.getPenny());

        // System.out.println("please enter quantity for: ");

        int choice = 6;
        int quantity = 0;


        myObj.setPenny(5);
        System.out.println("add 5 to penny" + myObj.getPenny());

        myObj.setPenny(myObj.getPenny()*-1);
        System.out.println("subtract all from penny" + myObj.getPenny());

        do {
            System.out.println(
                    "1. Show total in bank. \n2. Add a penny. \n3. Add a nickel. \n4. Add a dime\n5. Add a quarter.\n6. Take money out of bank.\nEnter O to quit \nEnter your choice");

            // myObj.setDime(money);
            // System.out.println(myObj.getDime());
            choice = mySc.nextInt();
            // ((gp) + (gn * 5) + (gd* 10) + (gq* 25) ) // formula

            switch (choice) {
                case 1:

                    System.out.println("\nTotal Value is : " + myObj.getBank());
                            // + ((myObj.getPenny() + (myObj.getNickel() * 5) + (myObj.getDime() * 10)
                            //         + (myObj.getQuarter() * 25)))); 
                    break;

                case 2:
                    System.out.println("Enter Quantity for Penny: ");
                    quantity = mySc.nextInt();
                    // myObj.setPenny(quantity);
                    myObj.setBank(quantity);
                    break;
                    
                    case 3:
                    System.out.println("Enter Quantity for Nickel: ");
                    quantity = mySc.nextInt();
                    myObj.setBank(quantity*5);
                    // myObj.setNickel(quantity);
                    break;
                    
                    case 4:
                    System.out.println("Enter Quantity for Dime: ");
                    quantity = mySc.nextInt();
                    myObj.setBank(quantity*10);
                    // myObj.setDime(quantity);
                    break;
                    
                    case 5:
                    System.out.println("Enter Quantity for Quarter: ");
                    quantity = mySc.nextInt();
                    myObj.setBank(quantity*25);
                    // myObj.setQuarter(quantity);
                    break;
                    case 6:
                    System.out.println("Take Money out of Bank");
                    quantity = mySc.nextInt();
                    myObj.setBank( quantity*-1); 
                    break;
                    default:
            }

        } while (choice != 0 && choice <= 6);
    }
}
