/*
(Process a string) Write a program that prompts the user to enter
 a string and displays its length and its first character.
 */

package list_1_variables;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a String: ");
        String string = scanner.nextLine();

        System.out.println("The string length is " + string.length() +
                " and the first character is " + string.charAt(0));

    }
}
