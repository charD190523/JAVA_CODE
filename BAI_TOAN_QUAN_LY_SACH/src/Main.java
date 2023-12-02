
public class Main implements ISach {
    public static void main(String[] args) {
        SachThamKhao k=new SachThamKhao("toan lop 5","giao duc", true, 50);
        k.setMa();
        System.out.println(k);
        SachGiaoKhoa g=new SachGiaoKhoa("tieng Viet", "dong nai", 4, 1, false, 80);
        g.setMa();
        System.out.println(g);
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
