package NumberPrograms;

public class Patterns {

    public static void main(String[] args) {
        pattern1();
        pattern2();
        pattern3();
    }

    public static void pattern1() {
        System.out.println("Printing pattern 1");
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2() {
        System.out.println("Printing pattern 2");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void pattern3() {
        System.out.println("Printing pattern 3");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
