package list_2_conditionals_and_loops;

/*
thirdLength: Your program will read two angles (in degrees) of a triangle.
It will calculate the 3rd. Note: Sum of angles of a triangle = 180.
 */

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double informedAnglesSum = 0;
        for(int i = 0; i < 2; i++){
            System.out.print("Type angle number " + (i+1) + " : ");
            informedAnglesSum = informedAnglesSum + input.nextDouble();
            input.nextLine();
        }

        double lastAngle = 180.0 - informedAnglesSum;

        System.out.println("The last angle measures :" + lastAngle + " degrees.");

        input.close();

    }
}
