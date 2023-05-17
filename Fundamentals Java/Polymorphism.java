class Halaman{
    public void grow(){
        System.out.println("Plant Growing");
    }
}
class Puno extends Halaman{
   @Override
    public void grow(){
        System.out.println("Tree Growing");
    }
    public void shedLeaves(){
        System.out.println("shed leaves");
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        Halaman halaman1 = new Halaman();
        Puno puno = new Puno();
        // Halaman halaman2 = halaman1;
        Halaman halaman2 = puno; // halaman "puno is a  plant"

        halaman2.grow();
        // halaman2.shedLeaves();
        // Halaman halaman3;
        puno.shedLeaves();
    
        // halaman3.grow();
        doGrow(halaman1);
    }
    public static void doGrow(Halaman halaman){
        halaman.grow();
    }
}
