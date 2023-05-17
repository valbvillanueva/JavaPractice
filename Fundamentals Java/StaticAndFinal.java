class Thing {
    public final static int LUCKY_NUMBER = 20;
    public String name; // instance variables
    public static String description; // static variables || class variables

    public void showName() { // instance methods - can access statiC DATA
        System.out.println("Object id:" +  id  + ","+description + " : " + name);
    }

    public static int count = 0;
    public int id;
    public Thing() {
        id = count;
        count++;
    }

    public static void showInfo() { // static methods cannot make a static reference to instance variables
        System.out.println(description);
        // System.out.println(name); - not allowed
    }
}

public class StaticAndFinal {
    public static void main(String[] args) {

        Thing.description = "I am a thing";
        Thing.showInfo();

        System.out.println("before creating object: " + Thing.count);
       
    
        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        System.out.println("after creating object: " + Thing.count);
       

        thing1.name = "bob";
        thing2.name = "sue";

        thing1.showName();
        thing2.showName();

        System.out.println(Math.PI);
        System.out.println(Thing.LUCKY_NUMBER);
    }
}
