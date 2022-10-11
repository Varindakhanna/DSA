import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;

public class find_duplicates {

    public static void main(String[] args) 
    {
        int a[] = { 13 ,9, 25, 1, 1, 0, 22, 13, 22, 20, 3 ,8 ,11, 25, 10, 3 ,15, 11, 19, 20, 2 ,4 ,5, 14, 23, 14};
        int n = a.length;

        ArrayList<Integer> al =new ArrayList<Integer>();

     

        //System.out.println(al);

       // int b[] = new int[n];
        // a = [10,10,10,20,20,30];

        int i, j;

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        System.out.println(al);

        

        for (i = 0; i < n; i++) 
        {
            int flag2 = 0;

            for (j = i + 1; j < n ; j++) 
            {
                // this is duplicate mate
                if (a[i] == a[j])    // 10 10 10 20 20 20 30 
                {
                    // i=j+1;
                    // break;

                    if (flag2 == 0)
                     {
                        al.add(a[i]);
                      
                        flag2 = 1;

                    }

                } else 
                {
                    i = j-1;
                    break;
                }
                
            }


        }

        if(al.isEmpty())
        {
            al.add(-1);
        }
        

        System.out.println(al);

    }
}