import java.util.Scanner;
public class CheckFB {
    
    public static void main(String[] args) {
        long [] f = new long [100];
        f[0] = 0;
        f[1] = 1;
        for (int i=2; i<100; i++) {
            f[i] = f[i-1] + f[i-2];
        }
        
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            for (long i : f) {
                if (i == n) {
                    System.out.println("YES");
                    break;
                }
                else if (i > n ) {
                    System.out.println("NO");
                    break;
                }
            }
        }
    }
}

