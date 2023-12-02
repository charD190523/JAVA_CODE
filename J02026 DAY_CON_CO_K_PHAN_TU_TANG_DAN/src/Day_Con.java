
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Day_Con {
    public static int n,k;
    public static Integer [] a = new Integer [20];
    public static Integer [] b = new Integer [20];
    
    public static void Try(int i) {
        for (int j = b[i-1]+1; j<=n; j++) {
            b[i] = j;
            if (i == k) {
                for (int m=1; m<=k; m++) {
                    System.out.print(a[b[m]] + " ");
                }
                System.out.println("");
            }
            else Try(i+1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            k = sc.nextInt();
            for (int i=1; i<=n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a,1,n+1);
            b[0] = 0;
            Try(1);
        }
    }
}
