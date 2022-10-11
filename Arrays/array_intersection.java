public class array_intersection

{
    public static void main(String[] args) {
        int a[] = { 10, 20, 30,90,60 };
        int b[] = { 50, 60, 10, 30,89,90 };
        int n = a.length;
        int n2 = b.length;
        int j, i, count = 0;
        // int c[]=new int[a.length];
      

            for (j = 0; j < n; j++) 
            {
                for (i = 0; i < n2; i++) 
                {
                    if (a[j] == b[i])
                     {
                        count++;
                    }
                }

            }
        

       

        System.out.println(count);

    }

}
