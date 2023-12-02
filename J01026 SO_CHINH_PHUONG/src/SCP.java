import java.util.Scanner;
public class SCP {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int num = (int) Math.sqrt(n);
            if (num*num == n) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
