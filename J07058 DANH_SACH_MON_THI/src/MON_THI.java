
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


class DS implements Comparable<DS> {
    private String code, name, hinhThuc;
    
    public DS (String code, String name, String hinhThuc) {
        this.code = code;
        this.name = name;
        this.hinhThuc = hinhThuc;
    }
    
    public String toString () {
        return code + " " + name + " " + hinhThuc; 
    }

    @Override
    public int compareTo(DS o) {
        return code.compareTo(o.code);
    }
}
public class MON_THI {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner (new File ("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        DS [] ds = new DS [n];
        for (int i=0; i<n; i++) {
            String code = sc.nextLine();
            String name = sc.nextLine();
            String hinhThuc = sc.nextLine();
            
            ds[i] = new DS (code, name, hinhThuc);
        }
        Arrays.sort(ds);
        for (DS x : ds) {
            System.out.println(x);
        }
    }
}
