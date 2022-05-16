package JavaExamplesRobertson;

import java.util.Scanner;

public class IfPeriodNeed {
    public static void main(String[] args) {
        String x;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence:");
        x = sc.nextLine();

        if (!x.contains(".")) {
            System.out.print("Invalid Entry - your sentence needs a period");
        }
        else{
            System.out.println("Good Sentence");
        }
        sc.close();
    }
}
