public class robhouses
{
    public static void main(String[] args) 
    {
        int n=5;
        int a[]={10,20,30,40,50};

        System.out.println(robhouses(a,n));
           
        
    }

    static int robhouses(int a[],int n)
    {
        if(n==0)
        {
            return 0;
        }

        if(n==1)
        {
            return a[0];
        }

        else
        {
            int index=n-1;
            int ans=a[index];
            int max=Integer.MIN_VALUE;

            int j;

            for (j = 2; j <= index; j++) 
            {
                int temp=robhouses(a, n-j);

                if(temp>max)
                {
                    max=temp;
                }
                
            }
            ans=ans+max;

            //not include
            int temp2=robhouses(a, n-1);

            return Math.max(ans, temp2);

        }
        
    }
    
}
