package general;

import java.util.*;
import java.util.Arrays;

public class practise 
{
    public static void main(String[] args) 
    {
        // reverse an array
        // int a[]={10,20,30,40,50};
        // int start=0,temp;
        // int end=a.length-1;

        // while(start<end)
        // {
        //     temp=a[start];
        //     a[start]=a[end];
        //     a[end]=temp;

        //     start++;
        //     end--;
        // }

        // System.out.println(Arrays.toString(a));
     
        //kth rotate
        // int a[]={10,20,30,40,50,60,70,80,90,100};
        // int k=3,n=a.length;

        // int b[]=new int[k];
        // int i;

        // for(i=0;i<k;i++)
        // {
        //     b[i]=a[n-(k-i)];
        // }
       
        // int j;
        // for(j=n-k-1;j>=0;j--)
        // {
        //     a[j+3]=a[j];
        // }

        // for(i=0;i<k;i++)
        // {
        //     a[i]=b[i];
        // }
        // System.out.println(Arrays.toString(a));

    //merge 2 arrays
    int a[]={10,20,30,40};
    int b[]={50,60,70};
    int n=a.length;
    int m=b.length;

    int i;
    int c[]=new int[m+n];

    for(i=0;i<(m+n);i++)
    {
        if(i<n)
        {
            c[i]=a[i];
        }
        else
        {
            c[i]=b[i-n];
        }
    }

    System.out.println(Arrays.toString(c));


    }
    
}
