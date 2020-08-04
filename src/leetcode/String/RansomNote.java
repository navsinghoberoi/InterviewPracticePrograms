package leetcode.String;
/*
Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that
will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.
 */

import java.util.ArrayList;
import java.util.List;

public class RansomNote {

    public static void main(String[] args) {
        String ransom = "aab";
        String magazine = "baa";

        boolean result = canConstruct(ransom, magazine);
        System.out.println(result);
    }

    public static boolean canConstruct(String ransom, String magazine) {
        boolean result = false;
        int count = 0;
        if (ransom.trim().length() == 0 || ransom.trim().length() == 0) {
            result = true;
        } else if (ransom.length() > magazine.length()) {
            result = false;
        } else {
            List<Character> list = new ArrayList<>();
            for (int i = 0; i < magazine.length(); i++) {
                list.add(magazine.charAt(i));               // save magazine chars in list; if found in ransom note, delete char from list
            }
            for (int i = 0; i < ransom.length(); i++) {
                if (list.contains(ransom.charAt(i))) {
                    list.remove(list.indexOf(ransom.charAt(i)));
                    count++;
                    if (count == ransom.length()) {
                        result = true;
                        break;
                    }
                } else {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }


}
