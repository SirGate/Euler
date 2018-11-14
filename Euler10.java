import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {
    
 static int [] numbers = new int[500000];   
 static int [] primes = new int[78498]; 
  
 private static void calculate(){
    numbers[0]=2; 
       int j=1;
       for(int i=3;i<1000000;i=i+2){
           numbers[j]=i;
            j++;
       }
    
int numb = 3;
int index2 = 1;       
 int index1;      
       while(numb*numb<1000000){index1=((numb*numb-3)/2)+1;
              for(int i=index1;i<500000;i+=numb){numbers[i]=0;}
                                index2++;
                 while(numbers[index2]==0){index2++;}
                 numb=numbers[index2];              
                         }
       j=0;
     for(int i=0;i<numbers.length;i++){if(numbers[i]>0){primes[j]=numbers[i];j++;}};
}

    private static void calculateSum(int n){
        int i=0;
        long sum=0;
        while(primes[i]<=n){sum=sum+(long)primes[i];i++;}
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        calculate();
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            calculateSum(n);
        }
      
    }
}