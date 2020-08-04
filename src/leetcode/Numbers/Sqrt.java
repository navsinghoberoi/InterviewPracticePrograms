package leetcode.Numbers;

public class Sqrt {
/*
Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
 */

    public static void main(String[] args) {
        int no = 2147395600;
        int result = mySqrt(no);
        System.out.println(result);
    }

    // calculate factors
    public static int mySqrt(int x) {
        int closestNum = 0;

        if (x == 1) {
            return 1;
        }

        int i = 1;
        while (i * i <= x) {
            i++;
            closestNum = i;
        }
        return closestNum;
    }


}
