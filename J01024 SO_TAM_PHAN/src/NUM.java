
import java.util.Scanner;

public class NUM {

    public static void solve(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '3') {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            solve (s);
        }
    }
}
