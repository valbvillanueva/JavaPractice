package JavaActivitiesRobertson;

import java.util.Scanner;

public class CircleParameters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a radius value:");
        double radius = sc.nextDouble();

        double diameter = 2 * radius; // Math.pi works like pi
        double circumference = 2 * Math.PI * radius;
        double area = (Math.PI) * (radius * radius);

        System.out.println("Diameter = " + diameter);
        System.out.println("Circumference = " + circumference);
        System.out.println("Area = " + area);
        sc.close();

    }
}
