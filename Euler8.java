import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
private static long calculate(int n,int k,String number){
long res=0; 
    long res1=0;
 byte[] numb1=number.getBytes();
 int[]  numb = new int[n];  
    for(int i=0;i<n;i++){numb[i]=Character.getNumericValue(numb1[i]);}
 for(int j=0;j<n-k+1;j++){res1=numb[j];
                          for(int i = j;i<j+k-1;i++){res1=res1*numb[i+1];}
                         if(res1>res){res=res1;}
                      }
    return res;    
}
    public static void main(String[] args) {
        long result=0;
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            String num = in.next();
            result=calculate(n,k,num);
    System.out.println(result);
        }
    }
}
