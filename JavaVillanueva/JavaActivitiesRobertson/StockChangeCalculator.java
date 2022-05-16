package JavaActivitiesRobertson;

import java.text.DecimalFormat;
import java.util.Scanner;

public class StockChangeCalculator {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the Stock Symbol");
        String stockSymbol = userInput.nextLine();

        System.out.println("Enter " + stockSymbol + "'s day 1 value: ");
        double day1 = userInput.nextDouble();

        System.out.println("Enter " + stockSymbol + "'s day 2 value: ");
        double day2 = userInput.nextDouble();
        double total = ((day2 - day1) / day1) * 100;

        DecimalFormat formatter = new DecimalFormat("#0.00");
        System.out.println(stockSymbol + " has changed " + formatter.format(total) + "% in one day");
        userInput.close();

    }
}
