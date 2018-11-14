import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
 
private static void resolve(int n){
int a,b,c;
boolean tr=false;
int max=0;    
   for(c=(int)(n/2);c>0.33*n;c--){a=1;b=0;
    for(int i=n-c;a>b;i--){a=i-1;b=n-c-i+1;
                                   if(c*c==a*a+b*b){if(a*b*c>max){max=a*b*c;};tr=true;break;} }
                                 }         
 if(max>0){System.out.println(max);}else{System.out.println("-1");}                                 
                                   }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            resolve(n);
        }
    }
}