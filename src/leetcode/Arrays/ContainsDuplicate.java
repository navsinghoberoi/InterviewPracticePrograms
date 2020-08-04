package leetcode.Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1};
        boolean result = containsDuplicateViaMap(arr);
        System.out.println(result);
    }

    public static boolean containsDuplicate(int arr[]) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!set.add(arr[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicateViaMap(int arr[]) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) > 1) {
                return true;
            }
        }
        return false;
    }


}
