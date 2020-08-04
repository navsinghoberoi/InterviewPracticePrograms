package leetcode.String;

import java.util.HashMap;
import java.util.Map;

public class Anagrams {

    public static void main(String[] args) {

        String a = "abcd";
        String b = "cabd";

        boolean result = isAnagram(a, b);
        System.out.println(result);
    }


    public static boolean isAnagram(String a, String b) {
        if (a.length() !=b.length()){
            return false;
        }else if (a.trim() == b.trim()){
            return true;
        }

        Map<Character, Integer> map1 = processArrayViaMap(a);
        Map<Character, Integer> map2 = processArrayViaMap(b);

        if (map1.equals(map2)) {
            return true;
        }
        return false;
    }


    public static HashMap<Character, Integer> processArrayViaMap(String a) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = a.toCharArray();
        for (Character ch : arr) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }
        return map;
    }

}
