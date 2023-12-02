
import java.util.Scanner;


public class QUAY_PHAI {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long [] a = new long [n];
            for (int i=0; i<n; i++) {
                a[i] = sc.nextLong();
            }
            long min = Long.MAX_VALUE;
            int index = -1;
            for (int i=0; i<n; i++) {
                if (a[i]<min) {
                    min = a[i];
                    index = i;
                }
            }
            System.out.println(index);
        }
    }
 
}
