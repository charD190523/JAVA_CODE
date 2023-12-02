import java.util.Scanner;

public class XAU_DOI_XUNG {
    public static void testCase (String s) {
        int n = s.length();
        int cnt = 0;
        for (int i=0; i<n/2; i++) {
            if (s.charAt(i) != s.charAt(n-i-1) ) cnt++;
        }
        if ((n % 2 == 0 && cnt == 1) || (n % 2 == 1 && cnt <=1) ) System.out.println("YES");
        else System.out.println("NO");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            testCase (s);
        }
    }
}
