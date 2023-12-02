
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


class DSSV implements Comparable<DSSV> {
    
    private String msv , name, lop, email;
    
    public DSSV (String msv, String name, String lop, String email) {
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }
    
    public String getMsv () {
        return msv;
    }
    public void chuanHoa () {
        String [] a = name.trim().split("\\s++");
        String res = "";
        for (int i=0; i<a.length; i++) {
            res += a[i].substring(0,1).toUpperCase() + a[i].substring(1).toLowerCase();
            if (i != a.length-1) res += " ";
        }
        name = res;
    }
    public String toString () {
        return msv + " " + name + " " + " " + lop + " " + email;
    }
    
    @Override
    public int compareTo(DSSV o) {
        return msv.compareTo(o.getMsv());
    }
}

public class Sv  {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner (new File ("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        DSSV [] stu = new DSSV [n];
        for (int i =0; i<n; i++) {
            String msv = sc.nextLine ();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            stu [i] = new DSSV (msv, name, lop, email);
            stu[i].chuanHoa();
        }
        Arrays.sort(stu);
        for (DSSV i: stu) {
            System.out.println(i);
        }
    }
}
