/*
(Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in

a double value from the console, then converts it to Fahrenheit and displays the
result. The formula for the conversion is as follows:
fahrenheit = (9 / 5) * celsius + 32
 */

package list_1_variables;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        double tempCelsius = scanner.nextDouble();
        scanner.nextLine();

        double tempFahrenheit = (tempCelsius * (9.0/5)) + 32;

        System.out.println(tempCelsius + " Celsius is " + tempFahrenheit + " Fahrenheit");

        scanner.close();

    }
}
