package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;
public class Area {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14;
//        while(!input.hasNextDouble()) {
//            System.out.println("Enter the radius of the circle: ");
//        }
        System.out.println("Enter the radius of the circle: ");

        if (!input.hasNextDouble() || (input.nextDouble() < 0)) {
            System.out.println("Please enter a positive number: ");
        }
        double radius = input.nextDouble();

        input.close();

        double area = Circle.getArea(radius);
        System.out.println("The area of a circle with radius "+radius+" is "+area);
    }
}
