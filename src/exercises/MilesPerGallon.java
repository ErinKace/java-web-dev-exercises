package exercises;

import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles traveled: ");
        double miles = input.nextDouble();
        System.out.println("Enter gallons used: ");
        double gallons = input.nextDouble();
        input.close();

        double mpg = miles/gallons;
        System.out.println("You were getting "+mpg+" miles per gallon.");

    }
}
