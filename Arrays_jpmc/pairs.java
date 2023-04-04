import java.util.Arrays;

public class pairs 
{
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        get_pairs(a);
    }

    static void get_pairs(int a[])
    {
        int n=a.length;
        int i,j,k=0;
        int size=(n*(n-1))/2;
        int b[]=new int[size];
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                String ch1=Integer.toString(a[i]);
                String ch2=Integer.toString(a[j]);
                String ans=ch1+ch2;               
                b[k]=Integer.parseInt(ans);
                k++;
            }
        }

        System.out.println(Arrays.toString(b));

    }
    
}
