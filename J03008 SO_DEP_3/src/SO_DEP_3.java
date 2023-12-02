
import java.util.Scanner;

public class SO_DEP_3 {

    public static boolean checknt(int n) {
        if (n == 0 || n == 1) {
            return false;   
        }
        for (int i=2; i*i<=n; i++) {
            if (n%i==0) return false;
        }
        return true;
    }

    public static void testcase(String s) {
        int n = s.length();
        for (int i=0; i<n/2; i++) {
            if (!checknt(s.charAt(i)-'0') ||s.charAt(i)!=s.charAt(n-i-1)) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            testcase (s);
        }
    }
}
