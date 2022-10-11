import java.util.Arrays;
public class sort
 {
    public static void main(String[] args)
     {
        int a[]={2,1,0};
        int n=3;

        
           int mid=0,high=n-1,low=0;
           int temp;
           
           while(mid<=high)
           {
               if(a[mid]==0)
               {
                   temp=a[mid];
                   a[mid]=a[low];
                   a[low]=temp;
                   mid++;
                   low++;
               }
               
               else if(a[mid]==1)
               {
                   mid++;
                   
               }
               
               else if(a[mid]==2)
               {
                   temp=a[mid];
                   a[mid]=a[high];
                  a[high]=temp;
                   high--;
                   
               }
           
           }

           System.out.println(Arrays.toString(a));
        

     }

    
    
}
