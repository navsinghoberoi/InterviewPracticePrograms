package leetcode.String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatedCharFromString {


    public static void main(String[] args) {
        int index = getFirstNonRepeatedChar("leetcode");
        System.out.println("Index of first non repeating char => " + index);
    }

    public static int getFirstNonRepeatedChar(String word) {
        int index = -1;
        if (!(word.trim().length() == 0 || word == null)) {
            Map<Character, Integer> map = new LinkedHashMap<>();
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);

                if (!map.containsKey(ch)) {
                    map.put(ch, 1);
                } else {
                    map.put(ch, map.get(ch) + 1);
                }
            }

            for (char c : map.keySet()) {
                if (map.get(c) == 1) {
                    System.out.println("First non repeated char from string = " + c);
                    index = word.indexOf(c);
                    break;
                }
            }
        } else {
            index = -1;
        }
        return index;

    }


}
