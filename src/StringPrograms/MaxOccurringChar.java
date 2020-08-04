package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class MaxOccurringChar {


    public static void main(String[] args) {

        String a = "aabbccddaba";
        getMaxOccurringChar(a);

    }


    public static void getMaxOccurringChar(String str) {
        HashMap<Character, Integer> map = processArrayViaMap(str);

        int maxValue = 0;
        char maxOccuringKey = 'a';
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("key =>" + entry.getKey() + ", value =>" + entry.getValue());
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxOccuringKey = entry.getKey();
            }
        }
        System.out.println("Max occurring char in given string =>" + maxOccuringKey);
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
