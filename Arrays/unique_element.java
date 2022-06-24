package Arrays;

public class unique_element 
{
    public static void main(String[] args)
     {
        int a[]={5 ,3, 1, 5, 1, 3, 4, 7, 4, 8, 8 };
        int n,pos=0,i;
        for (i = 0; i < a.length; i++) 
        {
            n=a[i];
            
            
            if(linear_search(n,a,i)==0)
            {
               pos=i;
                break;
               
            }
        }

        System.out.println(a[pos]+"is unique");
        
        
    }

    // static int no(int n,int a[])
    // {
    //     if(linear_search(n, a)==1);
    //     {
    //         return 1;
    //     }

    // }

   static int linear_search(int n,int a[],int j)
    {
        int i,flag=0;
        for (i = j+1; i < a.length; i++) 
        {
            if(n==a[i])
            {
               flag=1;
            
               break;
               
            }
                        
        }

        if(flag==1)
        return 1;
        else
        return 0;

    }
    

}
