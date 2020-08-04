package leetcode.Arrays;

import java.util.Arrays;

/*
Given a non-empty array of digits representing a non-negative integer, increment one to the integer.
The digits are stored such that the most significant digit is at the head of the list, and each element
in the array contains a single digit. Need to handle 9 specially coz it will be replaced with 1,0
 */

// NOT SOLVED YET
public class PlusOne {

    public static void main(String[] args) {

        int arr[] = {1, 2, 8};
      /*  int result[] = addOneToLastElement(arr);
        System.out.println(Arrays.toString(result));*/
    }

    public static int[] addOneToLastElement(int[] arr) {
        int result[];

        // result array length inc by 1 if one of digits is 9
        if (arr[arr.length - 1] == 9) {
            result = new int[arr.length + 1];
        } else {
            result = new int[arr.length];
        }

        int counter = 0;
        if (arr.length == 0) {
            return new int[]{0};
        }

        // loop in reverse order
        for (int i = arr.length - 1; i >= 0; i--) {
            result[counter++] = arr[i];
        }

        if (arr.length - 1 == 9) {
            result[counter++] = 0;
            result[counter++] = arr[arr.length - 1] + 1;
        }else {
            result[counter++] = arr[arr.length-1]+1;
        }

        return result;
    }

}
