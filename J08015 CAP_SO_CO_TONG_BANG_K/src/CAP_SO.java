
import java.util.Arrays;
import java.util.Scanner;


public class CAP_SO {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long [] a = new long [n];
            for (int i=0; i<n; i++) {
                a[i] = sc.nextLong();
            }
            Arrays.sort(a);
//            for (int i=0; i<n-1; i++) {
//                for (int j=i+1; j<n; j++) {
//                    if (a[i]+a[j]==k) {
//                        cnt++;
////                        break;
//                    }
//                    else if (a[i] + a[j] > k) {
//                        break;
//                    }
//                }
//            }
            long cnt = 0;
            for (int i=0; i<n-1; i++) {
                long up = upper_bound(a, i+1, n-1, k-a[i]);
                long down = lower_bound(a, i+1, n-1, k-a[i] );
                if (down <= n-1) {
                    cnt += up - down + 1;
                }
//                System.out.println(up + " " + down);
                
            }
            System.out.println(cnt);
        }
    }
    public static long upper_bound(long a[], int l, int r, long x) {
        long ans = r+1;
        while (l <= r) {
            int m = (l+r)/2;
            if (a[m] == x) {
                ans = m;
                l = m+1;
            }
            else if (a[m] > x) r = m-1;
            else l = m + 1;
        }
        return ans;
    }
    
    public static long lower_bound(long [] a, int l, int r, long x) {
        long ans = r+1;
        while (l <= r) {
            int m = (l + r) /2;
            if (a[m] == x) {
                ans = m;
                r = m-1;
            }
            else if (a[m] > x) r = m - 1;
            else l = m + 1;
        }
        return ans;
    }
}
