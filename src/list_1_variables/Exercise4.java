/*
(Cost of driving)
Write a program that prompts the user to enter the distance to drive,
the fuel efficiency of the car in miles per gallon,
and the price per gallon, and displays the cost of the trip.
 */

package list_1_variables;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the driving distance: ");
        double drivingDistance = scanner.nextDouble();

        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = scanner.nextDouble();

        System.out.print("Enter price per gallon: ");
        double pricePerGallon = scanner.nextDouble();

        scanner.nextLine();

        double costOfDriving = drivingDistance * (pricePerGallon / milesPerGallon);
        String cost = String.format("%.02f", costOfDriving);
        System.out.println("The cost of driving is $" + cost);

        scanner.close();
    }
}
