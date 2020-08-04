package leetcode.Arrays;

/*
Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 */

import java.util.*;

public class DuplicateNumbers {


    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5, 5, 5};

        int length = removeDuplicatesLeetcode(arr);
        System.out.println(length);
        getDuplicatesViaHashSet(arr);
        getDuplicatesViaHashMap(arr);
        removeDuplicateNumbersViaHashset(arr);
        removeDuplicateNumbersInPlace(arr);
    }


    // leetcode question (without using separate array)
    public static int removeDuplicatesLeetcode(int[] arr){
        // Array sorted
        if (arr.length<=1){
            return 1;
        }

        int counter =0;
        for (int i=0;i<arr.length-1;i++){
            if (arr[i]!=arr[i+1]){
                arr[counter++] = arr[i];
            }
        }
        arr[counter++] = arr[arr.length-1];
        return counter;
    }


    // Best way coz work done in place; no new array is created
    public static void removeDuplicateNumbersInPlace(int[] arr) {
        // Precondition is that array should be sorted
        int counter = 0;

        for (int i = 0; i < arr.length - 1; i++) {         // Run till i<length-1 coz in if condition we are comparing (i) with (i+1)
            if (arr[i] != arr[i + 1]) {
                arr[counter++] = arr[i];
            }
        }
        arr[counter++] = arr[arr.length - 1];     // Add last element of array separately
        System.out.println("Array after removing duplicates in place => ");
        for (int i = 0; i < counter; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void getDuplicatesViaHashSet(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!set.add(arr[i])) {
                System.out.print("Duplicate value =>" + arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void getDuplicatesViaHashMap(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.print("Duplicate value from key =>" + key + " ");
            }
        }
        System.out.println();
    }


    public static void removeDuplicateNumbersViaHashset(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int number : arr) {
            set.add(number);
        }
        System.out.println("Array after removing duplicates via hashset =>" + set);
    }

}
