package leetcode.Arrays;

/*
Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static void main(String[] args) {

        int arr[] = {4, 1, 2, 1, 2};
        int result = singleNumber(arr);
        System.out.println(result);

        int result1 = singleNumberLeetcode(arr);
        System.out.println(result1);
    }

    public static int singleNumber(int arr[]) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return 0;
    }


    public static int singleNumberLeetcode(int[] arr) {
        int a = 0;
        for (int i : arr) {
            a = a^i;   // XOR of two same bits is 0; XOR of zero and some bit will return that bit
        }
        return a;
    }


}
