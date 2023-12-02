
import java.math.BigInteger;
import java.util.Scanner;


public class CHIA_HET {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0 ) {
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger("11");
            if (a.remainder(b).equals(BigInteger.ZERO)) {
                System.out.println("1");
            }
            else System.out.println("0");
        }
    }
}
