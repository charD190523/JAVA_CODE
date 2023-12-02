import java.util.Scanner;
public class USNTLN {
    public static long solve(long n) {
        long res = 0;
        for (int i=2; i<=Math.sqrt(n); i++) {
            boolean check = false;
            while (n % i == 0) {
                check = true;
                n/=i;
            }
            if (check) res = i;
        }
        if (n>1) res = n;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            System.out.println(solve (n));
        }
    }
}
