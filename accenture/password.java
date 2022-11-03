package accenture;

public class password 
{
    public static void main(String[] args)
     {
        String str="aA1_67";

        int c=str.length();
        if(c<4)
        {
            System.out.println("Invalid password");
        }

        //one numeric
        int i,count=0, ch=0;
        for(i=0;i<c;i++)
        {
            ch= (int )str.charAt(i);
            if(ch>=48 && ch<=57)
            {
                count++;

            }
        }
        if(count>=1)
        {
            System.out.println("Valid password" +count);
        }

        //one capital letter

        int j,count2=0,ch2;
        for(j=0;j<c;j++)
        {
            ch= (int )str.charAt(j);
            if(ch>=65 && ch<=90)
            {
                count2++;
            }
        }
        if(count2>=1)
        {
            System.out.println("Valid password" +count2);
        }

        //no space

        if(str.contains(" ")||str.contains("/"))
        {
            System.out.println("invalid");
        }

        //starting no number

        int ch3=(int) str.charAt(0);
        
        if(ch3>=48 && ch3<=57)
        {
         System.out.println("Invalid password");

        }
        
        



      


        
    }
    
}
