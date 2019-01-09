import java.io.*;
import java.util.*;
import java.math.*;

public class Euler13{

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        BigInteger summ = BigInteger.valueOf(0);
        for(int i=0;i<N;i++){
          summ=summ.add(scan.nextBigInteger());
        }
        String st =""+summ;
        System.out.println(st.substring(0,10));
        scan.close();
    }
}