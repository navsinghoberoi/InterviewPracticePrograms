package leetcode.Numbers;

public class SeparateOddEven {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6};

        getEvenFirst(arr);
    }


    public static void getEvenFirst(int arr[]) {

        int even[] = new int[arr.length];
        int odd[] = new int[arr.length];
        int countEven = 0, countOdd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even[countEven++] = arr[i];
            } else {
                odd[countOdd++] = arr[i];
            }
        }

        for (int i = 0; i < countEven; i++) {
            System.out.println(even[i]);
        }

        for (int i = 0; i < countOdd; i++) {
            System.out.println(odd[i]);
        }


    }


}
