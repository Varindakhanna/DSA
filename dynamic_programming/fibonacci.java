package dynamic_programming;
import java.util.*;
public class fibonacci 
{
    static long dp[];
    public static void main(String[] args) 
    {
        int n=50;
        dp = new long[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fibo(n));
        
    }

    static long fibo(int n)
    {
        if(dp[n]!=-1)
        {
            return dp[n];
        }

        else
        {
            if(n==1)
            {
            return dp[n]=0;
            }
            else if(n==2)
            {
                return dp[n]=1;
            }
            else
            {
                return dp[n]=fibo(n-1)+fibo(n-2);
            }

        }
        
    }
    
}
