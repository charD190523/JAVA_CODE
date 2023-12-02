
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class TS implements Comparable<TS>{

    private String code, name, dt, status;
    private double point;
    private int kv;

    public TS(String code, String name, double point, String dt, int kv) {
        this.code = code;
        this.name = name;
        this.point = point;
        this.dt = dt;
        this.kv = kv;
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
    
    
    public void XetDiem() {
        double uuTien = 0;
        if (dt.equals("Kinh")) {
            uuTien = 0;
        } else {
            uuTien = 1.5;
        }
        switch (kv) {
            case 1:
                uuTien += 1.5;
                break;
            case 2:
                uuTien += 1;
                break;
            case 3:
                break;
        }
        point += uuTien;
        if (point < 20.5) status = "Truot";
        else status = "Do";
    }
    @Override
    public String toString () {
        return code + " " + name + " " + String.format("%.1f", point) + " " + status;
    }

    @Override
    public int compareTo(TS o) {
        if (point == o.point) {
            return code.compareTo(o.code);
        }
        return -Double.compare(point, o.point);
    }
}

public class TUYEN_SINH {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner (new File ("THISINH.in"));
        int n = Integer.parseInt(sc.nextLine());
        TS [] ts = new TS [n];
        for (int i=0; i<n; i++) {
            String code = "TS" + String.format("%02d", i+1);
            String name = sc.nextLine().trim();
            double point = Double.parseDouble(sc.nextLine());
            String dt = sc.nextLine();
            int kv = Integer.parseInt(sc.nextLine());
            
            ts [i] = new TS (code, name, point, dt, kv);
            ts[i].XetDiem();
            ts[i].chuanHoa();
        }
        Arrays.sort(ts);
        for (TS x : ts) {
            System.out.println(x);
        }
    }
}