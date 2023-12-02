import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class LoaiPhong implements Comparable<LoaiPhong>{
    private String code, name;
//    private double phi;
    
    public LoaiPhong (String code) {
        this.code = code;
        this.name = code.trim().split("\\s++")[1];
    }
    
    public String getName () {
        return name;
    }
    
    public String toString () {
        return code ;
    }
    
    @Override
    public int compareTo(LoaiPhong o) {
        return name.compareTo(o.getName());
    }
}
public class J07045 {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}