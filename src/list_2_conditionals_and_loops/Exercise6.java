package list_2_conditionals_and_loops;

/*
Write an interactive quiz.
It should ask the user three multiple-choice or true/false questions about something.
It must keep track of how many they get right, and print out a "score" at the end.
 */

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int score = 0;

        System.out.println("Q1) What is the capital of Brazil?\n" +
                "1) Brasilia\n" +
                "2) Sao Paulo\n" +
                "3) Rio de Janeiro\n");
        System.out.print("Answer: ");
        int answer1 = input.nextInt();
        input.nextLine();

        if(answer1 == 1){
            score = score + 1;
            System.out.println("That is correct!");
        } else {
            System.out.println("The correct answer is Brasilia.");
        }

        System.out.println("Q2) Is it possible to store the word 'cat' in a double variable?\n" +
                "1) Yes\n" +
                "2) No\n");
        System.out.print("Answer: ");
        int answer2 = input.nextInt();
        input.nextLine();

        if(answer2 == 2){
            score = score + 1;
            System.out.println("That is correct!");
        } else {
            System.out.println("'cat' is a word, therefore it must be stored as a String.");
        }

        System.out.println("What is the result of 10 + 5 * 4 / 2?\n" +
                "1) 30\n" +
                "2) 20\n" +
                "3) 40\n");

        System.out.print("Answer: ");
        int answer3 = input.nextInt();
        input.nextLine();

        if(answer3 == 2){
            score = score + 1;
            System.out.println("That is correct!");
        } else {
            System.out.println("The correct answer is 20.");
        }

        System.out.println("Your final score is " + score);

        input.close();

    }
}
