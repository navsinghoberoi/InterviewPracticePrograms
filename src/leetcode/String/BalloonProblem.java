package leetcode.String;

import java.util.HashMap;
import java.util.Map;

public class BalloonProblem {

    /*
    Input: text = "nlaebolko"
Output: 1
Input: text = "loonbalxballpon"
Output: 2
     */


    public static void main(String[] args) {
        //   String str = "nooballballoon";
        String str = "krhizmmgmcrecekgyljqkldocicziihtgpqwbticmvuyznragqoyrukzopfmjhjjxemsxmrsxuqmnkrzhgvtgdgtykhcglurvppvcwhrhrjoislonvvglhdciilduvuiebmffaagxerjeewmtcwmhmtwlxtvlbocczlrppmpjbpnifqtlninyzjtmazxdbzwxthpvrfulvrspycqcghuopjirzoeuqhetnbrcdakilzmklxwudxxhwilasbjjhhfgghogqoofsufysmcqeilaivtmfziumjloewbkjvaahsaaggteppqyuoylgpbdwqubaalfwcqrjeycjbbpifjbpigjdnnswocusuprydgrtxuaojeriigwumlovafxnpibjopjfqzrwemoinmptxddgcszmfprdrichjeqcvikynzigleaajcysusqasqadjemgnyvmzmbcfrttrzonwafrnedglhpudovigwvpimttiketopkvqw";
        //   getCountOfBalloonWords1(str);
        getCountOfBalloonWords2(str);
    }

    public static void getCountOfBalloonWords1(String word) {
        int totalCount = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : word.toCharArray()) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }

        int b_count = map.get('b');  //ex 1 in this case

        if (b_count > 0) {
            if (map.get('a') >= b_count && map.get('n') >= b_count && map.get('l') >= 2 * b_count && map.get('o') >= 2 * b_count) {
                System.out.println("Atleast 1 word of balloon can be formed");
                totalCount = b_count;
            } else {
                System.out.println("Not even 1 balloon word can be formed ");
            }
        } else {
            System.out.println("Count of b is 0 ; ie no word can be formed");
        }

        System.out.println("Total no. of balloon words that can be formed => " + totalCount);
    }


    public static int getCountOfBalloonWords2(String word) {
        int totalCount = 0;

        Map<Character, Integer> map = new HashMap<>();
        for (char ch : word.toCharArray()) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }

        if (!(map.containsKey('b') && map.containsKey('a') && map.containsKey('l') && map.containsKey('o') && map.containsKey('n'))) {
            System.out.println("All required chars not present in string");
            totalCount = 0;
        } else if (!(map.get('b') >= 1 && map.get('a') >= 1 && map.get('n') >= 1 && map.get('l') >= 2 && map.get('o') >= 2)) {
            System.out.println("Count of b chars => " + map.get('b'));
            System.out.println("0 words can be formed");
            totalCount = 0;
        } else {
            int b_count = map.get('b');
            while (b_count >= 1) {
                if (map.get('a') >= b_count && map.get('n') >= b_count && map.get('l') >= 2 * b_count && map.get('o') >= 2 * b_count) {
                    totalCount = b_count;
                    break;
                } else {
                    b_count--;
                }
            }
        }
        System.out.println("Total no. of balloon words that can be formed => " + totalCount);
        return totalCount;
    }


}

