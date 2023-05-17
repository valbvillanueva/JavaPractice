class Oak extends Plant {
    public Oak() {

        // wont work -- type is private
        // type = "tree";
        
        this.size = "large";// size is protected can be accessed within the class and package.
    }
}

class Plant {
    public String name;
    private String type;

    public Plant() {
        this.name = "freddy";
        this.type = "plant";

        // can be accessed within the class
        this.size = "large";
    }

    protected String size;
}

public class PublicPrivateProtected {
    public static void main(String[] args) {
        Plant p = new Plant();
        System.out.println(p.name);
    }
}
