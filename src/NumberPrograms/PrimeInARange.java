package NumberPrograms;

public class PrimeInARange {

    public static void main(String[] args) {

        int first_number = 10;
        int last_number = 100;

        for (int i = first_number; i < last_number; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
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
