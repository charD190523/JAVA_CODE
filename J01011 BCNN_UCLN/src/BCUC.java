
import java.util.Scanner;

public class BCUC {

    public static Scanner sc = new Scanner(System.in);

    public static long gcd(long a, long b) {
        while (b != 0) {
            long x = a % b;
            a = b;
            b = x;
        }
        return a;
    }

    public static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    public static void print() {
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(lcm(a, b) + " " + gcd(a, b));
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
//        System.out.println("hello dmmm");
        while (t-- > 0) {
            print();
        }
    }
}
