import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String ansstring = "-1";
        int ansb=2147483647;
        for(int q=0;q<t;q++){
            String a=in.next();
            int b=in.nextInt();
            int tempb = b;
            int ns=0, nf=0, ao=0;
            while(b!=0){
                if(b%10==4)
                    nf++;
                else if(b%10==7)
                    ns++;
                else
                    ao++;
            
                b = b/10;
            }
        
            if(ao!=0)
                continue;
        
            if(ns!=nf)
                continue;
        
            if(ansb>tempb){
                ansb=tempb;
                ansstring=a;
            }
        }
        System.out.println(ansstring);
    }
}
