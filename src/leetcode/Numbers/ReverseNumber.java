package leetcode.Numbers;

public class ReverseNumber {

    public static void main(String[] args) {
        int reverse = computeNumberReverse(1534236469);
        System.out.println("Reverse of number = " + reverse);


       /* int sum = computeSumOfDigits(12345);
        System.out.println("Sum of digits = " + sum);*/
    }


    public static int computeNumberReverse(int num) {
        long rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }
        return (int)rev;
    }


    public static int computeSumOfDigits(int num) {

        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        return sum;
    }


}
