package JavaExercises.JavaExerciseLunch;


public class LunchOrder {
    public static void main(String[] args) {
        System.out.println("1 - Hamburger, \n2 - Salad, \n3 - French Fries , \n4 - Soda ");
        Lunch hamburger = new Lunch(9,33,1);
        Lunch salad = new Lunch(1,11,5);
        Lunch frenchFries = new Lunch(11,36,4);
        Lunch soda = new Lunch(0,38,0);

        System.out.println("Each Hamburger has " + hamburger  );
        System.out.println("Each salad has "+ salad);
        System.out.println("Each frenchfries has " + frenchFries);
        System.out.println("Each soda has " + soda);
        
        
    }
}
