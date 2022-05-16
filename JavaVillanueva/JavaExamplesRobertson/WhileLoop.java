package JavaExamplesRobertson;

import java.util.Scanner;

public class WhileLoop {
    // Use a loop statement if you need to do the same thing repeatedly.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int x;
        System.out.println("Enter an integer(-99999 to quit):");
        x = sc.nextInt();
        while (x != -99999) { //while di pa tanggap ang condition gawin mo ng gawin utos niya.
            sum = sum + x;
            System.out.println("Enter an integer (-99999):");
            x = sc.nextInt();
        }
        System.out.println("The sum is" + sum);
        sc.close();
    }// end main

}
