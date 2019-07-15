import java.io.*;
import java.util.*;

public class Solution {

 private static int[]res = new int[50000001];

private static void find_len(int i){
 ArrayList<Integer>points=new ArrayList();  
 int length=1;
 long number=i; 
 points.add((int)number);
 while(number>1){
     if((number<5000001)&&(res[(int)number]!=0)){
         length=length+res[(int)number];
         break;
     }
     if(number%2==0){
         number/=2;
         length++;
         if(number<5000001){points.add((int)number);}
                     else{points.add(0);}       
         }
     else if(number%2!=0){
        number=number*3+1;
         length++;
         if(number<5000001){points.add((int)number);}
                else{points.add(0);}       
         }
 }
  length-=1;
   res[i]=length;
   if(points.size()>2){
     for(int j=1;j<points.size();j++){
          length--;
           if(points.get(j)!=0){
               if(res[points.get(j)]==0){res[points.get(j)]=length;
               }
               }
       }
   }
}
private static void precalculate(){
int length=2;
long number=2L;
res[1]=1;
while(number<=5000000){
     res[(int)number]=length;
     number*=2L;
     length++;
}

   for(int i=3;i<5000001;i++){
          if(res[i]==0){
          find_len(i);
       }
   }
       int max=2;
       int numb=2;
   for(int i=3;i<5000001;i++){
      if(res[i]>=max){
              max=res[i];
              numb=i;
              res[i]=i;
       } else{res[i]=numb;}
   }
 }
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        precalculate();
        for(int i=0;i<T;i++){
            int N=scan.nextInt();
        System.out.println(res[N]);
        }
    scan.close();
    }
}
