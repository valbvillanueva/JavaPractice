package JavaExamplesRobertson;

import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // height
        // width
        // character

        System.out.print("Enter Height: ");
        int height = sc.nextInt();
        System.out.print("Enter Width: ");
        int width = sc.nextInt();
        System.out.print("Enter character: ");
        char c = sc.next().charAt(0); // reading a character

        {
            for (int i = 0; i < height; i++) {
               
                for (int k = 0; k < width; k++) {
                    System.out.print(c);
                }
            }
            sc.close();

            // }
            // if (width >= 1) {
            // for (int i = 0; i < width; i++) {
            // System.out.print(c);
            // }
        }
    }
}
