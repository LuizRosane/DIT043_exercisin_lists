package list_2_conditionals_and_loops;

/*
isDivisible: Write a program that checks if a number n is divisible by two numbers x AND y. (IsDivisible(n, x, y)).
You can assume that all inputs are positive, non-zero digits.
 */

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Type the numerator: ");
        int numerator = input.nextInt();
        input.nextLine();


        System.out.print("Type the 1st denominator to be checked: ");
        int denominator1 = input.nextInt();
        input.nextLine();


        System.out.print("Type the 2nd denominator to be checked: ");
        int denominator2 = input.nextInt();
        input.nextLine();

        if(numerator % denominator1 == 0){
            System.out.println(numerator + " is divisible by " + denominator1);
        } else {
            System.out.println(numerator + " is not divisible by " + denominator1);
        }

        if(numerator % denominator2 == 0){
            System.out.println(numerator + " is divisible by " + denominator2);
        } else {
            System.out.println(numerator + " is not divisible by " + denominator2);
        }

        input.close();

    }
}
