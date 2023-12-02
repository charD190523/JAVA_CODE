import java.util.Scanner;
public class SoNT {
    public static int checkNT (long a) {
        if (a<2) {
            return 0;
        }
        for (long i=2; i<=Math.sqrt(a); i++) {
            if (a%i==0) return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t > 0 ) {
            long n = sc.nextLong();
            if (checkNT(n)==0) {
                System.out.println("NO");
            }
            else System.out.println("YES");
            t--;
        }
    }
}
