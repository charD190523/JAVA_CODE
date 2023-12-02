import java.util.Scanner;
public class Ps {
    private long tu, mau;
    
    public Ps (long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public long getTu() {
        return tu;
    }

    public long getMau() {
        return mau;
    }

    public void setTu(long tu) {
        this.tu = tu;
    }

    public void setMau(long mau) {
        this.mau = mau;
    }
    
    private long gcd (long a, long b) {
        while (b != 0) {
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    public void rutGon () {
        long uc = gcd (this.tu, this.mau);
        this.setTu (this.getTu()/uc);
        this.setMau (this.getMau()/uc);
    }
    public void truPs (Ps p) {
        long ts = this.getTu() * p.getMau() - p.getTu() * this.getMau();
        long ms = this.getMau() * p.getMau();
//        this.tu = ts;
//        this.mau = ms;
//        rutGon();
        Ps p1 = new Ps (ts, ms);
        p1.rutGon();
        if (p1.getTu() == 0) System.out.println(0);
        else {
            System.out.println(p1.tu + "/" + p1.mau );
        }
    }
    
    public String toString () {
        return tu +" "+ mau;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        Ps p1 = new Ps (x, y);
        x = sc.nextLong();
        y = sc.nextLong();
        Ps p2 = new Ps (x, y);
        p1.truPs(p2);
    }
            
}
