package accenture;

public class carrycount
 {
    public static void main(String[] args) 
    {
        int sum=0,carry=0,count=0;
        int n1=451;
        int n2=359;

        int i=0;
        for(i=1;i<3;i++)
        {
            int r=n1%10;
            n1=n1/10;
            
            int r2=n2%10;
            n2=n2/10;

            sum=sum+r+r2+carry;
            if(sum>9)
            {
                count++;

                carry=1;

            }

            else{
                carry=0;
            }
        }
        
        System.out.println(count);


    }


        


        
    }
    

