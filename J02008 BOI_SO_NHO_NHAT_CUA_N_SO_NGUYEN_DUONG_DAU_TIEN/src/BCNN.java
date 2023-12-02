import java.util.Scanner;
public class BCNN {
    public static long gcd (long a, long b) {
        while (b!=0) {
            long x = a % b;
            a = b;
            b = x;
        }
        return a;
    }
    public static long lcm (long a, long b) {
        return a*b/gcd(a,b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long bcnn = 1;
            for (int i=2; i<=n; i++) {
                bcnn = lcm (bcnn, i);
            }
            System.out.println(bcnn);
        }
    }
}
