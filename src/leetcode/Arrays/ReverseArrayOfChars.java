package leetcode.Arrays;

import java.util.Arrays;

public class ReverseArrayOfChars {

    public static void main(String[] args) {

        char arr[] = {'h', 'e', 'l', 'l', 'o'};
        reverseString(arr);
    }

    public static void reverseString(char s[]) {
        // iterate till half and swap elements
        char temp = 'a';
        for (int i = 0; i < s.length / 2; i++) {
            temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(s));
    }

}
