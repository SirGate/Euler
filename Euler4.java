import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
static TreeSet<Integer>palindrom=new TreeSet<>();    
private static void calculate(){
for(int i=101101;i<1000000;i++){String str = Integer.toString(i);byte[] strOut= str.getBytes();
if((strOut[0]==strOut[5])&(strOut[1]==strOut[4])&(strOut[2]==strOut[3])){palindrom.add(i);}
                              }    
                               }
private static void solution(int n){
boolean b=false; 
int k=palindrom.floor(n);
if(k==n){solution(n-1);b=true;}    
if(b==false){for(int i=100;i<1000;i++){
      for(int j=100;j<1000;j++){if(i*j==k){System.out.println(k);b=true;break;}}
                         if(b==true){break;}}}
    if(b==false){palindrom.remove(k);solution(n);}
    
    
}    
    public static void main(String[] args) {
       calculate();
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
           if(n==101101){System.out.println(99999);}else{ solution(n);}
        }
    }
}