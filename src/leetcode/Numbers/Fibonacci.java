package leetcode.Numbers;

public class Fibonacci {

    // 0,1,1,2,3,5,8

    public static void main(String[] args) {

        printFibonacci();
    }


    public static void printFibonacci() {

        int num1 = 0;
        int num2 = 1;
        System.out.print(num1 + " " + num2 + " ");

        int sum = 0;

        while (sum < 50) {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            System.out.print(sum + " ");
        }


    }


}
