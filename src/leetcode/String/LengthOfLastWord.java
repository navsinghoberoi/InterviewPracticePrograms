package leetcode.String;

public class LengthOfLastWord {


    public static void main(String[] args) {

        String s = "Hellooo WO";
        int length = lengthOfLastWord(s);
        System.out.println(length);
    }

    public static int lengthOfLastWord(String s) {

        if (s.trim().length() == 0 || s == null) {
            return 0;
        } else {
            String words[] = s.split(" ");
            return words[words.length - 1].length();
        }


    }


}
