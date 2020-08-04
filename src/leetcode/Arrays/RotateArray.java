package leetcode.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RotateArray {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6}; // with k=2, output should be {4,5,1,2,3}
        rotateInPlace(arr, 11);

    }

    // by creating new array
    public static void rotate(int arr[], int k) {
        int counter = 0;
        int[] result = new int[arr.length];

        // for feeding k values in new array
        for (int i = 0; i < k; i++) {
            result[counter++] = arr[arr.length - k + i];
        }

        for (int i = 0; i < arr.length - k; i++) {
            result[counter++] = arr[i];
        }
        System.out.println(Arrays.toString(result));
    }


    // without creating separate array  [better way]
    public static void rotateInPlace(int arr[], int k) {
        int counter = 0;

        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(i, arr[i]);
        }

        // base conditions
        if (arr.length < 1) {
            return;
        } else if (arr.length == 1) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        // set values in array
        if (k > arr.length) {
            // modify k value as k = k - arr.length
            rotateHelper(arr, counter, (LinkedHashMap<Integer, Integer>) map, k - arr.length);
            System.out.println(Arrays.toString(arr));

        } else {
            rotateHelper(arr, counter, (LinkedHashMap<Integer, Integer>) map, k);
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void rotateHelper(int arr[], int counter, LinkedHashMap<Integer, Integer> map, int k) {
        for (int i = 0; i < k; i++) {
            arr[counter++] = map.get(arr.length - k + i);
        }
        for (int i = 0; i < arr.length - k; i++) {
            arr[counter++] = map.get(i);
        }
    }
}
