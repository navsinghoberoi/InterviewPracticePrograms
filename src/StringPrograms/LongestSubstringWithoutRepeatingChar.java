package StringPrograms;

import java.util.*;

public class LongestSubstringWithoutRepeatingChar {

    public static void main(String[] args) {
        String str = "tmmzuxt";
        findLongestStringWithoutRepeatingChar(str);
    }

    public static void findLongestStringWithoutRepeatingChar(String word) {
        // create substrings of each combination (min 2 char max length/2); ifPalin true then save length to compare for greater length
        String subString = "";
        String result = "";
        int wordLength = word.length();
        List<String> permutationsList = new ArrayList<>();

        for (int i = 0; i < wordLength; i++) {
            for (int j = i; j < wordLength; j++) {
                subString += word.charAt(j);
                if (isStringWithoutRepeatingChars(subString)) {
                    permutationsList.add(subString);
                }
            }
            subString = "";       // set substring to blank value before next iteration
        }

        // Print substrings with largest length
        Collections.sort(permutationsList, Comparator.comparing(String::length).reversed());
        int max_length = permutationsList.get(0).length();

        for (String list_value : permutationsList) {
            if (list_value.length() == max_length) {
                System.out.println(list_value);
            }
        }

    }

    public static boolean isStringWithoutRepeatingChars(String word) {
        boolean result = false;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }

        for (Character key : map.keySet()) {
            if (map.get(key) > 1) {
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }

}
