import java.util.Scanner;
import java.math.BigInteger;
public class CHIA_HET {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            if (a.mod(b).toString().equals("0") || b.mod(a).toString().equals("0")) {
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
