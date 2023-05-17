package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
   public static void main(String[] args) {
    
    // HashSet does not retain order.
    // Set<String> set1 = new HashSet<String>();

    // LinkedHashSet remembers the order you added the items in
    // Set<String> set1 = new LinkedHashSet<String>();

    //TreeSet sorts in natural order
    Set<String> set1 = new TreeSet<String>();

    set1.add("dog");
    set1.add("cat");
    set1.add("mouse");
    set1.add("snake");
    set1.add("bear");
    
    //Adding duplicate items does nothing.

    set1.add("mouse");

    System.out.println(set1);
   } 
}
