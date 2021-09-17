package list_3_basics_in_programming;
/*
Write a subroutine,
which takes  a string as argument  and returns the sum of
the digits 0-9 that appear in the string, ignoring all other characters.
The subroutine returns 0 if there are no digits in the string.
Note that Character.isDigit(c) tests if a character c is one of the characters '0', '1', .. '9'
and Integer.parseInt(string)  converts a string to an integer. Remember to check the corner cases!
The subroutine should always return a value and not crash.
 */

public class Exercise1 {

    public static int sumDigits(String message){
        int totalSum = 0;
        for(int i = 0; i < message.length(); i++){
            if (Character.isDigit(message.charAt(i))){
                totalSum = totalSum + Character.getNumericValue(message.charAt(i));
            }
        }

        return totalSum;
    }

    public static void main(String[] args){
        System.out.println(sumDigits("aa1bc2d3"));
        System.out.println(sumDigits("aa11b33"));
        System.out.println(sumDigits("Chocolate"));
    }

}
