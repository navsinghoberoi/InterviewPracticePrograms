package leetcode.String;

public class BuddyStrings {

    public static void main(String[] args) {

        String a = "aaaaaaabc";
        String b = "aaaaaaacb";
        boolean result = buddyStrings(a, b);
        System.out.println(result);
    }


    public static boolean buddyStrings(String a, String b) {
        boolean flag = false;
        if (a.equals(b)) {
            flag = false;
        } else if (a.length() == b.length() && a.length() <= 2) {
            flag = true;
        }


        return flag;
    }

}
