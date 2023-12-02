import java.util.Scanner;
import java.math.BigInteger;
public class BCNN {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger mul = a.multiply (b);
            BigInteger gcd = a.gcd(b);
            BigInteger lcm = mul.divide(gcd);
            System.out.println(lcm);
        }
    }
}
