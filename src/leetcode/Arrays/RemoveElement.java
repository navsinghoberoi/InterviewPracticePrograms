package leetcode.Arrays;

/*
Given an array nums and a value val, remove all instances of that value in-place and return the new length.
Do it without creating new array
 */
public class RemoveElement {

    public static void main(String[] args) {
        int arr[] = {3, 2, 2, 3};
        int val = 3;
        int length = removeElement(arr, val);
        System.out.println(length);
    }

    public static int removeElement(int[] arr, int val) {
        if (arr.length < 1) {
            return 1;
        }
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[counter++] = arr[i];
            } else {
                continue;
            }
        }
        return counter;
    }
}
