package NumberPrograms;

import java.util.ArrayList;

public class NumberAsSumOfPrimeNumbers {

// express given no (prime / non prime) as sum of 2 prime numbers  . Ex 22 = 11 + 11

    public static void main(String[] args) {

        computeNumbersCombinationMethod1(14);    // O(n2)
        computeNumbersCombinationMethod2(14);    // O(n)
    }


    // Complexity O(n2)
    public static void computeNumbersCombinationMethod1(int number) {
        ArrayList<Integer> prime_no_list = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (isPrime(i)) {
                prime_no_list.add(i);
            }
        }

        Integer arr[] = prime_no_list.toArray(new Integer[prime_no_list.size()]);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] + arr[j] == number) {
                    System.out.println("A pair has been found => " + arr[i] + " , " + arr[j]);
                }
            }
        }
    }


    // Complexity O(n)
    public static void computeNumbersCombinationMethod2(int number) {
        for (int i = 1; i <= number; i++) {
            if (isPrime(i)) {
                if (isPrime(number - i) && i <= number / 2) {
                    System.out.println("A pair of prime numbers found => " + i + " , " + (number - i));
                }
            }
        }
    }


    public static boolean isPrime(int number) {
        if (number <= 1)
            return false;
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }


}
