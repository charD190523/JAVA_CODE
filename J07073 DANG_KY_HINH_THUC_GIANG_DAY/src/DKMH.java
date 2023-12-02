
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


class GD implements Comparable<GD>{
    private String code, name, lt, th;
    private int stc;
    
    public GD (String code, String name, int stc, String lt, String th ){
        this.code = code;
        this.name = name;
        this.stc = stc;
        this.lt = lt;
        this.th = th;
    }
    
    public String toString () {
        return code + " " + name + " " + stc + " " + lt + " " + th;
    }

    @Override
    public int compareTo(GD o) {
        return code.compareTo(o.code);
    }
}
public class DKMH {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner (new File ("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        List <GD> gd = new ArrayList <>();
        for (int i=0; i<n; i++) {
            String code = sc.nextLine();
            String name = sc.nextLine();
            int stc = Integer.parseInt(sc.nextLine());
            String lt = sc.nextLine();
            String th = sc.nextLine();
            if (!th.equals("Truc tiep")) {
                gd.add(new GD (code, name, stc, lt, th));
            }
        }
        Collections.sort(gd);
        for (GD x : gd) {
            System.out.println(x);
        }
    }
}