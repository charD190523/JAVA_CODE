
import java.util.Scanner;


public class USCLN {
    
    public static int lcm (int a, int b) {
        int num1 = a, num2 = b;
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return (num1*num2)/a;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int [] a = new int [n];
            int [] b = new int [n+1];
            for (int i=0; i<n; i++) {
                a[i] = sc.nextInt();
            }
            b[0] = a[0];
            b[n] = a[n-1];
            for (int i=1; i<n; i++) {
                b[i] = lcm(a[i-1],a[i]);
            }
            for (int i=0; i<=n; i++) {
                System.out.print(b[i] + " ");
            }
            System.out.println("");
        }
    }
}
