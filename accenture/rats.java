package accenture;

public class rats 
{
    public static void main(String[] args)
     {
        int a[]={ 2 ,8 ,3 ,5, 7, 4, 1, 2};
        int unit=2;
        int r=7;
        int targetsum=r*unit;

        int i,sum=0,pos=0;

        for(i=0;i<a.length;i++)
        {
            sum=sum+a[i];
            if(sum>=targetsum)
            {
                pos=i;

                break;
            }

        }
        
        System.out.println(pos+1);
    }
    
}
