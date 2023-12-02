
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


class DTB implements Comparable<DTB> {
    private String code, name;
    private double gpa1, gpa2, gpa3, dtb;
    private int rank;

    public DTB(String code, String name, double gpa1, double gpa2, double gpa3, int rank) {
        this.code = code;
        this.name = name;
        this.gpa1 = gpa1;
        this.gpa2 = gpa2;
        this.gpa3 = gpa3;
        this.rank = rank;
        this.dtb = (this.gpa1*3 + this.gpa2*3 + this.gpa3*2)/8;

    }
    
    public double getDtb () {
        return dtb;
    }
    
    public void setRank (int rank) {
        this.rank = rank;
    }

    public String toString () {
        return code + " " + name + " " + String.format("%.2f", dtb) + " " + rank; 
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
public class TINH_DIEM_TRUNG_BINH {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner (new File ("BANGDIEM.in"));
        int n = Integer.parseInt(sc.nextLine());
        double gpa = 11;
        int rank = 0;
        int cnt = 1;
        DTB [] dtb = new DTB [n];
        for (int i=1; i<=n; i++) {
            String code = "SV" + String.format("%02d", i);
            String name = sc.nextLine().trim();
            double gpa1 = Double.parseDouble(sc.nextLine());
            double gpa2 = Double.parseDouble(sc.nextLine());
            double gpa3 = Double.parseDouble(sc.nextLine());
            
            dtb[i-1] = new DTB (code, name, gpa1, gpa2, gpa3, rank);
            dtb[i-1].chuanHoa();
        }
        Arrays.sort(dtb);
        for (int i=0; i<n; i++) {
            if (dtb[i].getDtb()<gpa) {
                gpa = dtb[i].getDtb();
                rank+= cnt;
                cnt = 1;
                dtb[i].setRank(rank);
            } else {
                dtb[i].setRank(rank);
                cnt++;
            }
        }
        for (DTB x : dtb) {
            System.out.println(x);
        }
    }
}
