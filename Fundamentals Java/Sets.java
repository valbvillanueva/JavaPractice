import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {

        // HashSet does not retain order.
        Set<String> set1 = new HashSet<String>();

        // LinkedHashSet remembers the order you added items in
        // Set<String> set1 = new LinkedHashSet<String>();

        // TreeSet sorts in natural order
        // Set<String> set1 = new TreeSet<String>();

        // if (set1.isEmpty()) {
        // System.out.println("Set is empty at start");
        // }

        set1.add("dog");
        set1.add("cat");
        set1.add("mouse");
        set1.add("snake");
        set1.add("bear");

        // System.out.println(set1);

        // Adding duplicate items does nothing.

        set1.add("mouse");

        // System.out.println(set1);

        //// Iteration ///

        // for (String element : set1) {
        // System.out.println(element);
        // }

        // if (set1.contains("aadvark")) {
        // System.out.println("contains aadvark");
        // }
        // if (set1.contains("cat")) {
        // System.out.println("contains cats");
        // }

        // if (set1.isEmpty()) {
        // System.out.println("Set is empty(no!)");
        // }

        // Intersection

        Set<String> set2 = new TreeSet<String>();

        // if (set2.isEmpty()) {
        // System.out.println("Set is empty at start");
        // }

        set2.add("dog");
        set2.add("cat");
        set2.add("giraffe");
        set2.add("monkey");
        set2.add("ant");

        Set<String> intersection = new HashSet<String>(set1);

        System.out.println(intersection);
        intersection.retainAll(set2);
        System.out.println(intersection);

        // Difference ////////////
        Set<String> difference = new HashSet<String>(set1);
        difference.removeAll(set2);
        System.out.println(difference);

    }
}
