import java.util.Scanner;
public class Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            int cnt = 0;
            for (int i=1; i<=Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if (i % 2 ==0) {
                        cnt++;
                    }
                    if ((n/i) % 2 == 0 && i*i != n) {
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
