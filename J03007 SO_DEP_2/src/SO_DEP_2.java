
import java.lang.invoke.MethodHandles;
import java.util.Scanner;

public class SO_DEP_2 {

    public static void testcase(String s) {
        int n = s.length();
        boolean check = true;
        if (s.charAt(n - 1) != '8') {
            System.out.println("NO");
            return;
        }
        int sum = 0;
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                check = false;
                break;
            } else {
                if (i == n - i - 1) {
                    sum += (s.charAt(i) - '0');
//                    System.out.println("1. " + "sum+" + (s.charAt(i) - '0') + "=" + sum);
                } else {
                    sum += (s.charAt(i) - '0');
                    sum += (s.charAt(n - i - 1) - '0');
//                    System.out.println(sum);
//                    System.out.println("1. " + "sum+" + (s.charAt(i) - '0') + "+" + (s.charAt(n-i-1)-'0') + "=" + sum);

                }
            }
        }
//        System.out.println(sum);
        if (sum % 10 != 0) {
            check = false;
        }
        if (check) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            testcase(s);
        }
    }
}
