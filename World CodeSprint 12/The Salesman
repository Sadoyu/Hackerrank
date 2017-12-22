import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt(), val=0;
            int[] x = new int[n];
            for(int x_i = 0; x_i < n; x_i++){
                x[x_i] = in.nextInt();
            }
            Arrays.sort(x);
            for(int i=1;i<x.length;i++){
                val += Math.abs(x[i]-x[i-1]);
            }
            System.out.println(val);
        }
        in.close();
    }
}
