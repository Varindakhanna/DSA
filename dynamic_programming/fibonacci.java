package dynamic_programming;
import java.util.*;
public class fibonacci 
{
    static long dp[];
    public static void main(String[] args) 
    {
        int n=49;
        dp = new long[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fibo(n));
        
    }

    static long fibo(int n)
    {
        //top down approach

        // if(dp[n]!=-1)
        // {
        //     return dp[n];
        // }

        // else
        // {
        //     if(n==1)
        //     {
        //     return dp[n]=0;
        //     }
        //     else if(n==2)
        //     {
        //         return dp[n]=1;
        //     }
        //     else
        //     {
        //         return dp[n]=fibo(n-1)+fibo(n-2);
        //     }

        // }
        

        //Bottom-down approach
        dp[0]=0;
        dp[1]=1;
        for (int i = 2; i <=n; i++)
         {
            dp[i]=dp[i-1]+dp[i-2];
            
        }
        return dp[n];
       
           
        
    }
    
}
