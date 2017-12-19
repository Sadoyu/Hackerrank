import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(String opr) {
        // Complete this function
        String[] a = opr.split("");
        int x = Integer.parseInt(a[0]);
        int y = Integer.parseInt(a[2]);
        int s=0;
        if(a[1].equals("+")){
            s = x+y;
        }
        else if(a[1].equals("-")){
            s = x-y;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String opr = in.next();
        int result = solve(opr);
        System.out.println(result);
        in.close();
    }
}
