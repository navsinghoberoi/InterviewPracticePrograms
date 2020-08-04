package leetcode.Arrays;

public class BuySellStock1 {
    /*
Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Not 7-1 = 6, as selling price needs to be larger than buying price.
    */

    public static void main(String[] args) {
        int input[] = {7, 1, 5, 3, 6, 4};    // 7,1,5,3,6,4
        int profit = findMaxProfit(input);
        System.out.println(profit);
    }


    public static int findMaxProfit(int[] array) {
        int profit = 0;
        if (array.length <= 1) {
            profit = 0;
        }

        int min = 0;
        int max = 0;
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    min = array[i];
                    counter = i;
                    while (counter++ < array.length - 1) {
                        if (array[counter] > max) {
                            max = array[counter];
                        }
                    }
                }
            }
            // Evaluate profit after 1 loop iteration
            if (max - min > profit) {
                profit = max - min;
            }
            System.out.println("Profit after " + (i+1) + " th loop => " + (max - min));

            // reset min, max and counter values
            min = 0;
            max = 0;
        }
        if (profit > 0) {
            System.out.println("Max profit by buying stock  => " + profit);
        }
        return profit;
    }

}
