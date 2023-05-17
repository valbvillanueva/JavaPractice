package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCompare {

    /*
     * ArrayLists manage arrays internally
     * [0][1][2][3][4][5] ...
     * 
     * 
     * LinkedLists consist of elements where each element
     * has a reference to the previous and next element
     * 
     * [0] -> [2] ...
     *       <- <-
     */
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        LinkedList<Integer> linkedlist = new LinkedList<Integer>();

        doTimings("ArrayList", arraylist);
        doTimings("LinkedList", linkedlist);

    }

    private static void doTimings(String type, List<Integer> list) {
        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();

        // //add items at the end of the list
        // for (int i = 0; i < 1E5; i++) {
        // list.add(i);
        // }

        // add items elsewhere in list
        for (int i = 0; i < 1E5; i++) {
            list.add(0, i);
        }
        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start) + "ms for " + type);
    }
}
