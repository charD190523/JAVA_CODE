
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;


class DS implements Comparable<DS>{
    private String code, name, trangThai;
    private double toan, ly, hoa, tongDiem, uuTien;
    
    public DS (String code, String name, double toan, double ly, double hoa) {
        this.code = code;
        this.name = name;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    
    public double getTongDiem () {
        return this.tongDiem;
    }
    
    public String getCode () {
        return this.code;
    }
    
    public void setTrangThai (String trangThai) {
        this.trangThai = trangThai;
    }
    
    public void chuanHoa () {
        String [] ten = name.split("\\s++");
        String res = "";
        for (int i=0; i<ten.length; i++) {
            res += ten[i].substring(0,1).toUpperCase() + ten[i].substring(1).toLowerCase();
            res += " ";
        }
        res = res.trim();
        name = res;
    }
    
    public void tinhDiem () {
        switch (code.substring(2,3)) {
            case "1" :
                uuTien = 0.5;
                break;
            case "2" :
                uuTien = 1;
                break;
            case "3" :
                uuTien = 2.5;
                break;
        }
        tongDiem = toan*2 + ly + hoa + uuTien;
    }
    
    public String toString () {
        return code + " " + name + " " + removeZero(uuTien) + " "+ removeZero(tongDiem) + " " +trangThai;
    }
    
    public String removeZero (double a) {
        DecimalFormat format = new DecimalFormat("#.#");
        return format.format(a);
    }

    @Override
    public int compareTo(DS o) {
        if (tongDiem == o.getTongDiem()) return code.compareTo(o.getCode());
        return -Double.compare(tongDiem, o.getTongDiem());
    }
}

public class DANH_SACH_TRUNG_TUYEN {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner (new File ("THISINH.in"));
        int n = Integer.parseInt(sc.nextLine());
        DS [] ds = new DS [n];
        for (int i=0; i<n; i++) {
            String code = sc.nextLine().trim();
            String name = sc.nextLine().trim();
            double toan = Double.parseDouble(sc.nextLine());
            double ly = Double.parseDouble(sc.nextLine());
            double hoa = Double.parseDouble(sc.nextLine());
            
            ds[i] = new DS (code, name, toan, ly, hoa);
            ds[i].chuanHoa();
            ds[i].tinhDiem();
        }
        Arrays.sort(ds);
        int chiTieu = Integer.parseInt(sc.nextLine());
        double diemChuan = ds[chiTieu-1].getTongDiem();
        System.out.println(String.format ("%.1f", diemChuan));
        for (int i=0; i<n; i++) {
            if (ds[i].getTongDiem() < diemChuan) {
                ds[i].setTrangThai("TRUOT");
            }
            else ds[i].setTrangThai("TRUNG TUYEN");
            System.out.println(ds[i]);
        }
    }
}