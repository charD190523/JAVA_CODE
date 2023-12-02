import java.util.Scanner;
import java.math.BigInteger; 
public class SUBTRACT {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt () ;
        while (t-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger c = a.subtract(b).abs();
            
            String str = new String (c.toString());
            int size = Math.max(a.toString().length(), b.toString().length());
            while (str.length() < size ) {
                str = '0'+str;
            }
            System.out.println(str);
        }
    }
}
