
public class SachHoc implements ISach {
    private String ten, nhaXB;
    public String ma;
    double gia;
    
    public static int NUM = 1;
    public SachHoc () {
        
    }
    
    public SachHoc (String ten, String nhaXB, double gia) {
        this.ten = ten;
        this.nhaXB = nhaXB;
        this.gia = gia;
    }
    
    public String getTen () {
        return this.ten;
    }
    public String getNhaXB () {
        return this.nhaXB;
    } 
    
    public double getGia () {
        return this.gia;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public double tinhSTK() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double tinhSGK() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
