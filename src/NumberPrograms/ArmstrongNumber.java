package NumberPrograms;

public class ArmstrongNumber {

    public static void main(String[] args) {

        checkIsNumberArmstrong(370);
    }

    public static void checkIsNumberArmstrong(int number) {

        int original = number;
        int sum = 0;
        while (number > 0) {
            int n = number % 10;
            sum += n * n * n;
            number = number / 10;
        }

        if (sum == original) {
            System.out.println("Given number is armstrong");
        } else {
            System.out.println("Given number is not armstrong");
        }
    }

}
