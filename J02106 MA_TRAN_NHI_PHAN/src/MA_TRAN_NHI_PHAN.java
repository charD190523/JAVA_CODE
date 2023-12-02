import java.util.Scanner;
public class MA_TRAN_NHI_PHAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [][] a = new int [n][3];
        int cnt = 0;
        for (int i=0; i<n; i++) {
            int num0=0; 
            int num1 = 0;
            for (int j=0; j<3; j++) {
                a[i][j] = sc.nextInt();
                if (a[i][j]==1) num1++;
                else num0++;
            }
//            System.out.println(num1 + " " + num0);
            if (num1 > num0) cnt++;
        }
        System.out.println(cnt );
    }
}
