
import java.util.Scanner;


class NV {
    private String ma, name, chucVu;
    private long luong, ngay;
    private long luongThang, thuong, pc, thuNhap;
    
    public NV (String name, long luong, long ngay, String chucVu) {
        this.ma = "NV01";
        this.name = name;
        this.luong = luong;
        this.ngay = ngay;
        this.chucVu = chucVu;
    }
    
    public void chinhSach () {
        if (ngay < 22) thuong = 0;
        else if (ngay < 25) thuong = (long) (luongThang * 0.1);
        else thuong = (long) (luongThang * 0.2);
        
        if (chucVu.equals("GD")) {
            pc = 250000;
        }
        else if (chucVu.equals("PGD")) {
            pc = 200000;
        }
        else if (chucVu.equals("TP")) {
            pc = 180000;
        }
        else pc = 150000;
    } 
    
    public void Tinh() {
        luongThang = luong * ngay;
        chinhSach ();
        thuNhap = luongThang + thuong + pc;
    }
    public String toString () {
        return ma + " " + name + " " + luongThang + " " + thuong + " " + pc + " " + thuNhap;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String name = sc.nextLine();
        long luong = sc.nextLong();
        long ngay = sc.nextLong();
        sc.nextLine();
        String chucVu = sc.nextLine();
        NV nv = new NV (name, luong, ngay, chucVu);
        nv.Tinh();
        System.out.println(nv);
    }
}
