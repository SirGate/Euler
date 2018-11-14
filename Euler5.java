import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
static long[][] res = new long[41][6];
  
    private static int calculate(){
    int k;
        res[2][2]=1;
   for(int i1=1;i1<41;i1++){res[i1][1]=1;}    
   for(int i=3;i<41;i++){if(i%2==0){k=i/2;res[i][2]=res[k][2];res[i][2]++;
                                    res[i][3]=res[k][3];res[i][4]=res[k][4];res[i][5]=res[k][5];
                                    res[i][1]=res[i-1][1];
                                        if(res[i][3]<res[i-1][3]){res[i][3]=res[i-1][3];}
                                        if(res[i][2]<res[i-1][2]){res[i][2]=res[i-1][2];}
                                        if(res[i][4]<res[i-1][4]){res[i][4]=res[i-1][4];}
                                        if(res[i][5]<res[i-1][5]){res[i][5]=res[i-1][5];}
                                        res[i][1]=res[i-1][1];   
                                   }
                                    
                         else if(i%3==0){k=i/3;res[i][3]=res[k][3];res[i][3]++;
                                                    res[i][2]=res[k][2];res[i][4]=res[k][4];res[i][5]=res[k][5];
                                        if(res[i][3]<res[i-1][3]){res[i][3]=res[i-1][3];}
                                        if(res[i][2]<res[i-1][2]){res[i][2]=res[i-1][2];}
                                        if(res[i][4]<res[i-1][4]){res[i][4]=res[i-1][4];}
                                        if(res[i][5]<res[i-1][5]){res[i][5]=res[i-1][5];}
                                        res[i][1]=res[i-1][1];}
                         
                         else if(i%5==0){k=i/5;res[i][4]=res[k][4];res[i][4]++;
                                                    res[i][2]=res[k][2];res[i][3]=res[k][3];res[i][5]=res[k][5];
                                               if(res[i][3]<res[i-1][3]){res[i][3]=res[i-1][3];}
                                        if(res[i][2]<res[i-1][2]){res[i][2]=res[i-1][2];}
                                        if(res[i][4]<res[i-1][4]){res[i][4]=res[i-1][4];}
                                        if(res[i][5]<res[i-1][5]){res[i][5]=res[i-1][5];}
                                        res[i][1]=res[i-1][1];}
                         
                         else if(i%7==0){k=i/7;res[i][5]=res[k][5];res[i][5]++;
                                                    res[i][2]=res[k][2];res[i][3]=res[k][3];res[i][4]=res[k][4];
                                        if(res[i][3]<res[i-1][3]){res[i][3]=res[i-1][3];}
                                        if(res[i][2]<res[i-1][2]){res[i][2]=res[i-1][2];}
                                        if(res[i][4]<res[i-1][4]){res[i][4]=res[i-1][4];}
                                        if(res[i][5]<res[i-1][5]){res[i][5]=res[i-1][5];} 
                        res[i][1]=res[i-1][1];
                                        }
                         else{res[i][1]=res[i-1][1]*i;
                             res[i][3]=res[i-1][3];
                              res[i][2]=res[i-1][2];
                              res[i][4]=res[i-1][4];
                              res[i][5]=res[i-1][5];}
                        }
return 5;    
}
    public static void main(String[] args) {
       long result = 0;
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        result=calculate();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
    result=(long)Math.pow(2,res[n][2])*(long)Math.pow(3,res[n][3])*(long)Math.pow(5,res[n][4])*(long)Math.pow(7,res[n][5])*res[n][1];
            System.out.println(result);
        }
   }
}
