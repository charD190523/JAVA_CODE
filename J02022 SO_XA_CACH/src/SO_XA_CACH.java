import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;
public class SO_XA_CACH {
    public static Scanner sc = new Scanner (System.in);
    public static int [] a;
    public static int n;
    public static int check;
    
    public static void setUp () {
        for (int i=1; i<=n; i++) {
            a[i] = i;
        }
    }
    public static int checkXC (int [] a, int n) {
        for (int i=1; i<n; i++) {
            if (Math.abs(a[i]-a[i+1]) == 1) return 0;
        }
        return 1;
    }
    public static void hoanVi () {
        int j = n-1;
        while (a[j] > a[j+1]) j--;
        if (j==0) check = 0 ;
        else {
            int k = n;
            while (a[j] > a[k]) k--;
            int tmp = a[j];
            a[j] = a[k];
            a[k] = tmp;
            int dau = j+1;
            int cuoi = n;
            while (dau<=cuoi) {
                int res = a[dau];
                a[dau] = a[cuoi];
                a[cuoi] = res;
                
                dau++;
                cuoi--;
            }
        }
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0 ) {
            n = sc.nextInt();
//            int num = n+5;
            a = new int [n+5];
            setUp();
            check = 1;
            while (check == 1) {
                if (checkXC(a,n) == 1) {
                    for (int i=1; i<=n; i++) {
                        System.out.print(a[i]);
                    }
                    System.out.println();
                }
                hoanVi ();
            }
        }
//        n = sc.nextInt();
//        a = new int [100];
//        setUp();
//        for (int i=1; i<=n; i++)  {
//            System.out.print(a[i] + " ");
//        }
//        hoanVi ();
//        for (int i=1; i<=n; i++)  {
//            System.out.print(a[i] + " ");
//        }
    }
}
