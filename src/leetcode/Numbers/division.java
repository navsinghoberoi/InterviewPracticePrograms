package leetcode.Numbers;

import java.util.Arrays;
import java.util.Scanner;

public class division {
    public static void main(String[] args) {

        int count = 0;
        Scanner sc = new Scanner(System.in);

        int arrSize = sc.nextInt();

        int arr[] = new int[arrSize];
        for (int i=0;i<arrSize;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);


        for (int i = arrSize - 1; i >= 0; i--) {
            for (int j = i -1; j >= 0; j--) {
                if (arr[i] % arr[j] == 0) {
                    //      System.out.println("Special number =" + arr[i]);
                    count++;
                    break;
                }
            }
        }

        System.out.println("Count = " + count);

    }



}
