
import java.util.Scanner;

public class Analysis {

    public static void testcase(int n) {
        for (int i = 2; i <= n; i++) {
            int cnt = 0;
            while (n % i == 0) {
                cnt++;
                n /= i;
            }
            if (cnt > 0) {
                System.out.print(i + "(" + cnt + ")" + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            System.out.print("Test " + i + ": ");
            testcase(n);
            System.out.println();
        }
    }
}
