package JavaExamplesRobertson;

import java.util.Scanner;

public class DoLoop {
//  When to use a do loop:
// If you know that the repeated thing will always have to be done at least one time.
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    int x;
    System.out.println("Enter an integer(-99999 to quit):");
    x = sc.nextInt();
   do  {// gagawin muna pinapagawa hanggat di pa natatapos ang condition.
        sum = sum + x;
        System.out.println("Enter an integer (-99999):");
        x = sc.nextInt();
    }while((x != -99999));
    System.out.println("The sum is" + sum);
    sc.close();
}// end main



 }
