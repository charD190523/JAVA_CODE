
import java.util.Arrays;
import java.util.Scanner;

class GV implements Comparable<GV>{
    private String mgv, name;
    private double hsl;
    private String hskk;
    private long gcn;
    private double luong ;
    private String ten;
    
    public GV (String mgv, String name, double hsl, String hskk, long gcn) {
        this.mgv = mgv;
        this.name = name;
        this.hsl = hsl;
        this.hskk = hskk;
        this.gcn = gcn;
        this.ten = name.trim().split("\\s++")[2] + " " + name.trim().split("\\s++")[1] + " " + name.trim().split("\\s++")[0];
//        this.ten = this.ten.toUpperCase();
    }
    
    public String getTen () {
        return this.ten;
    }
    
    public void tinhLuong () {
        double hskkk = 0;
        if (null != hskk) switch (hskk) {
            case "A":
                hskkk = 1.5;
                break;
            case "B":
                hskkk = 1.2;
                break;
            case "C":
                hskkk = 1;
                break;
            default:
                break;
        }
//        System.out.println("hskk= " + hskkk);
        double sum = hsl*hskkk*3000;
        if (gcn<=100) sum = sum-(sum*0.15); 
        else if (gcn<=350) sum= sum-(sum*0.1);
        else if (gcn<500) sum = sum-(sum*0.05);
        luong = sum;
    }
    
    public String toString () {
        return mgv + " " + name + " " + hsl + " " + hskk + " " + gcn + " " + String.format("%.0f", luong);
    }

    @Override
    public int compareTo(GV o) {
        return ten.compareTo(o.getTen());
    }
}
public class TinhLuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
//        sc.nextLine();
        GV [] gv = new GV[n];
        for (int i=1; i<=n; i++) {
            String mgv = "PM" + String.format("%03d",i);
            sc.nextLine();
            String name = sc.nextLine();
            double hsl = sc.nextDouble();
            sc.nextLine();
            String hskk = sc.nextLine();
            long gcn = sc.nextLong();
            
            gv[i-1] = new GV (mgv, name, hsl, hskk, gcn);
            gv[i-1].tinhLuong();
//            System.out.println(gv);
        }
        Arrays.sort(gv);
        for (GV x : gv) {
            System.out.println(x);
        }
    }
}
