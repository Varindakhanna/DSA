import java.math.BigInteger;

public class stringswithnumber
{
    public static void main(String[] args) 
    {
        String ans="xyxapesj00047519742156243264036";
        int l=ans.length(); 
        int i;
       
        for (i = 0; i < l; i++)
         {
            int ch=ans.charAt(i);
            if(ch>=97&&ch<=122)
            {

            }
            else
            {
                break;
            }            
         }

         String s=ans.substring(0,i);
         int ans2=s.length();
         String s2=ans.substring(i);
         int l2=s2.length();
         System.out.println(l2);

         //long number =  Long(s2).longValue();
        float l3= Float.parseFloat(s2);
         System.out.println(l3);

        //  System.out.println(n);
        
        // if(n==ans2)
        // {
        //     System.out.println(1);
        // }
        // else{
        //     System.out.println(0);
        // }
       
        
    }
}