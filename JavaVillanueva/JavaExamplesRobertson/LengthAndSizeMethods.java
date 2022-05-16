package JavaExamplesRobertson;

public class LengthAndSizeMethods {
   public static void main(String[] args) {
       String name; //declaration

       name = "Val"; //initialization

       //charAt(#) index count
       System.out.println(name.charAt(0));
       //length how many characters
       System.out.println(name.length());

       String animal1 = "Horse";
       String animal2 = "Fly";
       String newCreature;
       newCreature = animal1 + animal2;
   
       System.out.println(newCreature.equals("HorseFly"));
       System.out.println(newCreature.equals("horsefly"));
       System.out.println(newCreature.equalsIgnoreCase("horsefly"));
   

   } 
}
