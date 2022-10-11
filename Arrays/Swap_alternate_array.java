public class Swap_alternate_array 
{
    public static void main(String[] args) 
    {
        int a[]={1};
        swap_alternate(a);
        int i;
        for(i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }


        
    }

    static void swap_alternate(int a[])
    {
        int i,temp;
        for(i=0;i<a.length-1;i+=2)
        {
            temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;

        }
    }
    
}
