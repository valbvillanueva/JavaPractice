package PreBuiltMethods;

import java.util.Scanner;

public class SubstringMethod {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        String yoda = sc.nextLine();
      
        int index = yoda.indexOf('-');
      
    
    System.out.println(yoda.substring(index));
    // System.out.println(yoda.substring(index));
    // System.out.println(yoda.substring(4, 13));
   
    }
}
