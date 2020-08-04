package ArrayPrograms;

import java.util.Arrays;

public class RotateArray {


    public static void main(String[] args) {


        int[] a = {1, 2, 3, 4, 5};
        rotateArray(a, 2);    // with k=2, output should be {4,5,1,2,3}

    }


    public static void rotateArray(int[] arr, int k) {

        int counter = 0;
        int[] resultArray = new int[arr.length];

        for (int i = arr.length - k; i < arr.length; i++) {
            resultArray[counter] = arr[i];
            counter++;
        }

        for (int i=0;i<arr.length-k;i++){
            resultArray[counter] = arr[i];
            counter++;
        }
        System.out.println("Rotated array => "+ Arrays.toString(resultArray));
    }

}
