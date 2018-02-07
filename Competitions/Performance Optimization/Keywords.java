import java.io.*;
import java.lang.*;
import java.util.*;

public class Solution {

    public int minimumLength(String text, ArrayList < String > keys) {

        int answer = 10000000;
        text += " $";
        for(int i = 0; i < text.length(); i++) {
            ArrayList < String > dup = new ArrayList<String>(keys);
            String word = "";
            if(i > 0 && text.charAt(i - 1) != ' ')
                continue;
            for(int j = i; j < text.length(); j++) {
                if(text.charAt(j) == ' ') {
                    for(int k = 0; k < dup.size(); k++) {
                        if(dup.get(k).equals(word)) {
                            dup.remove(k);
                        }
                    }
                    word = "";
                }
                else word += text.charAt(j);
                if(dup.isEmpty()) {
                    answer = Math.min(answer, j - i);
                    break;
                }
            }
        }
        if(answer == 10000000)
            answer = -1;

        return answer;
    }
    public static void main(String []args) {

        Solution s = new Solution();
        String text, buf;
        ArrayList < String > keys = new ArrayList < String >();
        Scanner in = new Scanner(System.in);
        text = in.nextLine();
        int keyWords = in.nextInt();
        in.nextLine();
        for(int i = 0; i < keyWords; i++) {
            buf = in.nextLine();
            keys.add(buf);
        }
        
        System.out.println(s.minimumLength(text, keys));
    }
}
