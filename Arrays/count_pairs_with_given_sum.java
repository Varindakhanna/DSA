import java.util.Arrays;
import java.util.HashSet;

public class count_pairs_with_given_sum 
{
    public static void main(String[] args)
     
    
    {
        int a[]={1,5,7,1};
        int n=a.length;
        int i=0,j,c=0;
        int targetsum=6;
        Arrays.sort(a);
        // HashSet<Integer> hs = new HashSet<>();

        // for(int p:a)
        // {
        //     hs.add(p);
        // }

        //System.out.println(hs);

        while(i<n-1)
        {
            if(a[i]+a[i+1]==targetsum)
            {
                c++;
                i++;
            }

            if(a[i]+a[i+1]>targetsum)
            {
                
                
            }

            if(a[i]+a[i+1]<targetsum)
            {
                
                i++;
            }
        }

        
        
        
        System.out.println(c);
    }
    
}
