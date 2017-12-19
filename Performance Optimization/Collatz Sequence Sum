import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
	static int collatzSequenceLen(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n % 2 == 0) {
            return 1 + collatzSequenceLen(n/2);
        }
        return 1 + collatzSequenceLen(3*n+1);
    }

    static int collatzSequenceSum(int T, int A, int B) {
        int n = 0;
        int result = 0;
        while (T-- > 0) {
            n = (A*n + B) % 5003;
            int best_len = 0;
            int best_num = 0;
            for (int k = 0; k <= n; ++k) {
                int cur_len = collatzSequenceLen(k);
                if (cur_len >= best_len) {
                    best_len = cur_len;
                    best_num = k;
                }
            }
            result += best_num;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        int result = collatzSequenceSum(T, A, B);
        System.out.println(result);
        in.close();
    }
}
