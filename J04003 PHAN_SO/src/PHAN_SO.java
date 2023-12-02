
import java.util.Scanner;

public class PHAN_SO {

    private long tu, mau;

    PHAN_SO() {
        tu = 0;
        mau = 1;
    }

    PHAN_SO(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    
    public String toString () {
        long c  = gcd(tu,mau);
        return tu/c + "/" + mau/c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        PHAN_SO f = new PHAN_SO (a, b);
        System.out.println(f);
    }
}
