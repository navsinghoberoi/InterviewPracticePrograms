package leetcode.String;

public class ReverseString {


    public static void main(String[] args) {

        reverseSingleWord("today is thursday");
        revereStringViaRecursion("today is thursday");
        reverseStringLineSameOrder("today is thursday");

        reverseStringViaPreservingSpacePosition("intern at geeks");
    }


    public static String reverseSingleWord(String word) {

        String rev = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            rev += word.charAt(i);
        }
        System.out.println(rev);
        return rev;
    }

    public static void reverseStringLineSameOrder(String line) {

        String revLine = "";
        String word[] = line.split(" ");

        for (int i = 0; i < word.length; i++) {
            revLine += reverseSingleWord(word[i] + " ");
        }
        System.out.println("Reverse string in same order = " + revLine);

    }

    public static void revereStringViaRecursion(String word) {
        if ((word == null) || (word.length() <= 1)) {
            System.out.println(word);
        } else {
            System.out.println(word.charAt(word.length() - 1));
            reverseSingleWord(word.substring(0, word.length() - 1));
        }
    }


    public static void reverseStringViaPreservingSpacePosition(String word) {
        char[] inputArray = word.toCharArray();
        char[] result = new char[inputArray.length];

        // Mark spaces in result
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == ' ') {
                result[i] = ' ';
            }
        }

        // Traverse input string from beginning and put characters in result from end
        int j = result.length - 1;
        for (int i = 0; i < inputArray.length; i++) {

            // Ignore spaces in input string
            if (inputArray[i] != ' ') {

                // ignore spaces in result.
                if (result[j] == ' ') {
                    j--;
                }
                result[j] = inputArray[i];
                j--;
            }
        }
        System.out.println(String.valueOf(result));
    }


}
