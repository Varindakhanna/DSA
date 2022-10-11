

import java.util.Arrays;

public class Reverse_array {

    public static void main(String[] args) 
    {
        int a[]={10,20,30,40};
        reverse(a);
        System.out.println(Arrays.toString(a));

        
    }

    static void reverse(int a[])
    {
        int i;int temp;
        int n=a.length;
        System.out.println(n);
        for(i=0;i<n;i++)
        {
            temp=a[i];
            a[i]=a[(n-1)-i];
            a[(n-1)-i]=temp;

        }
    }
    
}
