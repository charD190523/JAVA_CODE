import java.util.Scanner;
public class UC {
    public static int gcd (int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int [][] a = new int [n][m];
            for (int i=0; i < n; i++) {
                for (int j=0; j <m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                int sum = a[i][0];
                for (int j = 1; j < m; j++) {
                    sum = gcd (sum, a[i][j]);
                }
                System.out.print(sum + " ");
            }
            System.out.println("");
        }
    }
}
