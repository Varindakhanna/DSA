import java.util.Arrays;

import javax.sound.sampled.SourceDataLine;

public class bytelandgoldcoin 
{

    static int dp[];
    public static void main(String[] args)
     {
        int n=12;
        

        dp=new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(getExchange(n));
        
    }

    static int getExchange(int n)
    {
        if(dp[n]!=-1)
        {
            return dp[n];

        }
        else
        {

        
        if(n==0)
        {
            return dp[n]=0;
        }

        else
        {
            int ans = getExchange(n/2)+getExchange(n/3)+getExchange(n/4);

            return dp[n]=Math.max(n, ans);
        }
    }
}
    

    
    
}
