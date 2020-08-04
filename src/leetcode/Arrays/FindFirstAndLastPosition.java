package leetcode.Arrays;

/*
Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
Your algorithm's runtime complexity must be in the order of O(log n).
If the target is not found in the array, return [-1, -1].
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindFirstAndLastPosition {

    public static void main(String[] args) {
        int arr[] = {3, 3, 3};
        int target = 3;
        int[] result = searchRange1(arr, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] searchRange(int[] arr, int target) {
        // use binary search coz array is sorted
        List<Integer> list = new ArrayList<>();
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;

        while (low <= high) {
            mid = (high + low) / 2;
            if (arr[mid] == target) {
                list.add(mid);
                break;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (!list.isEmpty()) {
            if (mid < arr.length - 1 && arr[mid + 1] == arr[mid]) {
                list.add(mid + 1);
            } else if (mid != 0 && (arr[mid - 1] == arr[mid])) {
                list.add(mid - 1);
            }
            // sort the list; and convert to array
            Collections.sort(list);
            int[] result = new int[list.size()];
            if (list.size() == 1) {
                return new int[]{mid, mid};
            } else {
            }
            for (int i = 0; i < result.length; i++) {
                result[i] = list.get(i);
            }
            return result;
        }
        System.out.println(list);
        return new int[]{-1, -1};
    }


    public static int[] searchRange1(int[] arr, int target) {
        // use list
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        int index1 = list.indexOf(target);
        int index2 = list.lastIndexOf(target);

        return new int[]{index1, index2};
    }

}
