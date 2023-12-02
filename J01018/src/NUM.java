import java.util.Scanner;
public class NUM {
    public static boolean numSum (String s) {
        int sum = 0;
        for (int i=0; i<s.length(); i++) {
            int a = s.charAt(i) -'0';
            sum += a;
        }
        if (sum % 10 == 0) return true;
        return false;
    }
    public static void solve (String s) {
        if (numSum(s) == false ) {
            System.out.println("NO");
            return;
        }
        for (int i=1; i < s.length(); i++) {
            char x = s.charAt(i);
            char y = s.charAt(i-1);
            if (Math.abs(x-y)!=2) {
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
            String s = sc.next();
            solve(s);
//            if (numSum (s)) System.out.println("OK");
        }
    }
}
