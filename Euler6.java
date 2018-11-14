import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
private static void result(long n){
    long res1,res2,res;
    res1=(long)((n*(n+1))/2);
    res1*=res1;
    res2=(long)((n*(n+1)*(2*n+1))/6);
    res=res1-res2;
    System.out.println(res);
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            result(n);
        }
    }
}