/*
(Financial application: calculate tips) Write a program that reads the subtotal
and the gratuity rate, then computes the gratuity and total. For example, if the
user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
as gratuity and $11.5 as total.
 */


package list_1_variables;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = scanner.nextInt();
        double gratuityRate = scanner.nextInt();
        scanner.nextLine();

        double gratuity = (subtotal * gratuityRate) / 100;
        double total = subtotal + gratuity;

        System.out.println("The gratuity is " + "$" + gratuity + " and total is " + "$" + total);

        scanner.close();

    }
}
