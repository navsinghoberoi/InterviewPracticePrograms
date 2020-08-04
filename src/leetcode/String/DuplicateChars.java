package leetcode.String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateChars {

    public static void main(String[] args) {
        String str = "abccdddee";
        getDuplicatesViaHashSet(str);
        getDuplicatesViaHashMap(str);
        removeDuplicateNumbersViaHashset(str);
        removeDuplicateNumbersInPlace(str);
    }

    // Best way coz work done in place; no new string is created
    public static void removeDuplicateNumbersInPlace(String str) {
        int counter = 0;
        char arr[] = str.toCharArray();
        for (int i = 0; i < str.length() - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[counter++] = arr[i];
            }
        }
        arr[counter++] = arr[arr.length - 1];
        System.out.println("String after removing duplicates in place => ");
        for (int i = 0; i < counter; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void getDuplicatesViaHashSet(String str) {
        Set<Character> set = new HashSet<>();
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (!(set.add(arr[i]))) {
                System.out.print("Duplicate char found from set => " + arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println("*************************");
    }


    public static void getDuplicatesViaHashMap(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }

        for (Character key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.print("Duplicate char found from map => " + key + " ");
            }
        }
        System.out.println();
        System.out.println("*************************");
    }


    public static void removeDuplicateNumbersViaHashset(String str) {
        Set<Character> set = new HashSet<>();
        for (char ch : str.toCharArray()) {
            set.add(ch);
        }
        System.out.println("String after removing duplicates via set => " + set);
    }

}

