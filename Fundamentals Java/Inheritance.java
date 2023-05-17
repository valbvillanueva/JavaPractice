
class Car extends MainMachine{
    @Override
    public void start(){
        System.out.println("Car Started");
    }
    public void wipeWindShield(){
        System.out.println("Wiping windshield");
    }

}

class MainMachine {
    protected String name = "Machine type 1";
    public void start() {
        System.out.println("Machine Started");
    }

    public void stop() {
        System.out.println("Machine Stopped");
    }
    public void showInfo(){
        System.out.println("the machine type is of car is: " + name);
    }
    
}

public class Inheritance {
    public static void main(String[] args) {
        MainMachine mach1 = new MainMachine();
        mach1.start();
        mach1.stop();

        Car car1 = new Car();
        car1.start();
        
        car1.wipeWindShield();
        car1.stop();
        car1.showInfo();
    }
}
