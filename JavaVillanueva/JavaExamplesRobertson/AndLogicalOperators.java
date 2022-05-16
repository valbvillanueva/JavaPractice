package JavaExamplesRobertson;

import java.util.Scanner;

public class AndLogicalOperators {
    public static void main(String[] args) {
        int temp;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Temp:");
        temp = sc.nextInt();

        if (temp >= 50 && temp <= 90) {
            System.out.println("OK");
        } else {
            System.out.println("not OK");
        }
    
        int homePts;      // points scored by home team
        int opponentPts;  // points scored by opponents
        System.out.print("Home team points scored: ");
        homePts = sc.nextInt();
        System.out.print("Opposing team points scored: ");
        opponentPts = sc.nextInt();
        if(homePts >= 100 || homePts > opponentPts ){ // or operator
            System.out.println("Fans:Redeem your ticket stub for a free order of french fries at Yummy Burgers");
        }
        else{
            System.out.println("go home");
        }
        sc.close();
        }  
    }
