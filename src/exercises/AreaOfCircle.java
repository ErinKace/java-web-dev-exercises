package exercises;

import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rectangle's length: ");
        double length = input.nextDouble();
        System.out.println("Enter the rectangle's width: ");
        double width = input.nextDouble();
        input.close();

        double area = length*width;
        System.out.println("The area of the rectangle is " + area);
    }
}
