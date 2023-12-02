import java.util.Scanner;
public class EQUAL { 
    public static Scanner sc = new Scanner (System.in);
    public static void testcase (int n) {
        int [] a = new int [n];
        long sum = 0;
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        
        long sum1 = 0;
        for (int i=1; i<n; i++) {
            sum1 += a[i-1];
            if (sum1 == (sum-sum1-a[i])) {
                System.out.printf("%d\n",i+1);
                return;
            }
            if (i==n-1) {
                System.out.println(-1);
                return;
            }
        }
    
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            testcase (n);
        }
    }
}
