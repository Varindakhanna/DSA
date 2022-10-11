
import java.util.HashSet;

public class target_sum {

    public static void main(String[] args)
    {
        // non repeating elements 
        int a[]={ 1,5,7};
        int sum = 6;

        int c=check(a, sum);
        System.out.println(c);
        //System.out.println( check(a, sum) );
    }
    
    static int check(int a[],int targetsum)
    {
        int c=0;
        HashSet<Integer> hs=new HashSet<>();
        
        for(int i=0; i<=a.length-1; i++)
        {
            hs.add(a[i]);
        }
        
        for(int i=0;i<a.length;i++)
        {
            if(targetsum-a[i]==a[i])
            {
                // do nothing
            }
            else
            {
                if(hs.contains(targetsum-a[i]))
                {
                    c++;
                   System.out.println(c);
                   // System.out.print(a[i]+" ");
                    //return targetsum-a[i];
                }
            }
        }
        
        return c;
        
    }
}
    

