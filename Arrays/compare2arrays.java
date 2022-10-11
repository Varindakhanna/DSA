import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class compare2arrays 
{
    public static void main(String[] args)
     
    {
        
        int array[]={1,2,3,4,7,9};
        int array2[]={0,1,2,1,1,4};
        int n=array.length;
        int i;int c=0;

        int count[]=new int[n];
        for(i=0;i<n;i++)
        {
            int temp=array[i];

            for(int j=0;j<n;j++)
            {
                if(temp>=array2[j])
                {
                    c++;
                    //System.out.println(c);
                }

            }

            count[i]=c;
            c=0;
        }

        System.out.println(Arrays.toString(count));
        ArrayList<Integer> array_list = new ArrayList<Integer>();
  
        // Using Collections.addAll() method
        for(int p:count)
        {
            array_list.add(p);
        }
        System.out.print(array_list);
    }
        
}
    

