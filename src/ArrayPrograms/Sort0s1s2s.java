package ArrayPrograms;

import java.util.Arrays;

public class Sort0s1s2s {

    public static void main(String[] args) {

        int[] arr = {1, 2, 0, 0, 2, 1, 1, 1, 2, 0};
        sort0s1s2sInArrayMethod1(arr);
        sort0s1s2sInArrayMethod2(arr);
    }

    // not a good way
    public static void sort0s1s2sInArrayMethod1(int[] arr) {
        int[] result = new int[arr.length];
        int counter_0 = 0;
        int counter_1 = 0;
        int counter_2 = 0;
        int index = 0;

        for (int num : arr) {
            if (num == 0) {
                counter_0++;
            } else if (num == 1) {
                counter_1++;
            } else if (num == 2) {
                counter_2++;
            }
        }

        for (int i = 0; i < counter_0; i++) {
            result[index++] = 0;
        }

        for (int i = 0; i < counter_1; i++) {
            result[index++] = 1;
        }

        for (int i = 0; i < counter_2; i++) {
            result[index++] = 2;
        }

        System.out.println("Result array => " + Arrays.toString(result));
    }

    // better way
    public static void sort0s1s2sInArrayMethod2(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        int temp = 0;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
            }
        }
        System.out.println("Array after soring 0s, 1s and 2s => " + Arrays.toString(arr));
    }

}
