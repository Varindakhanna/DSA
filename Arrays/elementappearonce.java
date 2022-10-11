public class elementappearonce {
    public static void main(String[] args) {
        int a[] = { 2 };
        int n = a.length;
        int i, temp = 0;

        if (n == 1) {
            temp = a[0];
        }

        else {

            for (i = 0; i < n - 1; i++) {
                // System.out.println(i);
                if (a[i] == a[i + 1]) {
                    i++;
                }

                else {
                    temp = a[i];

                }

            }

            if (a[n - 1] != a[n - 2]) {
                temp = a[n - 1];
            }

         

        }
        System.out.print(temp);

    }

}
