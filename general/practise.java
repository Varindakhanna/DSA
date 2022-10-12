package general;

import java.util.*;

public class practise {
    public static void main(String[] args) {
        // reverse an array
        // int a[]={10,20,30,40,50};
        // int start=0,temp;
        // int end=a.length-1;

        // while(start<end)
        // {
        // temp=a[start];
        // a[start]=a[end];
        // a[end]=temp;

        // start++;
        // end--;
        // }

        // System.out.println(Arrays.toString(a));

        // kth rotate
        // int a[]={10,20,30,40,50,60,70,80,90,100};
        // int k=3,n=a.length;

        // int b[]=new int[k];
        // int i;

        // for(i=0;i<k;i++)
        // {
        // b[i]=a[n-(k-i)];
        // }

        // int j;
        // for(j=n-k-1;j>=0;j--)
        // {
        // a[j+3]=a[j];
        // }

        // for(i=0;i<k;i++)
        // {
        // a[i]=b[i];
        // }
        // System.out.println(Arrays.toString(a));

        // merge 2 arrays
        // int a[]={10,20,30,40};
        // int b[]={50,60,70};
        // int n=a.length;
        // int m=b.length;

        // int i;
        // int c[]=new int[m+n];

        // for(i=0;i<(m+n);i++)
        // {
        // if(i<n)
        // {
        // c[i]=a[i];
        // }
        // else
        // {
        // c[i]=b[i-n];
        // }
        // }

        // System.out.println(Arrays.toString(c));

        // find the missing number
        // int a[]={1,2,3,4,5,6,7,8,7,9};

        // int n=a.length;
        // int ans= missing_no(a,n);

        // System.out.println(ans);

        // }

        // static int missing_no(int a[],int n)
        // {
        // int b[]=new int[n+1];
        // int i,j,ans=0;

        // for(i=0;i<n;i++)
        // {
        // j=a[i];
        // b[j]=++b[j];
        // }

        // for(i=1;i<b.length;i++)
        // {
        // if(b[i]==0)
        // {
        // ans=i;
        // }
        // }
        // System.out.println(Arrays.toString(b));

        // return ans;

        // MATRICES

        int a[][] = new int[4][4];

        Scanner sc = new Scanner(System.in);

        int i, j;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i <4; i++) {
            for (j = 0; j < 4; j++) {
               
                    System.out.print(a[i][j]);
                 
                    System.out.print(" ");
                

            }

            System.out.println();
        }

        horizontal(a);

    //     sorting(a);

    //     // sort the matrix

    // }

    // static void sorting(int a[][])
    // {
    //     int i,j,k=0,l=0;
    //     int b[]=new int[9];

    //     for(i=0;i<3;i++)
    //     {
    //         for(j=0;j<3;j++)
    //         {
    //             b[k]=a[i][j];
    //             k++;

    //         }
    //     }

    //     Arrays.sort(b);

    //     for(i=0;i<3;i++)
    //     {
    //         for(j=0;j<3;j++)
    //         {
    //             a[i][j]=b[l];
    //             l++;
    //         }
    //     }
    //     for(i=0;i<3;i++)
    //     {
    //         for(j=0;j<3;j++)
    //         {
    //                 System.out.print(a[i][j]);
              
    //         }

    //     System.out.println();

    //    }

     
    }

    // static void horizontal(int a[][])
    // {
    //     int i,j;
    //     int n=a.length,m=a[0].length;
    //     for(i=0;i<n;i++)
    //     {

    //         if(i%2==0)
    //         {
    //             for(j=0;j<m;j++)
    //             {
    //                 System.out.print(a[i][j]);
    //             }
                

    //         }

    //         else{
    //             for(j=m-1;j>=0;j--)
    //             {
    //                 System.out.print(a[i][j]);
    //             }
    //         }

    //         System.out.println(" ");
    //     }
    // }


    
}
