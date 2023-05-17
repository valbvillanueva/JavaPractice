package Interfaces;

class Tao implements Info {
    private String name;

    public void greet() {
        System.out.println("Hello there");
    }

    public Tao(String name) {

        this.name = name;
    }

    @Override
    public void showInfo() {
        // TODO Auto-generated method stub
        System.out.println("Person name is: " + name);
    }
}

class Makina implements Info {

    private int id = 7;

    public void start() {
        System.out.println("Machine started");
    }

    @Override
    public void showInfo() {
        System.out.println("Machine id is " + id);
    }

}

public class Interfaces {
    public static void main(String[] args) {
        Makina m1 = new Makina();
        m1.start();
        // m1.showInfo();

        Tao t1 = new Tao("Bob");
        t1.greet();
        // t1.showInfo();
        Info info1 = new Makina();
        info1.showInfo();

        Info info2 = t1;
        info2.showInfo();

        System.out.println("");
        outputInfo(m1);
        outputInfo(t1);
    }

    private static void outputInfo(Info info){
        info.showInfo();
    }
}