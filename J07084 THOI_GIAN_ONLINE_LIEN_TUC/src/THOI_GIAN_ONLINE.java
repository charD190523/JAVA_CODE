
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;


class SV implements Comparable<SV>{
    private String name;
    private Long time;

    public SV(String name, long time) {
        this.name = name;
        this.time = time;
    }
    
    public String getName () {
        return this.name;
    }
    
    public Long getTime () {
        return this.time;
    }
    
    public String toString () {
        return name + " " + time;
    }

    @Override
    public int compareTo(SV o) {
        int timeSort = -this.time.compareTo(o.getTime());
        if (timeSort == 0) {
            String lastname1 = name.split("\\s++")[2];
            String lastname2 = o.getName().split("\\s++")[2];
            
            int lastNameSort = lastname1.compareTo(lastname2);
            if (lastNameSort == 0) {
                String firstName1 = name.split("\\s++")[0];
                String firstName2 = o.getName().split("\\s++")[0];
                return firstName1.compareTo(firstName2);
            }
            return lastNameSort;
        }
        return timeSort;
    }
}
public class THOI_GIAN_ONLINE {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner (new File ("ONLINE.in"));
        int n = Integer.parseInt(sc.nextLine());
        SV [] sv = new SV [n];
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        for (int i=0; i<n; i++) {
            String name = sc.nextLine();
            Date bd = sdf.parse(sc.nextLine());
            Date kt = sdf.parse(sc.nextLine());
            Long thoigian = (long) (kt.getTime() - bd.getTime()) /(1000*60);
            
            sv[i] = new SV (name, thoigian);
        }
        Arrays.sort(sv);
        for (SV x : sv) {
            System.out.println(x);
        }
    }
}