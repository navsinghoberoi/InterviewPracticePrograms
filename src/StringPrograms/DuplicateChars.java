package StringPrograms;

import java.util.HashMap;

public class DuplicateChars {


    public static void main(String[] args) {

        String a = "abracadabra";
        getDuplicateCharsFromString(a);
        removeDuplicateCharsFromString(a);
    }


    public static void getDuplicateCharsFromString(String str) {

        HashMap<Character, Integer> map = processArrayViaMap(str);

        for (Character key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.print(key + " ");
            }
        }
        System.out.println();
    }

    public static void removeDuplicateCharsFromString(String str) {

        HashMap<Character, Integer> map = processArrayViaMap(str);

        String withoutDuplicates = "";

        for (Character key : map.keySet()) {
            withoutDuplicates += key;
        }

        System.out.println("String after removing duplicates =>" + withoutDuplicates);
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
