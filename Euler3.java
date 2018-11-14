import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
private static TreeSet<Long>result; 
private static void solution(long n){
double res;
long i;
boolean b =false;
res=Math.sqrt(n); 
if(n>9){    
if(n%5==0){result.add(5L);solution(n/5);}
           else{if(n%3==0){result.add(3L);solution(n/3);}
           else{if(n%2==0){result.add(2L);solution(n/2);}
		   else{if(res<6){result.add(n);}
    for(i=6;i<=res;i++){if(n%i==0){result.add(i);b=true;solution(n/i);break;}
                            }if(b==false){result.add(n);}
}
                                                               }}
}else{if(n==7){result.add(n);}}


}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            result=new TreeSet<Long>();
            solution(n);
            System.out.println(result.pollLast());
        }
    }
}