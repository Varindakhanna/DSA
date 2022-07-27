import java.util.Arrays;

public class july_27 
{
    public static void main(String[] args)
     {
        int a[]={1,10,12,9,3,2};
          int k=6;

        while(check(a, k))
        {
            smallest(a, k);

        }


        
    }

    static void smallest(int a[],int k)
    {
        int n=a.length;

        Arrays.sort(a);
        int c=a[0]+a[1];
        
       



    }

     static boolean check(int a[],int k)

    {
        int i,flag=0;
        for(i=0;i<a.length;i++)
        {
            if(a[i]<k)
            {
                flag=1;
            }
        }

        if(flag==1)
        return true;

        else
        return false;

        
    }
    
}
