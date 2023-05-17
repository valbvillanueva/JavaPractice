package EnumTypes;

public class App {

    public static void main(String[] args) {

        Animal animal = Animal.DOG;

        switch (animal) {
            case CAT:
                break;
            case DOG:
            System.out.println("not a dog");
                break;
            case MOUSE:
                break;
            default:
                break;
            

        }

        System.out.println(Animal.DOG);
        System.out.println(Animal.DOG.getClass());
        System.out.println(Animal.DOG instanceof Enum);
        System.out.println(Animal.MOUSE.getName());
    
        System.out.println(Animal.DOG);

        Animal animal2 = Animal.valueOf("CAT");

        System.out.println(animal2);

    }
}
