import java.util.Arrays;

public class rotate
 {

    public static void main(String[] args) 
    {
        int a[]={10,20,30,40};
        int n=4;
        int k=2;
        int index=k-1;

        reverse(a,0,k-1);
        reverse(a, k, n-1);
        reverse(a, 0, n-1);

      System.out.println(Arrays.toString(a));


        
    }
    
    static void reverse(int arr[], int start, int end)
    {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
  
}
