package NumberPrograms;

public class Fibonacci {

    public static void main(String[] args) {

        printFibonacci();
    }


    public static void printFibonacci() {

        // 0,1,1,2,3,5,8,13....

        int num1 = 0;
        int num2 = 1;

        System.out.print(num1 + " " + num2 + " ");

        int sum = 0;
        while (sum < 22) {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;

            if (sum > 22) {
                break;
            }
            System.out.print(sum + " ");
        }

    }

}
