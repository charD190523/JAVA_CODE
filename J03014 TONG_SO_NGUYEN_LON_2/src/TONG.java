
import java.math.BigInteger;
import java.util.Scanner;


public class TONG {
    static Scanner scanner = new Scanner(System.in);
    public static void solve(){
        BigInteger a = new BigInteger(scanner.next());
        BigInteger b = new BigInteger(scanner.next());
        System.out.println(a.add(b));
    }
    public static void main(String[] args) {
        int test = 1;
        while(test>0)
        {
            solve();
            test--;
        }
    }
}
