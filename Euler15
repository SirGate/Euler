import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static BigInteger factorial(int n,int m)
    {
        BigInteger res = BigInteger.ONE;
        BigInteger res1 = BigInteger.ONE;
        BigInteger res2 = BigInteger.ONE;
        for (int i = 1; i <= n+m; ++i){
             res = res.multiply(BigInteger.valueOf(i));
          if(i==n){res1=res;}
          if(i==m){res2=res;}
                                     }
     res1=res1.multiply(res2);
     res=res.divide(res1).mod(BigInteger.valueOf(1000000007));
        return res;
    }
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i=0;i<T;i++){
            int N=scan.nextInt();
            int M=scan.nextInt();
            System.out.println(factorial(N,M));
        }
    scan.close();
    }
}
