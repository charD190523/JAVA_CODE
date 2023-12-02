
import java.text.DecimalFormat;
import java.util.Scanner;


class SV {
    private String code, name, status;
    private double toan, ly, hoa, prio, sum;
    
    public SV (String code, String name, double toan, double ly, double hoa) {
        this.code = code;
        this.name = name;
        this.toan = toan;
        this. ly = ly;
        this.hoa = hoa;
    }
    
    public void Tinh () {
        String kv = code.substring(0, 3);
        if (kv.equals("KV1")) prio = 0.5;
        else if (kv.equals("KV2")) prio = 1.0;
        else prio = 2.5;
        
        sum = toan*2 + ly + hoa ;
        if ((sum + prio) < 24) status = "TRUOT";
        else status = "TRUNG TUYEN";
    }
    
    public String toString () {
        return code + " " + name + " " + (new DecimalFormat().format(prio)) + " " + (new DecimalFormat().format(sum)) + " " + status;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String code = sc.nextLine();
        String name = sc.nextLine();
        double toan = sc.nextDouble();
        double ly = sc.nextDouble();
        double hoa = sc.nextDouble();
        SV sv = new SV (code, name, toan, ly, hoa);
        sv.Tinh();
        System.out.println(sv);
    }
}
