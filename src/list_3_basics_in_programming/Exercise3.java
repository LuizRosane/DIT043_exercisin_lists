package list_3_basics_in_programming;

/*
Write a subroutine takes as argument
start and  end integers, and returns a new array containing the sequence
of integers from  start up to but not including end.
For instance,  start=5 and  end=10 yields the array {5, 6, 7, 8, 9}.
You can assume the  end number is greater or equal to the  start number.
Note that an array of length 0 is also a valid array.
 */

public class Exercise3 {

    public static int[] fizzArray(int startInt, int endInt){
        int difference = (endInt - startInt);
        int[] outputArray = new int[difference];
        for(int i = 0; i < (difference); i++){
            outputArray[i] = i + difference;
        }

        return outputArray;
    }

    public static void main(String[] args){

        int[] outputArray = fizzArray(5, 10);

        for(int i = 0; i < outputArray.length; i++){
            System.out.print(outputArray[i] + " ");
        }

        int[] outputArray2 = fizzArray(1, 1);

        for(int i = 0; i < outputArray2.length; i++){
            System.out.print(outputArray[i] + " ");
        }

    }

}
