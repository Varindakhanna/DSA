import java.util.Arrays;

public class alternatepositiveandnegative
 {
    public static void main(String[] args)
     {
        int a[] = {93, 85, -59, 45, -89 ,-41 ,-4 ,-98 ,79, -12};
        int i,j=0,k=0;
        int n = a.length;
        int countp=0,countb=0;

        int p[] = new int[n];

        int b[] = new int[n];

        for (i = 0; i < n; i++)
         {

            if (a[i] < 0) 
            {
                
                    b[j] = a[i];
                    j++;
                    countb++;

            }

            else
            {
                p[k]=a[i];
                k++;
                countp++;

            }

        }

        System.out.println(countb);
        System.out.println(countp);

        System.out.println(Arrays.toString(p));
        System.out.println(Arrays.toString(b));

        int x=0,y=0;

        if(countb==n || countp==n)
        {
            System.out.println(Arrays.toString(a));
        }

        else{

        
        for (int m = 0; m< n; m++)
         {
            if(m%2==0 && countb<=0)
            {
                countp--;
                a[m]=p[x];
                x++;
               
                
            }
            else if(m%2!=0 && countp<=0)
            {
                countb--;
                    a[m]=b[y];
                    y++;
                    
                }
              
                System.out.println("THe valu eof the "+countp + "THe value of the ne"+countb);
            }
          System.out.println(Arrays.toString(a));
        
        }
       }

       

}
