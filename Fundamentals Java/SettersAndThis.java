class Frog {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setInfo(String name, int age){
        setName(name);
        setAge(age);
    }
}

public class SettersAndThis {
    public static void main(String[] args) {
        Frog frog1 = new Frog();

        // frog1.name = "bertie";
        // frog1.age = 1;

        frog1.setAge(20);
        frog1.setName("bottom froggers");

        System.out.println(frog1.getName());
        System.out.println(frog1.getAge());
    }
}
