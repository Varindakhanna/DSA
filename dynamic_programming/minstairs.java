
import java.util.Arrays;
import java.util.*;
 public class minstairs
 {
public static void main(String[] args) 
{
    /*package whatever //do not write package name here */


	    Scanner sc=new Scanner(System.in);
	    
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    int i;int temp;
	    for(i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }

	    
	    for(i=0;i<n/2;i++)
	    {
	        temp=a[i];
	        a[i]=a[n-1-i];
	        a[n-1-i]=temp;
	        
	    }
	    
	    System.out.println(Arrays.toString(a));
	    
		//code
	}

    
 }
