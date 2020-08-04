package leetcode.String;

import java.util.Arrays;

public class ReverseWithoutSpecialChars {

    public static void main(String[] args) {

        String word = "a,b$c";
        reverseWithSpecialCharsInPlace(word);
    }

    public static String reverseWithSpecialCharsInPlace(String word) {
        char[] charArray = word.toCharArray();

        // Initialize left and right pointers
        int r = word.length() - 1;
        int l = 0;

        while (l < r) {
            if (!Character.isAlphabetic(charArray[l])) {
                l++;
            } else if (!Character.isAlphabetic(charArray[r])) {
                r--;
            } // Both str[l] and str[r] are not spacial
            else {
                char tmp = charArray[l];
                charArray[l] = charArray[r];
                charArray[r] = tmp;
                l++;
                r--;
            }
        }
        String result = new String(charArray);
        System.out.println(result);
        return result;
    }


}
