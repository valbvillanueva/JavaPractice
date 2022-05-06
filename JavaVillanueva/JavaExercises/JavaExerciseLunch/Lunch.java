package JavaExercises.JavaExerciseLunch;

public class Lunch {
    private String hamburger;
    private String salad;
    private String frenchFries;
    private String soda;
    private int price;
    private double fat;
    private double carbohydrates;
    private double fiber;

    public Lunch(int fat, int carbohydrates, int fiber) {
        this.fat = fat;
        this.carbohydrates = carbohydrates;
        this.fiber = fiber;
    }

    public String toString() {
        String lunchDetails;
        
        lunchDetails = Integer.toString(fat) + ".0g of fat "  + Integer.toString(carbohydrates) + " " + Integer.toString(fiber)+"";
        return lunchDetails;


    }
}
