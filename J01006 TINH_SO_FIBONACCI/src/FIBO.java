import java.util.Scanner;
public class FIBO {
    public static void main(String[] args) {
        long [] f = new long [100];
        f[1] = 1;
        f[2] = 1;
        for (int i=3; i<93; i++) {
            f[i] = f[i-1] + f[i-2];
        }
        
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(f[n]);
        }
    }
}

