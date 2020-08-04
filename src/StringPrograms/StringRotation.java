package StringPrograms;

public class StringRotation {

    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";

        checkRotation(s1, s2);
    }

    public static void checkRotation(String s1, String s2) {

        String concat = s1 + s1;   // ABCD DCAB
        if (concat.contains(s2)) {
            System.out.println("String are rotation of each other");
        } else {
            System.out.println("Strings are NOT rotations of each other");
        }

    }

}
