import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
static List<BigInteger>prime = new ArrayList<BigInteger>();
    private static void resolve(){
   int i=1;
        while(prime.size()<10000){String str = String.valueOf(i);
                                  BigInteger n = new BigInteger(str);
                                 if(n.isProbablePrime(20)){prime.add(n);}
                                  i++;
                                  }    
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        resolve();
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(prime.get(n-1));
        }
    }
}