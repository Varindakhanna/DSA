package algos;
import java.util.*;

public class Kadane 
{
    public static void main(String[] args) 
    {
        int a[] = new int[7]; 
 
        randomfill(a);
        
        System.out.println(Arrays.toString(a));
        
        max_sum_subarray(a);
    }
     
    static void randomfill(int a[])
    {
        int L=-5, U=10;
        
        for(int i=0; i<a.length; i++)
        {
            a[i] = (int)(L+(U-L)*Math.random());
        }
    }
    
    static void max_sum_subarray(int a[])
    {
        int i, temp_sum=0, maxsum=Integer.MIN_VALUE;
        
        for(i=0; i<a.length; i++)
        {
            temp_sum = temp_sum +a[i];
            
            if(temp_sum>maxsum)
            {
                maxsum = temp_sum;
            }
            
            if(temp_sum<0)
            {
                temp_sum = 0;
            }
        }
        
        System.out.println("max sum : "+maxsum);
    }
    
}
