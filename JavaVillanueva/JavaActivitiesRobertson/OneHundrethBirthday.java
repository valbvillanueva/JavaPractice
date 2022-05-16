package JavaActivitiesRobertson;

import java.util.Scanner;

public class OneHundrethBirthday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the month you were born: ");
        String month = sc.nextLine();

        System.out.print("Enter the day you were born: ");
        byte day = sc.nextByte();

        System.out.print("Enter the year you were born: ");
        int year = sc.nextInt();

        int yearIncrease = year + 100;

        System.out.println("You will be 100 on " + month + " " + day + " ," + yearIncrease);
        sc.close();
    }
}
