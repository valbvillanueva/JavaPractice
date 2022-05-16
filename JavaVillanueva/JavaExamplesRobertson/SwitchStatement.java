package JavaExamplesRobertson;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        System.out.print("Choose from 1 - 4: ");
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        switch (i) {
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
            case 4:
                System.out.println("C-D");
                break;
            default:
                System.out.println("E-Z");
        }// end switch
        /////////////// zip code activity/////////////////////////////////

sc.close();
  
        }
}


