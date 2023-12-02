import java.util.Scanner;
public class SO_DEP_1 {
    public static void testcase (String s) {
        int n = s.length();
        for (int i=0; i<=(int)n/2; i++) {
//            System.out.println(s.charAt(i));
            
            if ((s.charAt(i)-'0') % 2 != 0 || s.charAt (i) != s.charAt (n-i-1) ) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt(); 
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            testcase (s);
        }
    }
}
