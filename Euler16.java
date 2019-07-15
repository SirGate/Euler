import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

static int calculate(int N){
BigInteger numb=BigInteger.valueOf(2);
numb=numb.pow(N);
String str = numb.toString();
char[] ch = str.toCharArray();
int res=0;
for(int i=0;i<ch.length;i++){
res+=Character.getNumericValue(ch[i]);
}
return res;}
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
       for(int i=0;i<T;i++){
      int result=calculate(scan.nextInt());
      System.out.println(result);    
       }

  scan.close();
    }
}