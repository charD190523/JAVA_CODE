
import java.util.Scanner;

public class Day_Con {

    public static void check(long[] a, long x) {
        int l = 0;
        int r = 0;
        long sum = 0;
        int cnt = 0;
        if (x < 0 ) {
            System.out.println("NO");
            return;
        }
        while (r < a.length) {
            while ((sum < x || cnt == 0) && r < a.length) {
                sum += a[r];
                cnt ++;
                r++;
            }
            while (sum > x) {
                sum -= a[l];
                cnt --;
                l++;
            }
            if (sum == x && cnt > 0) {
                System.out.println("YES");
                return;
            }
//            else if (r >= a.length) break;
        }
        System.out.println("NO");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            check(a,k);
        }
    }
}
