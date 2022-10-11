import java.util.Arrays;

public class countsmallerelements
 
{
    public static void main(String[] args)
     {        
        int a[]={12, 1, 2, 3, 0, 11, 4};
        int i;int c=0;
        int n =a.length;
        int count[]=new int[n];

        for(i=0;i<n;i++)
        {
            int temp=a[i];
          
            for (int j = i+1; j<n; j++) 
            {
                if(a[j]<temp)
                c++;
                
            }

           count[i]=c;
            c=0;
        }
        System.out.print(Arrays.toString(count));
        
    }
    
}
