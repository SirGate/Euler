import java.io.*;
import java.util.*;

public class Euler12 {

static int count=0;
static int[] primes={2,3,5,7,11,13,17,19,23,29,31,37,41};
    
private static int resolve(int n){
int count1=0;
int res=1;    
int j=0; 
int n1=n;    
    
     while(n1>1){
       if(n1%primes[j]==0){count1++;n1=n1/primes[j];
                           if(n1==1){count1++;res*=count1;break;}}
              else{j++;
                   if(count1!=0){count1++;
                   res*=count1;count1=0;};
                   if(j==13){break;}}  
     }
    return res;
}
   
private static int solve(int N){
int triangle=1;
int  temp=2;       
int  count=0;       
 if (N==1){return 3;}
    while(count<=N){
    count=0;
    triangle=triangle+temp;  
    count=resolve(triangle);
      temp++;
    
}  
   return triangle; }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        for(int i=0;i<T;i++){
           int N = in.nextInt();
           System.out.println(solve(N)); 
            }
      
    }
}