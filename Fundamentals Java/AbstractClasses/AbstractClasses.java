package AbstractClasses;

abstract class Machine {
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void run() {
        start();
    }

    abstract void start();

    abstract void doStuff();

    abstract void shutdown();

}

class Camera extends Machine {

    @Override
    void start() {
        System.out.println("starting camera");
    }

    @Override
    void doStuff() {

    }

    @Override
    void shutdown() {

    }

}

class Car extends Machine {

    @Override
    void start() {
        System.out.println("starting car");
    }

    @Override
    void doStuff() {

    }

    @Override
    void shutdown() {

    }

}

public class AbstractClasses {
    public static void main(String[] args) {
        Camera cam1 = new Camera();
        cam1.setId(4);
        // cannot see machine
        // Machine machine1 = new Machine();

    }
}
