package leetcode.String;
/*
Input: "A man, a plan, a canal: Panama"
Output: true
 */

public class ValidPalindrome {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean isPalin = isPalindrome(s);
        System.out.println(isPalin);
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        boolean flag = false;
        if (s.trim().length() == 0) {
            flag = true;
        } else {
            String newString = s.toLowerCase().replaceAll("[^a-zA-Z0-9+]", "");
            System.out.println("String after removing special chars => " + newString);
            StringBuilder reverseString = new StringBuilder(newString);
            reverseString = reverseString.reverse();
            System.out.println("Reverse string => " + reverseString);
            System.out.println("");
            if (!(newString.equalsIgnoreCase(String.valueOf(reverseString)))) {
                flag = false;
            } else {
                flag = true;
            }
        }
        return flag;
    }

}
