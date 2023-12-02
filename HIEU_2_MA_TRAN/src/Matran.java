import java.util.Scanner;
class Matran {
    public Scanner sc = new Scanner (System.in);
    private int n;
    private int [][] a ;
    private int [][] c ;

    
    public Matran (int n) {
        this.n = n;
        a = new int [n][n];
        c = new int [n][n];
    }

    public int[][] getMatran() {
        return a;
    }
    
    public void setMatran (int [][] c) {
        this.c = c;
    } 
    
    public int getKT () {
        return n;
    }
    
    public void input (Scanner sc1) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    } 
    public Matran hieu (int [][] b) {
        Matran h = new Matran (n);
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }
        h.setMatran(c);
        return h;
    }
    public void out () {
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //nhap kich thuoc
        int n=sc.nextInt();
        Matran m=new Matran(n);
        //nhap ma tran a
        m.input(sc);
        Matran b=new Matran(m.getKT());
        //nhap ma tran b
        b.input(sc);
        Matran h=m.hieu(b.getMatran());
        //viet ra ma tran hieu
        h.out();
    }
}

