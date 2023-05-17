package AnonymousClasses;

class Machine {
    public void start() {
        System.out.println("Machine started");
    }

}

interface Plant {
    public void grow();
}

public class AnonymousClasses {
    public static void main(String[] args) {
        Machine m1 = new Machine() {
            @Override
            public void start() {
                System.out.println("camera snapping");
            }
        };
        m1.start();
        Plant plant1 = new Plant(){

            @Override
            public void grow() {
                System.out.println("plant growing");
            }
            
        };
        plant1.grow();
    }

}
