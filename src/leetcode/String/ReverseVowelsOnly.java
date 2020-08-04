package leetcode.String;

public class ReverseVowelsOnly {

    public static void main(String[] args) {

        String str = "Hello";
        String s = reverseVowels(str);
        System.out.println(s);

    }

    public static String reverseVowels(String s) {
        int l = 0;
        int r = s.length() - 1;
        char[] array = s.toCharArray();

        while (l < r) {
            if (!(array[l] == 'a' || array[l] == 'e' || array[l] == 'i' || array[l] == 'o' || array[l] == 'u' || array[l] == 'A' || array[l] == 'E' || array[l] == 'I' || array[l] == 'O' || array[l] == 'U')) {
                l++;
            } else if (!(array[r] == 'a' || array[r] == 'e' || array[r] == 'i' || array[r] == 'o' || array[r] == 'u' || array[r] == 'A' || array[r] == 'E' || array[r] == 'I' || array[r] == 'O' || array[r] == 'U')) {
                r--;
            } else {
                char temp = array[l];
                array[l] = array[r];
                array[r] = temp;
                l++;
                r--;
            }
        }
        return String.copyValueOf(array);
    }

}