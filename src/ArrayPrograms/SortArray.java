package ArrayPrograms;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {

        int[] a = {1, 2, 11, 7, 9, 100, 75};
        sortArraysMethod1(a);
    }

    // Time complexity --> 0(n2)
    public static void sortArraysMethod1(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Array sorted in ascending order => " + Arrays.toString(arr));

    }


    // Time complexity --> 0(n)
    public static void sortArrayMethod2(int[] arr) {

    }

}
