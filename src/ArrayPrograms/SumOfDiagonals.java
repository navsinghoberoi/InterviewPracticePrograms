package ArrayPrograms;

import java.util.Arrays;

public class SumOfDiagonals {

    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {4, 2, 6}, {7, 8, 3}};
        calculateSumOfDiagonals(arr, 3, 3);
    }

    public static void calculateSumOfDiagonals(int[][] arr, int m, int n) {

        int sum_diagonal1 = 0;
        int sum_diagonal2 = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum_diagonal1 += arr[i][j];
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == (m - 1)) {
                    sum_diagonal2 += arr[i][j];
                }
            }
        }


        System.out.println("Sum of diagonal 1 =>" + sum_diagonal1);
        System.out.println("Sum of diagonal 2 =>" + sum_diagonal2);

    }


}
