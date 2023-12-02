
import java.util.Scanner;


class SP {
    private int a,b;
    
    public SP (int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public int getA () {
        return a;
    }
    public int getB () {
        return b;
    }
    
    public SP tinhTong(SP p) {
        SP kq = new SP (1,1);
        kq.a = this.a + p.a;
        kq.b = this.b + p.b;
        return kq;
    }
    
    public SP tinhTich (SP p) {
        SP kq = new SP (1,1);
        kq.a = this.a * p.a - this.b *p.b;
        kq.b = this.a * p.b + this.b * p.a;
        return kq;
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            SP a = new SP (sc.nextInt(), sc.nextInt());
            SP b = new SP (sc.nextInt(), sc.nextInt());
            SP c = a.tinhTich(a.tinhTong(b));
            System.out.print(c.getA() + " + " + c.getB() + "i" + ", ");
            SP sum = a.tinhTong(b);
            SP d = sum.tinhTich(sum);
            System.out.println(d.getA() + " + " + d.getB() + "i");
        }
    }
}