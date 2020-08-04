package leetcode.Arrays;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {

        int arr[] = {3,0,1};
        int num = missingNumber(arr);
        System.out.println(num);
    }

    public static int missingNumber(int[] arr) {
        int actualSum = 0;
        int expectedSum = ((arr.length) * ((arr.length)+1)) / 2;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }
        System.out.println(actualSum);
        System.out.println(expectedSum);
        return expectedSum - actualSum;
    }
}
