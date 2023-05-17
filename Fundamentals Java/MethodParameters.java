
class Robot {
    String name;
    int age;

    void speak(String text) {
        System.out.println(text);
    }
    public void jump (int height){
        System.out.println("jumping "  +  height);
    }

    public void move(String direction, double distance){
        System.out.println("Moving " + distance + " meteres in direction "  + direction);
    }

}

public class MethodParameters {
    public static void main(String[] args) {
        Robot sam = new Robot();
        
        sam.speak("hello im sam");
        sam.jump(7);
        sam.move("West" ,50);

        String greeting = "hello there";

        sam.speak(greeting);
        
    }

}
