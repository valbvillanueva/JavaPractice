package JavaActivitiesRobertson;

import java.util.Scanner;

public class PeachBoxCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many peaches do you want?: ");
        int user = sc.nextInt();
        for (int i = 0; i <= user; i = i + 20) {

            System.out.println("shipped " + i + " peaches so far");
            sc.close();
        }

    }

}