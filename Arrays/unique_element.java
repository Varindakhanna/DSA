import java.util.Arrays;

public class unique_element 
{
    public static void main(String[] args) 
    {
        int a[] = {2,4,7,2,7};
       
        int i,n=a.length,ans=0;
        for(i=0;i<n;i++)

        {
            ans = ans^a[i];
            

        }

        System.out.println(ans);
    }

}
