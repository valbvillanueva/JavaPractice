package JavaExamplesRobertson;

public class TracingSample {
   public static void main(String[] args) {
    int a = 4, b = 6;
    double c = 2.0;
    a -= b;
    // a = -2
    b--;
    // b = 5
    c++;
    // c = 3 (old)
    c *= b;
    // c = 15 (new)
    System.out.println("a + b + c = " + (a + b + c)); 
    //a and b are promoted to double 




    
   } 
}
