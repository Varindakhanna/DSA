package accenture;
import java.util.*;

public class autobiographical_no
 {
    public static void main(String[] args) 
    {
        String str="1210";
        int n=str.length();
        int sum= 0;

        int i;
        for(i=0;i<n;i++)
        {
            sum=sum+ Character.getNumericValue(str.charAt(i));

        }
        System.out.println(sum);

        if(sum==n)
        {
            System.out.println("autobiography");
        }


    }
    
}
