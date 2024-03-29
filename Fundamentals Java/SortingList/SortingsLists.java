package SortingList;

import java.util.*;
import java.util.ArrayList;

class Person {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + ":" + name;
    }
}

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {

        int len1 = s1.length();
        int len2 = s2.length();

        if (len1 > len2) {
            return 1;
        } else if (len1 < len2) {
            return -1;
        }
        return 0;
    }

}

class AlphabeticalComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {

        return -s1.compareTo(s2);
    }
}

public class SortingsLists {
    public static void main(String[] args) {

        System.out.println("\n");
        // Sorting Strings////////
        List<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("elephant");
        animals.add("tiger");
        animals.add("lion");
        animals.add("snake");
        animals.add("mongoose");

        System.out.println("\n");
        // Collections.sort(animals, new StringLengthComparator());
        Collections.sort(animals, new AlphabeticalComparator());

        for (String animal : animals) {
            System.out.println(animal);
        }

        System.out.println("\n");
        // Sorting Numbers////////
        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(3);
        numbers.add(36);
        numbers.add(73);
        numbers.add(40);
        numbers.add(1);

        Collections.sort(numbers, new Comparator<Integer>() {

            @Override
            public int compare(Integer num1, Integer num2) {
                return -num1.compareTo(num2);
            }

        });

        for (Integer number : numbers) {
            System.out.println(number);
        }

        System.out.println("\n");
        // Sorting Arbitrary Objects////////
        List<Person> people = new ArrayList<Person>();
        people.add(new Person(1, "Joe"));
        people.add(new Person(3, "Bob"));
        people.add(new Person(2, "Sue"));
        people.add(new Person(4, "Clare"));

        System.out.println("\n");
        // Sort in order of ID
        Collections.sort(people, new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                if (p1.getId() > p2.getId()) {
                    return 1;
                } else if (p1.getId() < p2.getId()) {
                    return -1;
                }
                return 0;
            }
        });
        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println("\n");
        // Sort in order of ID
        Collections.sort(people, new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
