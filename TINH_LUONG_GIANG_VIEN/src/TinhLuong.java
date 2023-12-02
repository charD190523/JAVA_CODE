
import java.util.Scanner;

class GV {
    private String mgv, name;
    private double hsl;
    private String hskk;
    private long gcn;
    private double luong ;
    
    public GV (String mgv, String name, double hsl, String hskk, long gcn) {
        this.mgv = mgv;
        this.name = name;
        this.hsl = hsl;
        this.hskk = hskk;
        this.gcn = gcn;
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
}
public class TinhLuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
//        sc.nextLine();
        for (int i=1; i<=n; i++) {
            String mgv = "PM" + String.format("%03d",i);
            sc.nextLine();
            String name = sc.nextLine();
            double hsl = sc.nextDouble();
            sc.nextLine();
            String hskk = sc.nextLine();
            long gcn = sc.nextLong();
            
            GV gv = new GV (mgv, name, hsl, hskk, gcn);
            gv.tinhLuong();
            System.out.println(gv);
        }
    }
}
