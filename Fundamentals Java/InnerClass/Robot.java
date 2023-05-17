package InnerClass;

public class Robot {
    private int id;

    public Robot(int id) {
        this.id = id;
    }

    private class Brain {
        public void think() {
            System.out.println("Robot " + id + " is thinking.");
        }

    }

    static class Battery {
        public void charge() {
            System.out.println("battery charging");
        }

    }

    public void start() {
        System.out.println("starting robot " + id);
        Brain brain = new Brain();
        brain.think();

        final String name = "Robert";

        class Temp{
            public void doSomething(){
                System.out.println("id  is " + id);
                System.out.println("name is " + name);
            }
        }
        Temp temp = new Temp();
        temp.doSomething();
    }

}
