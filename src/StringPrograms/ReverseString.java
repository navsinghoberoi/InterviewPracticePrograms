package StringPrograms;

public class ReverseString {

    public static void main(String[] args) {

        String a = "abcd";
        reverseSingleWord(a);

        String line = "This is java";
        reverseLine(line);
        reverseViaStringBuilder(line);
        String reverse = reverseViaRecursion(line);
        System.out.println("Reverse via recursion => "+reverse);
    }


    public static String reverseSingleWord(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }

    // reverse each word, but order of words should be same
    public static void reverseLine(String str) {
        String revLine = "";
        String[] words = str.split(" ");

        for (String word : words) {
            revLine += reverseSingleWord(word) + " ";
        }
        System.out.println("Reverse line without changing order of words => " + revLine);
    }


    public static void reverseViaStringBuilder(String str) {

        StringBuilder builder = new StringBuilder(str);
        System.out.println("Reverse string via string builder => " + builder.reverse());
    }


    public static String reverseViaRecursion(String str) {
        if (str.length() == 1) {
            return str;
        } else {
            return str.charAt(str.length() - 1) + reverseViaRecursion(str.substring(0, str.length() - 1));
        }
    }


}
