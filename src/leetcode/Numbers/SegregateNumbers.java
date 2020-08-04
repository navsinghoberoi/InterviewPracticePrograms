package leetcode.Numbers;

public class SegregateNumbers {


    // string rev (with and without fact), remove duplicate from array,
    // Print all permutations of String,find the longest substring from a given string which doesn’t
    // contain any duplicate characters, reverse word and mantain the spaces


    public static void main(String[] args) {

        int array1[] = {0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0};
        segregate0And1(array1);


        int array2[] = {0, 1, 2, 3, 7, 8, 10, 21, 30};
        segregateOddAndEvenNumbers(array2);
    }


    public static void segregate0And1(int[] arr) {
        int zeroCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            }
        }

        System.out.println("Total number of 0's are = " + zeroCount);
        System.out.println("Total numbers in array are = " + arr.length);

        for (int i = 0; i < zeroCount; i++) {
            arr[i] = 0;
            System.out.print(arr[i] + " ");
        }

        for (int j = zeroCount; j < arr.length; j++) {
            arr[j] = 1;
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        System.out.println("************************************");
    }


    public static void segregateOddAndEvenNumbers(int arr[]) {
        int result[] = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[index] = arr[i];
                index++;
            }
        }


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                result[index] = arr[i];
                index++;
            }
        }

       for (int i=0;i<result.length;i++){
           System.out.print(result[i] + " ");
       }

    }

}
