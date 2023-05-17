class Unit {
    public void start() {
        System.out.println("Started");
    }
}

class Camera extends Unit {
    public void start() {
        System.out.println("Camera started");
    }
    public void snap(){
        System.out.println("photo taken");
    }
}

public class UpcastingAndDowncasting {
    public static void main(String[] args) {

        Unit u = new Unit();
        Camera c = new Camera();

        u.start();
        c.snap();
        c.start();

        //upcasting
        Unit u2 = c;
        u2.start();
        //error: machine2.snap();

        //down casting
        Unit u3 = new Camera();
        Camera c2 = (Camera) u3;
        c2.start();
        c2.snap(); 

        
    }
}
