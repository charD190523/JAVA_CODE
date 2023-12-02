
public class SachThamKhao extends SachHoc implements ISach{
    private boolean loai;

//    public static int NUM = 1;
    
    public SachThamKhao() {
    }

    public SachThamKhao(String ten, String nhaXB, boolean loai, double gia) {
        super(ten, nhaXB, gia);
        this.loai = loai;
        
    }
    
    public boolean isLoai () {
        return loai;
    }

    public void setLoai(boolean loai) {
        this.loai = loai;
    }
    
    public void setMa () {
        this.ma = "GD" + String.format("%02d", NUM++);
        double tp = 1;
        if (loai ) { 
            setNhaXB(getNhaXB() + " co ban");
            tp=0.1;
        } else {
            tp = 0.15;
            setNhaXB (getNhaXB() + " nang cao");
        }
        gia += gia*tp;
        
    }
    
    public String toString () {
        return ma + " " + getTen() + " " +  getNhaXB()  + " " +Math.round((gia*100)/100);
    }
    
    public double getGia () {
        return this.gia;
    }
    
    public double tinhSTK () {
        double tp = 1;
        if (loai ) { 
            setNhaXB(getNhaXB() + " co ban");
            tp=0.1;
        } else {
            tp = 0.15;
            setNhaXB (getNhaXB() + " nang cao");
        }
        gia += gia*tp;
        return gia;
    }

    @Override
    public double tinhSGK() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
} 
 