package leetcode.String;

public class Palindrome {

    public boolean isPalindrome(String str) {
        int length = str.length();
        int c = 0;
        boolean pal = true;
        if((length % 2) == 1) {
            c = 1;
        }
        int x = length / 2;
        String first = str.substring(0, x);
        String second = str.substring(x + c, length);
        for(int i = first.length() - 1, counter = 0; i >= 0 ; i--, counter++) {
            if(first.charAt(i) != second.charAt(counter)) {
                pal = false;
                break;
            }
        }
        return pal;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println("Is Palindrome :: " + palindrome.isPalindrome("kik"));
    }
}
