package leetcode.Arrays;

import java.util.Arrays;

public class MovingZeroes {

    public static void main(String[] args) {

        int arr[] = {0, 1, 0, 3, 12};
        moveZeroesAtEnd(arr);
    }

    public static void moveZeroesAtEnd(int arr[]) {
        short counter = 0; //count 0 instances
        short index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                counter++;
            } else {
                arr[index++] = arr[i];
            }
        }

        for (int i = 0; i < counter; i++) {
            arr[index++] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
