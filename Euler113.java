import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
 
static BigInteger []ar=new BigInteger[100001];
 
public static int calculate (){
    char ch;
   long []incr=new long[10];
   long []decr=new long[10];
   long []in=new long[10];
   long []de=new long[10];
   boolean flag = false;
   long res2=99;
  BigInteger incr1,incr2,incr3,incr4,incr5,incr6,incr7,incr8,incr9,
             decr1,decr2,decr3,decr4,decr5,decr6,decr7,decr8,decr9,
             de1,de2,de3,de4,de5,de6,de7,de8,de9,in1,in2,in3,in4,in5,in6,in7,in8,in9,res;
    int rs=0;
       for (int i=100;i<1000;i++){String s = Integer.toString(i);byte[] strOut= s.getBytes();
                                 for(int j=1;j<strOut.length;j++){
                                  if(strOut[j]<=strOut[j-1]){flag=true;}
                                           else{flag=false;break;}}
                              if(flag==true){
                                  ch=(char)strOut[0];
                                  if(ch=='1'){decr[1]++;}
                                  if(ch=='2'){decr[2]++;}
                                  if(ch=='3'){decr[3]++;}
                                  if(ch=='4'){decr[4]++;}
                                  if(ch=='5'){decr[5]++;}
                                  if(ch=='6'){decr[6]++;}
                                  if(ch=='7'){decr[7]++;}
                                  if(ch=='8'){decr[8]++;}
                                  if(ch=='9'){decr[9]++;}
                                                  }
                           if(flag==false){ for(int j=1;j<strOut.length;j++)
                           {if(strOut[j]>=strOut[j-1]){flag=true;}
                            else{flag=false;break;}}
                                          if(flag==true){
                                  ch=(char)strOut[0];
                                  
                                  if(ch=='1'){incr[1]++;}
                                  if(ch=='2'){incr[2]++;}
                                  if(ch=='3'){incr[3]++;}
                                  if(ch=='4'){incr[4]++;}
                                  if(ch=='5'){incr[5]++;}
                                  if(ch=='6'){incr[6]++;}
                                  if(ch=='7'){incr[7]++;}
                                  if(ch=='8'){incr[8]++;}
                                  if(ch=='9'){incr[9]++;}
                                          }}
                              
    if (flag==true){flag=false;}
                           }
    res2=res2+incr[1]+incr[2]+incr[3]+incr[4]+incr[5]+incr[6]+incr[7]+incr[8]+incr[9]+decr[1]+
	decr[2]+decr[3]+decr[4]+decr[5]+decr[6]+decr[7]+decr[8]+decr[9];
  res = BigInteger.valueOf(res2);
 ar[3]=res;   
incr1=BigInteger.valueOf(incr[1]);  
incr2=BigInteger.valueOf(incr[2]);
incr3=BigInteger.valueOf(incr[3]); 
incr4=BigInteger.valueOf(incr[4]);
incr5=BigInteger.valueOf(incr[5]);
incr6=BigInteger.valueOf(incr[6]);
incr7=BigInteger.valueOf(incr[7]);   
incr8=BigInteger.valueOf(incr[8]);   
incr9=BigInteger.valueOf(incr[9]);   
    
    decr1=BigInteger.valueOf(decr[1]);
    decr2=BigInteger.valueOf(decr[2]);
    decr3=BigInteger.valueOf(decr[3]);
    decr4=BigInteger.valueOf(decr[4]);
    decr5=BigInteger.valueOf(decr[5]);
    decr6=BigInteger.valueOf(decr[6]);
    decr7=BigInteger.valueOf(decr[7]);
    decr8=BigInteger.valueOf(decr[8]);
    decr9=BigInteger.valueOf(decr[9]);
    
    for (int i=4;i<100001;i++){

de9=BigInteger.ONE.add(decr1).add(decr2).add(decr3).add(decr4).add(decr5).add(decr6).add(decr7).add(decr8).add(decr9);
de8=BigInteger.ONE.add(decr1).add(decr2).add(decr3).add(decr4).add(decr5).add(decr6).add(decr7).add(decr8);
de7=BigInteger.ONE.add(decr1).add(decr2).add(decr3).add(decr4).add(decr5).add(decr6).add(decr7);
de6=BigInteger.ONE.add(decr1).add(decr2).add(decr3).add(decr4).add(decr5).add(decr6);
de5=BigInteger.ONE.add(decr1).add(decr2).add(decr3).add(decr4).add(decr5);
de4=BigInteger.ONE.add(decr1).add(decr2).add(decr3).add(decr4);
de3=BigInteger.ONE.add(decr1).add(decr2).add(decr3);
de2=BigInteger.ONE.add(decr1).add(decr2);
de1=BigInteger.ONE.add(decr1);
decr1=de1;decr2=de2;decr3=de3;decr4=de4;decr5=de5;
decr6=de6;decr7=de7;decr8=de8;decr9=de9;
           
in1=BigInteger.valueOf(8).add(incr8).add(incr9).add(incr7).add(incr6).add(incr5).add(incr4).add(incr3).add(incr2).add(incr1);    
in2=BigInteger.valueOf(7).add(incr8).add(incr9).add(incr7).add(incr6).add(incr5).add(incr4).add(incr3).add(incr2);    
in3=BigInteger.valueOf(6).add(incr8).add(incr9).add(incr7).add(incr6).add(incr5).add(incr4).add(incr3);    
in4=BigInteger.valueOf(5).add(incr8).add(incr9).add(incr7).add(incr6).add(incr5).add(incr4);
in5=BigInteger.valueOf(4).add(incr8).add(incr9).add(incr7).add(incr6).add(incr5);           
in6=BigInteger.valueOf(3).add(incr8).add(incr9).add(incr7).add(incr6);           
in7=BigInteger.valueOf(2).add(incr8).add(incr9).add(incr7);           
in8=BigInteger.ONE.add(incr8).add(incr9);            
in9=incr9;                        
incr1=in1;incr2=in2;incr3=in3;incr4=in4;incr5=in5;                        
incr6=in6;incr7=in7;incr8=in8;incr9=in9;                        
           res=res.add(incr1).add(incr2).add(incr3).add(incr4).add(incr5).add(incr6).add(incr7).add(incr8).add(incr9).add(decr1).add(decr2).
		  add(decr3).add(decr4).add(decr5).add(decr6).add(decr7).add(decr8).add(decr9);
 ar[i]=res;       }
  return rs; 
}
    public static void main(String[] args) {
        int numb1=0; 
        int numb; 
       numb1=calculate();
 Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
    for(int i=0;i<n;i++){numb=scan.nextInt();System.out.println(ar[numb].mod(BigInteger.valueOf(1000000007))); }
    scan.close();                    
    }
}
