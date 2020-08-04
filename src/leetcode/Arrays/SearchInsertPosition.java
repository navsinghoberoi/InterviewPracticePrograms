package leetcode.Arrays;

/*
Given a sorted array and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SearchInsertPosition {

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 6};
        int searchNum = 2;
        int index = searchInsert(arr, searchNum);
        System.out.println(index);
    }

    public static int searchInsert(int arr[], int searchNo) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] == searchNo) {
                return mid;
            } else if (arr[mid] > searchNo) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        // number not found
       /* List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        list.add(searchNo);
        Collections.sort(list);
        return list.indexOf(searchNo);*/

        // find index of number not found
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > searchNo) {
                return i;
            }
        }
        return arr.length;
    }

}
