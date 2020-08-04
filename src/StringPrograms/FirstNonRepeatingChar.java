package StringPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {

        String a = "abracadabra";
        findFirstNonRepeatingChar(a);

    }


    public static void findFirstNonRepeatingChar(String a) {

        LinkedHashMap<Character,Integer> map =  processArrayViaMap(a);

        for (Character ch: map.keySet()){
            if (map.get(ch) == 1){
                System.out.println("First non repeating char => "+ch);
                break;
            }
        }
    }


    public static LinkedHashMap<Character, Integer> processArrayViaMap(String a) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] arr = a.toCharArray();
        for (Character ch : arr) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }
        return (LinkedHashMap<Character, Integer>) map;
    }


}
