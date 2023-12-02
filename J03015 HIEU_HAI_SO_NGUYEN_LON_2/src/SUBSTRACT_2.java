import java.util.Scanner;
import java.math.BigInteger;

public class SUBSTRACT_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       
        BigInteger a = sc.nextBigInteger ();
        BigInteger b = sc.nextBigInteger ();
        BigInteger c = a.subtract(b);
        System.out.println(c.toString());
    }
}
