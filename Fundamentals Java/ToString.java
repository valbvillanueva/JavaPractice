class Froggy {
    private int id;
    private String name;


    public Froggy(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    public String toString() {
        // StringBuilder sb = new StringBuilder();
        // sb.append(id).append(" : ").append(name);
        // return sb.toString();

        return String.format("%d:%s", id,name);
    }
}

public class ToString {
    public static void main(String[] args) {

        Froggy frog1 = new Froggy(7,"Freddy");
        Froggy frog2 = new Froggy(5,"Roger");

        System.out.println(frog1);
        System.out.println(frog2);
    }
}
