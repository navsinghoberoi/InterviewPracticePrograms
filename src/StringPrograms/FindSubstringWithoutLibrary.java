package StringPrograms;

public class FindSubstringWithoutLibrary {


    public static void main(String[] args) {
        String word = "tmmzuxt";
        String sub = "issipi";

        //    checkSubstringPresentInString(word, sub);
        // checkSubstringPresentInString1(word, sub);
        checkIfSubstring(word, sub);
    }

    public static void checkIfSubstring(String word, String substring) {
        int required_count = substring.length();
        int count = 0;
        int counter = 1;
        int j = 0;
        int flag = -1;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == substring.charAt(j)) {
                count++;
                while ((count != required_count) && (i + counter) < word.length() && (j + counter) < substring.length())
                    if (word.charAt(i + counter) == substring.charAt(j + counter)) {
                        count++;
                        counter++;
                        if (count == required_count) {
                            System.out.println("Substring found in the string starting from index " + i + " of the word " + word);
                            flag = 1;
                            break;
                        }
                    } else {
                        count = 0;
                        counter = 1;
                        break;
                    }
            }
        }
        if (flag == -1) {
            System.out.println("Substring not found in the word");
        }
    }

   /* public static void checkSubstringPresentInString(String word, String substring) {

        int j = 0;
        int count = 0;
        int counter = 1;
        int required_count = substring.length();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == substring.charAt(j)) {
                count++;
                while (count <= required_count) {
                    if (word.charAt(i + counter) == substring.charAt(j + counter)) {
                        count++;
                        counter++;
                        if (count == required_count) {
                            System.out.println("String has substring");
                            break;
                        }
                    } else {
                        count = 0;
                        counter = 1;
                        continue;
                    }
                }
            }
        }
        System.out.println("Reached at end of the program");
    }
*/

/*    private static void checkSubstringPresentInString1(String word, String substring) {

        int required_count = substring.length();
        int count = 0;
        int counter = 1;
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < substring.length(); j++) {
                if (word.charAt(i) == substring.charAt(j)) {
                    count++;
                    if ((word.charAt(i + counter) == substring.charAt(j + counter)) && j < substring.length() && i < word.length()) {
                        count++;
                    } else {
                        count = 0;
                        counter = 1;
                        break;
                    }
                }
            }
        }
        System.out.println("Count => " + count);
        if (count == required_count) {
            System.out.println("Substring found inside the string " + word);
        } else {
            System.out.println("Substring not found");
        }
    }*/


}


