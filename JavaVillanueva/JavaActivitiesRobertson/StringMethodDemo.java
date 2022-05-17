package JavaActivitiesRobertson;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String text;
   
    do {
      System.out.println("test");
      text = sc.nextLine();
      // split string from space
      String[] result = text.split("-");// split string by "-"
      System.out.println(result[0]);
      System.out.println(result[1]);
      System.out.println(result[2]);
 
   
    } while (!text.equalsIgnoreCase("q"));
    sc.close();
  }

}
