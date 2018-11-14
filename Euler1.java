import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
 static TreeMap<Integer, Long> results = new TreeMap<Integer, Long>();
private static void calculate(int n){
   long res=0; 
    long res1=0;
    long k1=0;
    int i=1;
    int numb=0;
    int i1,i2;
    if(n-results.floorKey(n)<=results.ceilingKey(n)-n){ 
                             numb=results.floorKey(n);
                                      res1=results.get(numb);
                                           i2=n-n%3;
                                           if(n%3==0){i2=n-3;}
                                           i2=i2/3;
                                           res=((long)((long)i2*i2+i2)/2)*3;
                                           i=numb-numb%5;
                                           if(numb%5!=0){i+=5;}else{i=numb;}
                                           i=i/5;
                                           while(i*5<n){k1=i*5;if(k1%3!=0){res1+=k1;}i++;}
   results.put(n,res1);
  if(numb==n){System.out.println(results.get(numb)+res);}
           else{ res+=res1;                                        
                 System.out.println(res);
                                      }
                                           }
      else{                   numb=results.ceilingKey(n);
                                     res1=results.get(numb);
                                         if(n%3==0){i1=(n-3)/3;}else{i1=(n-n%3)/3;}
                                          res=((long)((long)i1*i1+i1)/2)*3;
                                         if(numb%5==0){i2=(numb-5)/5;}else{i2=(numb-numb%5)/5;}
                                          if(n%5==0){i1=(n-5)/5;}else{i1=(n-n%5)/5;}
                                          for(i=i2;i>i1;i--){k1=i*5;if(k1%3!=0){res1-=k1;}}
results.put(n,res1);
if(numb==n){System.out.println(results.get(numb)+res);}else{res+=res1; 
                                                        System.out.println(res);}
                                    }     
    } 
    public static void main(String[] args) {
        results.put(1,0L);
        results.put(2,0L); 
        results.put(3,0L); 
        results.put(4,0L);
        results.put(5,0L);
        results.put(6,5L);
        results.put(7,5L);
        results.put(8,5L);
        results.put(9,5L);
        results.put(10,5L);
        results.put(25000000,41666658333335L);
        results.put(50000000,166666633333335L);
        results.put(75000000,375000000000000L);
        results.put(100000000,666666633333335L);
        results.put(125000000,1041666583333335L);
        results.put(150000000,1500000000000000L); 
        results.put(175000000,2041666608333335L);
        results.put(200000000,2666666533333335L);
        results.put(250000000,4166666583333335L); 
        results.put(300000000,6000000000000000L);
        results.put(350000000,8166666433333335L);
        results.put(400000000,10666666533333335L);
        results.put(425000000,12041666383333335L);
        results.put(450000000,13500000000000000L);
        results.put(475000000,15041666508333335L);
        results.put(500000000,16666666333333335L);
        results.put(525000000,18375000000000000L);
        results.put(550000000,20166666483333335L);
        results.put(575000000,22041666283333335L);
        results.put(600000000,24000000000000000L);
        results.put(625000000,26041666458333335L);
        results.put(675000000,30375000000000000L);
        results.put(650000000,28166666233333335L);
        results.put(700000000,32666666433333335L);
        results.put(725000000,35041666183333335L);
        results.put(750000000,37500000000000000L);
        results.put(775000000,40041666408333335L);
        results.put(800000000,42666666133333335L);
        results.put(825000000,45375000000000000L);
        results.put(850000000,48166666383333335L);
        results.put(875000000,51041666083333335L);
        results.put(900000000,54000000000000000L);
        results.put(950000000,60166666033333335L);
        results.put(925000000,57041666358333335L);
        results.put(975000000,63375000000000000L);
        results.put(1000000000,66666666333333335L);
        
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
           int n = in.nextInt();
            calculate(n);
        }
    }
}