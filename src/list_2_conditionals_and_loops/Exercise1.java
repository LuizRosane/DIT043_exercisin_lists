/*
makeNegative: In this simple assignment you are writing a program to read a number
and you have to make it negative. Note that the input can also be negative.
 */

package list_2_conditionals_and_loops;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Type the number that will become negative: ");
        double numberToBeNegative = input.nextDouble();
        input.nextLine();

        double negativeNumber = numberToBeNegative * (-1);

        System.out.println("Making " + numberToBeNegative  +" negative, we obtain " + negativeNumber);

        input.close();
    }
}
