class Human {

    String name;
    int age;

    void speak() {
        System.out.println("hello po");
    }
}

public class MethodsInJava {
    public static void main(String[] args) {

        Human h1 = new Human();

        h1.name = "john";
        h1.age = 37;
        h1.speak();

        Human h2 = new Human();

        h2.name = "lloyd";
        h2.age = 45;

        System.out.println(h2.name);
        System.out.println(h2.name);

    }
}
