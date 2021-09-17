package list_2_conditionals_and_loops;


/*
calculateRide: Think of the Voi scooters available around you,
which provide fun rides at reasonable prices.
You have to calculate the fare of one ride given 3 parameters:
Distance travelled in kilometers, charging done or not, and membership type.
For distance, the calculation goes like this:

Distance
<5 Km – 20 Sek per Km
5 Km -15 Km – 15 Sek per Km
>15 Km – 8 Sek per Km
Charging done
False → No discount
True → Fare = Fare – 25% Fare


Membership
None – Fare
Silver – 90% Fare
Gold –  80% Fare
Platinum – 65 % Fare
 */

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Distance(km): ");
        double tripDistance = input.nextDouble();
        input.nextLine();

        double tripCost;

        if(tripDistance < 5){
            tripCost = 20 * tripDistance;
        } else if(tripDistance < 15){
            tripCost = 15 * tripDistance;
        } else {
            tripCost = 8 * tripDistance;
        }

        System.out.print("Is the charge done?[true/false] ");

        System.out.println("-------Membership------");
        System.out.println("None[0] Silver[1] Gold[2] Platinum[3]");
        System.out.print("Select you plan: ");
        int membership = input.nextInt();
        input.nextLine();

        if(membership == 1){
            tripCost = tripCost * 0.9;
        } else if(membership==2){
            tripCost = tripCost * 0.8;
        } else if(membership == 3){
            tripCost = tripCost * 0.65;
        }

        boolean isCharged = input.nextBoolean();
        input.nextLine();

        if(isCharged){
            tripCost = tripCost * 0.75;
        }

        System.out.println("The final price of your trip is " + tripCost + " SEK.");

        input.close();
    }
}
