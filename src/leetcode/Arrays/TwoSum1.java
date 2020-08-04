package leetcode.Arrays;
/*
Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TwoSum1 {
    public static void main(String[] args) {
        int arr[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 3, 4, 4, 9, 56};
        int target = 0;
        int result[] = findIndexOfNumber(arr, target);
        System.out.println(Arrays.toString(result));
    }


    public static int[] findIndexOfNumber(int nums[], int target) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        if (nums.length <= 1) {
            return new int[]{0, 0};
        }

        for (int i = 0; i < nums.length; i++) {
            int num1 = nums[i];
            int num2 = target - num1;
            if (num1 == 0) {
                if (target == 0 && num2 == 0) {
                    return new int[]{i + 1, i + 2};
                } else {
                    continue;
                }
            } else if (num1 == target && num2 == 0) {
                return new int[]{i + 1, i + 2};
            } else {
                if (list.indexOf(num2) > -1) {
                    int j = list.lastIndexOf(num2);
                    return new int[]{i + 1, j + 1};
                }
            }

        }

        return new int[]{0, 0};
    }

    public int[] twoSum(int[] nums, int target) {
        if (nums.length <= 1) {
            return new int[]{0, 0};
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return new int[]{0, 0};
    }
}
