
public class SachGiaoKhoa extends SachHoc{
    private int lop, tap;
    private boolean baitap;
    
//    public static int Num = 1;
    
    public SachGiaoKhoa() {
    }
    

    public SachGiaoKhoa(String ten, String nhaXB, int lop, int tap, boolean baitap, double gia) {
        super(ten, nhaXB, gia);
        this.lop = lop;
        this.tap = tap;
        this.baitap = baitap;
        
    }

    public int getLop() {
        return lop;
    }

    public int getTap() {
        return tap;
    }
    
    public double getGia () {
        return this.gia;
    }

    public boolean isBaitap() {
        return baitap;
    }

    public void setLop(int lop) {
        this.lop = lop;
    }

    public void setTap(int tap) {
        this.tap = tap;
    }

    public void setBaitap(boolean baitap) {
        this.baitap = baitap;
    }

    public void setMa() {
        this.ma = "SGK" + String.format("%d%d%02d",lop, tap, NUM++);
        int cap = 0;
        if (lop >= 1 && lop <=6 ) cap =1;
        if (lop >=6) cap = 2;
        if (cap == 1 ) gia -= gia*0.1;
        else if (cap == 2 ) gia -= gia*0.05;
        if (baitap) gia += gia*0.05;
        
        
    }
    
    public String toString () {
        return ma + " " + getTen() + " " + getNhaXB() + " " + lop + " " + tap + " " + Math.round((gia*100)/100) ;
    }
    public double tinhSGK () {
        int cap = 0;
        if (lop >= 1 && lop <=6 ) cap =1;
        if (lop >=6) cap = 2;
        if (cap == 1 ) gia -= gia*0.1;
        else if (cap == 2 ) gia -= gia*0.05;
        if (baitap) gia += gia*0.05;
        return gia;
    }
    
    
}
