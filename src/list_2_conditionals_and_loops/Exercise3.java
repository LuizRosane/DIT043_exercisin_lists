package list_2_conditionals_and_loops;

/*
SetAlarm: Write a program named SetAlarm which reads two inputs The first input, employed,
is true whenever you are employed and false otherwise.
The second input, vacation is true whenever you are on vacation, and false otherwise.
The program should print true if you are employed
and not on vacation (because these are the circumstances under which you need to set an alarm).
It should return false otherwise.
 */

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        boolean setAlarm = false;

        System.out.print("Is the person employed? ");
        boolean isEmployed = input.nextBoolean();
        input.nextLine();

        if(isEmployed){
            System.out.print("Is the employer on vacation? ");
            boolean employerOnVacation = input.nextBoolean();
            input.nextLine();

            setAlarm = isEmployed && !(employerOnVacation);
        }



        System.out.println("Set alarm: " + setAlarm);

        input.close();

    }
}
