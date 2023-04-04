package accenture;

public class replace_characters 
{
     public static void main(String[] args) 
     {
        String str="apples";
        
        char ch1='a';
        char ch2='p';
      

        int i;
        int n=str.length();
        StringBuffer sb = new StringBuffer(str);
        for(i=0;i<n;i++)
        {
            System.out.println("Iteration number" + i);
            // if( str.charAt(i)==ch1 || str.charAt(i)==ch2 )
            // {
                if(str.charAt(i)==ch2)
                {
                    System.out.println("Inside the if statement");

                    
                    sb.setCharAt(i,ch1);
                
                    System.out.println(str);
                    
                }

                else if(str.charAt(i)==ch1)
                {
                    System.out.println("inside the else");
                    sb.setCharAt(i,ch2);
                    System.out.println(str);
                    
                }
            
           // }
            
        }

        System.out.println(sb);

     }
    
}
