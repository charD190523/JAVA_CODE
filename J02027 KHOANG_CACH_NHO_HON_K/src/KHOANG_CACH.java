
import java.util.Arrays;
import java.util.Scanner;


public class KHOANG_CACH {
    
    public static long bound (int [] a, int l, int r, int value) {
        long index = r+1;
        while (l <= r) {
            int m = (l+r)/2;
            if (a[m] == value ) {
                index = m;
                r = m-1;
            }
            else if (a[m] > value) r = m -1;
            else l = m+1;
            if (l>r && a[m] != value) index = l;
        }
        return index;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int [] a = new int [n];
            for (int i=0; i<n ;i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            long cnt = 0;
            for (int i=0; i<n-1; i++) {
//                System.out.println(a[i] + " " + (a[i]+k));
                long ans = bound(a,i+1,n-1, a[i]+k);
//                System.out.println(i + " " + ans);
                if (ans > n) continue;
//                System.out.println("-----------");
//                System.out.println(i + " " + ans);
                cnt += ans - i -1;
            }
            System.out.println(cnt);
        }
    }
}
