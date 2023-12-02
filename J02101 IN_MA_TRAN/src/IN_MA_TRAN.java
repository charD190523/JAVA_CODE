import java.util.Scanner;
public class IN_MA_TRAN {
    public static void print (int a[][], int n) {
        int i = 0;
        int j = 0;
        int trai = 1;
        while (true) {
            if (trai == 1) {
                System.out.print(a[i][j] + " ");
                j++;
                if (j>n-1) {
                    i++;
                    trai = 0;
                    j=n-1;
                }
            }
            else {
                System.out.print(a[i][j] + " "); 
                j--;
                if (j<0) {
                    i++;
                    trai = 1;
                    j=0;
                }
            }
            if (i==n) break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int [][] a = new int [n+5][n+5];
            for (int i=0; i<n; i++) {
                for (int j=0; j<n; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            print(a,n);
            System.out.println();
        }
    }
}
