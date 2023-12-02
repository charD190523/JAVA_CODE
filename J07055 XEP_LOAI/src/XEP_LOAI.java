import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


class DTB implements Comparable<DTB> {
    private String code, name, eva;
    private double gpa1, gpa2, gpa3, dtb;

    public DTB(String code, String name, double gpa1, double gpa2, double gpa3) {
        this.code = code;
        this.name = name;
        this.gpa1 = gpa1;
        this.gpa2 = gpa2;
        this.gpa3 = gpa3;
        this.dtb = (this.gpa1*0.25 + this.gpa2*0.35 + this.gpa3*0.4);

    }
    
    public double getDtb () {
        return dtb;
    }
    
    public void xepLoai() {
        if (dtb < 5) eva = "KEM";
        else if (dtb < 6.5) eva = "TRUNG BINH";
        else if (dtb < 8) eva = "KHA";
        else eva = "GIOI";
    }

    public String toString () {
        return code + " " + name + " " + String.format("%.2f", dtb) + " " + eva; 
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
    
    @Override
    public int compareTo(DTB o) {
        return -Double.compare(dtb, o.getDtb());
    }
}
public class XEP_LOAI {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner (new File ("BANGDIEM.in"));
        int n = Integer.parseInt(sc.nextLine());
        DTB [] dtb = new DTB [n];
        for (int i=0; i<n; i++) {
            String code = "SV" + String.format("%02d", i+1);
            String name = sc.nextLine().trim();
            double gpa1 = Double.parseDouble(sc.nextLine());
            double gpa2 = Double.parseDouble(sc.nextLine());
            double gpa3 = Double.parseDouble(sc.nextLine());
            
            dtb[i] = new DTB (code, name, gpa1, gpa2, gpa3);
            dtb[i].chuanHoa();
            dtb[i].xepLoai();
        }
        Arrays.sort(dtb);
        for (DTB x : dtb) {
            System.out.println(x);
        }
    }
}
