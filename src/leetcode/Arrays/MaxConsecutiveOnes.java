package leetcode.Arrays;

/*
Given a binary array, find the maximum number of consecutive 1s in this array.
 */

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 1, 0, 1};
        int count = findMaxConsecutiveOnes(arr);
        System.out.println(count);
    }

    public static int findMaxConsecutiveOnes(int arr[]) {
        int counter = 0;
        int maxCount = 0;
        Set<Integer> set = new HashSet<>();
        set.add(1);                // adding 1 in order to get count till the time add() returns false
        for (int i = 0; i < arr.length; i++) {
            int currentNumber = arr[i];
            if (currentNumber == 1 && !set.add(currentNumber)) {
                counter++;
                if (counter >= maxCount) {
                    maxCount = counter;
                }
            } else {
                counter = 0;
                continue;
            }
        }
        return maxCount;
    }
}
