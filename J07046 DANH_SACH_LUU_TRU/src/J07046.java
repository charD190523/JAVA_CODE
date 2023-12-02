
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;


class DS implements Comparable<DS>{
    private String code, name, ma;
    private Long duration;
    
    public DS (String code, String name, String ma, Long duration) {
        this.code = code;
        this.name = name;
        this.ma = ma;
        this.duration = duration;
    }
    public Long getDuration() {
        return this.duration;
    }


    @Override
    
    public String toString () {
        return code + " " + name + " " + ma + " " + duration; 
    }
    @Override
    public int compareTo(DS o) {
//        return Long.compare(this.duration, o.getDuration());
        return -duration.compareTo(o.getDuration());
    }
}
public class J07046 {
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        Scanner sc = new Scanner (new File ("KHACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        DS[] ds = new DS [n];
        SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
        for (int i=1; i<=n; i++) {
            String code = "KH" + String.format("%02d", i);
//            String code = "A";
            String name = sc.nextLine();
            String ma = sc.nextLine();
            Date firstDate = sdf.parse(sc.nextLine());
            Date lastDate = sdf.parse(sc.nextLine());
            Long duration = (lastDate.getTime()-firstDate.getTime())/(1000*60*60*24);
            ds[i-1] = new DS (code, name, ma, duration);
        }
        Arrays.sort(ds);
        for (DS x : ds) {
            System.out.println(x);
        }
    }
}
