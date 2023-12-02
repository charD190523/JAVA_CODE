import java.util.Scanner;
public class Ps {
     private long tu, mau;
     
     Ps (long  tu, long mau) {
         this.tu = tu;
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
     private long lcm (long a, long b) {
         return a*b/gcd(a,b);
     }
     private void rutgon () {
         long n = gcd(tu, mau);
         tu /= n;
         mau /=n;
     }
     public Ps sum (Ps p, Ps q ) {
//         Ps p = new Ps (1, 1);
         long num = lcm (p.mau,q.mau);
         p.tu = num/p.mau * p.tu;
         q.tu = num/q.mau * q.tu;
         p.tu += q.tu;
         p.mau = num;
         p.rutgon ();
         return p;
     }
     public String toString () {
         return tu + "/" + mau;
     }
     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Ps p = new Ps (a,b);
        a = sc.nextInt();
        b = sc.nextInt();
        Ps q = new Ps (a,b);
        Ps ps = new Ps (1,1);
        ps = ps.sum (p, q);
        System.out.println(ps);
    }
}
