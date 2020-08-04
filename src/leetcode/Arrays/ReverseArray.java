package leetcode.Arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};

        reverseArray(a);
        reverseArray1(a);
    }

    // Need to create separate array
    public static void reverseArray(int[] arr) {
        int[] reverse = new int[arr.length];
        int counter = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            reverse[counter++] = arr[i];
        }
        System.out.println("Reverse array => " + Arrays.toString(reverse));
    }

    // In place reversing array [no need for separate array]
    public static void reverseArray1(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i -1] = temp;
        }
        System.out.println("Reverse array => " + Arrays.toString(arr));

    }

}
