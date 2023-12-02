
import java.util.Scanner;

public class TICH_VOI_MA_TRAN_CHUYEN_VI_CUA_NO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int T = 1; T<=t; T++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[][] a = new int[n][m];
            int[][] b = new int[m][n];

            for (int i=0; i<n; i++) {
                for (int j=0; j<m; j++) {
                    a[i][j] = sc.nextInt();
                    b[j][i] = a[i][j];
                }
            }
            System.out.printf("Test %d:\n",T);
            for (int i=0; i<n; i++) {
                // so hang = so cot
                for (int j=0; j<n; j++) {
                    int [][] c = new int [n][n];
                    for (int k=0; k<m; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                    System.out.print(c[i][j] + " ");
                }
                System.out.println("");
            }
            
//            
        }

    }
}
