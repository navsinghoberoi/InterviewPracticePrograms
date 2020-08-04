package leetcode.Numbers;

public class CountPrime {


    public static void main(String[] args) {

        int number = 499979;
        int countOfPrime = countPrimes(number);
        System.out.println(countOfPrime);
    }


    public static int countPrimes(int number) {
        int count = 0;
        for (int i = 1; i < number; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        } else if (number ==2 || number == 3) {
            return true;
        } else {
            for (int i = 2; i*i <= number / 2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

}
