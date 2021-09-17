/*
(Sum the digits in an integer) Write a program that reads an integer between 0 and
1000 and adds all the digits in an integer.
For example, if an integer is 932 , the sum of all its digits is 14 .

Hint: Use the % operator to extract digits, and use the / operator to remove the
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93 .
 */

package list_1_variables;


import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        int sum = 0;
        int additionNumber = 0;
        do{
            additionNumber = number%10;
            sum += additionNumber;
            number = number/10;
        } while (number > 0);

        System.out.println("The sum of the digits is " + sum);

    }
}
