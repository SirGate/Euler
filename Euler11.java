import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{ 
    
private static int resolve(int[][]grid,int i,int j){
    int result=0;
    int max=0;
  if(i<17){result=grid[i][j]*grid[i+1][j]*grid[i+2][j]*grid[i+3][j];
           if (result>max){max=result;}}
 if(j<17){result=grid[i][j]*grid[i][j+1]*grid[i][j+2]*grid[i][j+3];
           if (result>max){max=result;}}
 if((i<17)&&(j<17)){result=grid[i][j]*grid[i+1][j+1]*grid[i+2][j+2]*grid[i+3][j+3];
           if (result>max){max=result;}} 
 if((i>2)&(j<17)){result=grid[i][j]*grid[i-1][j+1]*grid[i-2][j+2]*grid[i-3][j+3];
           if (result>max){max=result;}} 
return max;}    

private static int solve (int[][] grid){
int result=0;
int max =0;
    for(int i=0;i<20;i++){
        for(int j=0;j<20;j++){result=resolve(grid,i,j);
                           if(result>max){max=result;}  
                             }
        
                         }
    return max;
}   
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] grid = new int[20][20];
        for(int grid_i=0; grid_i < 20; grid_i++){
            for(int grid_j=0; grid_j < 20; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
       System.out.println(solve(grid)); 
    }
}