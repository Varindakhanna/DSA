import java.util.Arrays;

public class reverse
 
{
    public static void main(String[] args)
     
    {
        int a[]={1,2,3,4};
        int n=a.length;
        get_reverse(a,n);
        System.out.println(Arrays.toString(a));
    }
    
    static void get_reverse(int a[],int n)
    {
        int i,flag;
        for(i=0;i<n/2;i++)
        {
            flag=a[i];
            a[i]=a[n-1-i];
            a[n-1-i]=flag;
        }

        

    }
}
