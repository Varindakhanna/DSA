package Patterns;

public class Pattern3_imp {

    public static void main(String[] args) {
        int i, j;
        int n = 4;

        // for(i=1;i<=n;i++)
        // {
        // int k=i;
        // for ( j = 1; j <= i; j++)
        // {
        // System.out.print(k);
        // k++;

        // }
        // System.out.println();

        // }

        // 2nd method

        for (i = 1; i <= n; i++)

        {
            for (j = i; j <i*2 ; j++) {
                System.out.print(j);

            }
            System.out.println();
        }

    }

}
