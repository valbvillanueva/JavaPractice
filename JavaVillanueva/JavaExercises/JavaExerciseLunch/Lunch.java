package JavaExercises.JavaExerciseLunch;

public class Lunch {
    // private int hamburger;
    // private int salad;
    // private int frenchFries;
    // private int soda;
    // private int price;
    private double fat;
    private double carbohydrates;
    private double fiber;

    public Lunch(double fat, double carbohydrates, double fiber) {
        this.fat = fat;
        this.carbohydrates = carbohydrates;
        this.fiber = fiber;
    }
   public Lunch(int hamburger){
    //    this.hamburger = price;
   }

    public String toString() {
        String lunchDetails;
        
        lunchDetails = Double.toString(fat) + "g of fat "  + Double.toString(carbohydrates) + "g of carbohydrates " + Double.toString(fiber)+"g of fiber ";
        return lunchDetails;

    


    }
}
