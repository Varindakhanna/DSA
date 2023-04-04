package accenture;

import java.util.Scanner;

public class palindrome 
{
    public static void main(String[] args) 
    {
        

        int n=100;
        int m=200;
        int i ;
        for(i=n;i<=m;i++)
        {
            if(reverse(Integer.toString(i)))
            {
                System.out.print(i+" ");

            }

        }
    }

    static boolean reverse(String str)
    {

        StringBuffer sb = new StringBuffer(str);

        sb.reverse();

        //System.out.println(sb);

        if(str.contentEquals(sb))
        
        return true;

        else
        return false;
        
        

    }

    
}
