package StringPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LongestPalindromeSubstring {

    public static void main(String[] args) {
        String str = "ababbcb";     //forgeeksskeegfor
        findLongestPalindromeSubstring(str);
    }

    public static void findLongestPalindromeSubstring(String word) {
        // create substrings of each combination (min 2 char max length/2); ifPalin true then save length to compare for greater length
        String subString = "";
        String result = "";
        int wordLength = word.length();
        List<String> palindromeList = new ArrayList<>();

        for (int i = 0; i < wordLength; i++) {
            for (int j = i; j < wordLength; j++) {
                subString += word.charAt(j);
                //    System.out.println("Substring at end of loop => " + subString);
                if (isPalindrome(subString)) {
                    result = subString;
                    System.out.println("Palindrome substring found => " + result);
                    palindromeList.add(result);
                    continue;
                }
            }
            subString = "";       // set substring to blank value before next iteration
        }
        System.out.println("List of palindrome substrings found from the given string => " + palindromeList);

       /* StringComparator ss = new StringComparator();
        StringComparator.sortStringAsPerLength(palindromeList, ss);

        System.out.println("List of palindrome strings sorted as per the length => "+palindromeList);*/

    }

    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return false;
        }

        String original = str;
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if (rev.equals(original)) {
            return true;
        } else {
            return false;
        }
    }

}