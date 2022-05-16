package JavaExamplesRobertson;

import java.util.Scanner;

public class SwitchZipCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("sadsada");
        String strzipcode = sc.nextLine();   
        
        String msg = strzipcode;  
        strzipcode = String.valueOf(strzipcode.charAt(0));
              int num = (int) strzipcode.charAt(0);
      
              System.out.println(strzipcode.charAt(0)+"!");
              System.out.println(strzipcode.charAt(0)+10);
              System.out.println("Decimal values of character" + strzipcode.charAt(0)+ "is:"+ num);
      
              switch(strzipcode.charAt(0)){
                  case '0':case '1' : case '2': case '3': System.out.println(msg + "is on the east coast");
                  break;

    }
    sc.close();
}
}