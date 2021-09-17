package list_3_basics_in_programming;

/*
Write a subroutine takes as argument an array of integers
and returns an array that is left
shifted by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
You may modify and return the given array, or return a new array.
Remember to check the corner cases!
The subroutine should always return a value and not crash.
 */

public class Exercise2 {

    public static int[] shiftLeft(int[] inputArray){
        int[] outputArray = new int[inputArray.length];

        outputArray[0] = inputArray[inputArray.length - 1];
        for(int i = 1; i < inputArray.length; i++){
                outputArray[i] = inputArray[(i-1)];
        }

        return outputArray;

    }

    public static void main(String[] args){
        int[] testArray = new int[]{6, 2, 5, 3};
        for(int i = 0; i < testArray.length; i++){
            System.out.print(testArray[i] + " ");
        }
    }

}
