package accenture;

public class nbase 
{
    public static void main(String[] args) 
    {
        int n=5678;
        int div=21;
        int r=0;
        String ans="";
        
        while(n!=0)
        {
            r=n%div;
            if(r>9)
            {
                ans=(char) (r - 9 + 64)+ans;

            }

            else
            {
                ans= r+ans;
            }
            
            n=n/div;
        }

        System.out.println(ans);
        
    }

    
}
