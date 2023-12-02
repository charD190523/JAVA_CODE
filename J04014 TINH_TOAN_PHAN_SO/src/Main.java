
import java.util.Scanner;


class PS {
    private long tu, mau;
    
    public PS (int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }
    
    public long getTu () {
        return this.tu;
    }
    
    public long getMau () {
        return this.mau;
    }
    
    public long gcd (long a, long b) {
        while (b!=0) {
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    
    public PS rutgon(PS a) {
        long ucln = gcd (a.tu, a.mau);
        a.tu /= ucln;
        a.mau /= ucln;
        return a;
    }
    
    public PS tinhTong (PS a) {
        PS kq = new PS (1,1);
        long mc = this.mau * a.mau;
        kq.tu = this.tu * a.mau + a.tu * this.mau;
        kq.mau = mc;
        kq = rutgon(kq);
        return kq;
    }
    
    public PS tinhTich (PS a) {
        PS kq = new PS (1,1);
        kq.tu = this.tu * a.tu;
        kq.mau = this.mau * a.mau;
        kq = rutgon (kq);
        return kq;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            PS a = new PS (sc.nextInt(), sc.nextInt());
            PS b = new PS (sc.nextInt(), sc.nextInt());
            PS sum = a.tinhTong(b);
            PS c = sum.tinhTich(sum);
            System.out.print(c.getTu() + "/" + c.getMau() + " ");
            PS d = a.tinhTich(b.tinhTich(c));
            System.out.println(d.getTu() + "/" + d.getMau());
        }
    }
}