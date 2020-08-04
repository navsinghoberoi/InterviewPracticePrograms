package NumberPrograms;

public class ReverseNumber {

    public static void main(String[] args) {
        int number = 123;

        reverseNum(number);
        sumOfDigits(number);
    }


    public static void reverseNum(int number) {
        int rev = 0;
        while (number > 0) {
            int n = number % 10;
            rev = rev * 10 + n;
            number = number / 10;
        }
        System.out.println("Reverse of number =>" + rev);

    }

    public static void sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int n = number % 10;
            sum += n;
            number = number / 10;
        }
        System.out.println("Sum of digits =>"+sum);
    }


}
