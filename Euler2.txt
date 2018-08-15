import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
static TreeMap<Long,Long> result = new TreeMap<Long,Long>();
static long res1=0;  
    private static void calculate(long n1,long n2){
    long res=0;
   res=n1+n2;
       if(res<40000000000000000L){if(res%2==0){res1+=res;}
                                  result.put(res,res1);calculate(n2,res);}
}
    
    public static void main(String[] args) {
     long res2=0;
        result.put(1L,0L); 
       result.put(2L,0L);
       result.put(3L,2L);
        result.put(5L,2L);
        result.put(8L,10L);
        result.put(13L,10L);
        res1=10L;
        calculate(8L,13L);   
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
      for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
          res2 = result.floorKey(n);
          System.out.println(result.get(res2));
      }
      }
}