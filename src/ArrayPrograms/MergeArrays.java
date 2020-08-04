package ArrayPrograms;

import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6, 7, 8};
        mergeArrays(a, b);

    }

    public static void mergeArrays(int[] arr1, int[] arr2) {

        int[] mergeArr = new int[arr1.length + arr2.length];

        int counter = 0;

        for (int i = 0; i < arr1.length; i++) {
            mergeArr[counter] = arr1[i];
            counter++;
        }

        for (int i = 0; i < arr2.length; i++) {
            mergeArr[counter] = arr2[i];
            counter++;
        }

        System.out.println("Merge array =>" + Arrays.toString(mergeArr));

    }


}
