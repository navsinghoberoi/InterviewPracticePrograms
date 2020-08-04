package leetcode.String;

import java.util.*;

public class LongestCommonPrefix {


    public static void main(String args[]) {

        String arr[] = {"ab", "aacc"};
        String result = longestCommonPrefix1(arr);
        System.out.println(result);
    }


    public static String longestCommonPrefix1(String[] strs) {
        if (strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        return prefix;
    }

    public static String longestCommonPrefix(String arr[]) {
        String result = "";
        int counter = 1;

        if (arr.length == 0) {
            return result;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].trim().equals("")) {
                return result;
            }
        }

        if (arr.length == 1) {
            return arr[0];
        }

        char firstChar = arr[0].charAt(0);

        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i].charAt(0) == firstChar)) {
                return "";
            }
        }

        result += firstChar;
        for (int i = 0; i < arr.length; i++) {
            char nextChar = arr[0].charAt(counter);
            if (counter < arr[i].length()) {
                if (arr[i].charAt(counter) == nextChar) {
                    if (i == arr.length - 1) {
                        result += nextChar;
                        counter++;
                        i = 0;   // reset value to start comparing next char
                    } else {
                        continue;
                    }
                } else {
                    return result;
                }
            } else {
                return result;
            }
        }
        return result;
    }




}
