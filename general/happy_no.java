import java.util.HashSet;

public class happy_no
{
    public static void main(String[] args) 
    {
       

        int n = 4;
        if (isHappyNumber(n))
            System.out.println(n +
            " is a Happy number");
        else
            System.out.println(n +
            " is not a Happy number");
       // System.out.println(k);
        

    }

    static boolean isHappyNumber(int n) 
    {
        HashSet<Integer> st = new HashSet<>();
        while (true)
         {
            n = cal(n);
            if (n == 1)
                return true;
            if (st.contains(n))
                return false;
            st.add(n);
        }
    }

    static int cal(int n)
    {
        int sum=0,r;
        while(n>0)
        {
            r=n%10;
           // System.out.println(r);
            sum=sum + (r*r);
            n=n/10;
        }
        return sum;

    }
}