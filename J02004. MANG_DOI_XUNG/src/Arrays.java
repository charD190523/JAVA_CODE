import java.util.Scanner;
public class Arrays {
    public static void check (int [] a) {
        for (int i=0; i<a.length; i++) {
            if (a[i] != a[a.length - i -1]) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int [] a = new int [n];
            for (int i=0; i<n; i++) {
                a[i] = sc.nextInt();
            }
            check(a);
        }
    }
}
