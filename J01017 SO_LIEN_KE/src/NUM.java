import java.util.Scanner;
public class NUM {
    public static void check (String s) {
        for (int i=1; i<s.length(); i++) {
            char x = s.charAt(i);
            char y = s.charAt(i-1);
            if (Math.abs(x-y)!=1) {
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
            check (s);
        }
    }
}
