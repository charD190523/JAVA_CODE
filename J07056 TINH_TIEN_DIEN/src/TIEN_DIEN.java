
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


class TD implements Comparable<TD>{
    private String code, name, type;
    private long mon1, mon2, dm;
    private int so;
    private double totalCost, VAT;

    public TD (String code, String name, String type, int so) {
        this.code = code;
        this.name = name;
        this.type = type;
        this.so = so;
    }
    
    public void tinhTien () {
        switch (type) {
            case "A" :
                dm = 100;
                break;
            case "B" :
                dm = 500;
                break;
            case "C" :
                dm = 200;
                break;
        }
        if (so > dm) mon1 = dm*450;
        else mon1 = so*450;
        
        if (so > dm) mon2 = (so-dm)*1000;
        else mon2 = 0;
        VAT = mon2*0.05;
        totalCost = mon1 + mon2 + VAT;
    }
    
    public void chuanHoa () {
        String ten [] = name.split("\\s++");
        String res = "";
        for (int i=0; i<ten.length; i++) {
            res += ten[i].substring(0,1).toUpperCase() + ten[i].substring(1).toLowerCase();
            res += " ";
        }
        res = res. trim();
        name = res;
    }
    
    public String toString () {
        return code + " " + name + ' ' + mon1 + " " + mon2 + " " + String.format("%.0f", VAT) + " " + String.format("%.0f", totalCost); 
    }

    @Override
    public int compareTo(TD o) {
        return -Double.compare(totalCost, o.totalCost);
    }
}

public class TIEN_DIEN {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner (new File ("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        TD [] td = new TD [n];
        for (int i=0; i<n; i++) {
            String code = "KH" + String.format("%02d", i+1);
            String name = sc.nextLine().trim();
            String[] tokens = sc.nextLine().split("\\s+");
            String type = tokens[0];
            int dau = Integer.parseInt(tokens[1]);
            int cuoi = Integer.parseInt(tokens[2]);
            int so = cuoi - dau;
            
            td[i] = new TD (code, name, type, so);
            td[i].chuanHoa();
            td[i].tinhTien();
        }
        Arrays.sort(td);
        for (TD x : td) {
            System.out.println(x);
        }
    }
}
