package list_3_basics_in_programming;

/*
Write a subroutine taking an array of integers as argument,
returning true if that array contains three consecutive
adjacent numbers, such as  4,  5,  6,  or  23, 24, 25.
Remember to check the corner cases!
The subroutine should always return a value, and not crash.
 */

public class Exercise4 {

    public static boolean threeConsecutive(int[] inputArray){

        boolean answer = false;

        if (inputArray.length > 2) {
            for (int i = 1; i < (inputArray.length - 1); i++){
                int first = inputArray[i-1];
                int second = inputArray[i];
                int third = inputArray[i+1];

                if(first == (second - 1) && second == (third - 1)){
                    answer = true;
                    break;
                }

            }

        } else {
            answer = false;
        }

        return answer;

    }

    public static void main(String[] args){
        int[] array1 = new int[] {1, 4, 5, 6, 2};
        int[] array2 = new int[] {1, 2, 3};
        int[] array3 = new int[] {1, 2};
        int[] array4 = new int[] {1, 2, 4, 5};



        System.out.println(threeConsecutive(array1));
        System.out.println(threeConsecutive(array2));
        System.out.println(threeConsecutive(array3));
        System.out.println(threeConsecutive(array4));
    }

}
