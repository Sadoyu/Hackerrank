import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Collections;

public class Solution {

    static int castleTowers(int n, Integer[] ar) {
        Arrays.sort(ar, Collections.reverseOrder());
        int maxi = ar[0];
        int cnt = 1;
        for (int i = 1; i < n; i++) {
            if (maxi == ar[i]) {
                cnt += 1;
            } else {
                break;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[] ar = new Integer[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = castleTowers(n, ar);
        System.out.println(result);
        in.close();
    }
}
