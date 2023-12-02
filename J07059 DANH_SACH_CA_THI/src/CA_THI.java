
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

    

class DS implements Comparable<DS>{
    
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public static SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm");
    
    private String code, room_ID;
    private Date ngay, gio;

    public DS(String code, Date ngay, Date gio, String room_ID) {
        this.code = code;
        this.ngay = ngay;
        this.gio = gio;
        this.room_ID = room_ID;
    }
    
    public String toString () {
        return code + " " + sdf.format(ngay) + " " + sdf1.format(gio) + " " + room_ID;
    }
    
    @Override
    public int compareTo(DS o) {
        // So sánh theo ngày thi trước
        int compareDate = ngay.compareTo(o.ngay);
        if (compareDate == 0) {
            // Nếu ngày thi giống nhau, thì so sánh theo giờ thi
            int compareTime = gio.compareTo(o.gio);
            if (compareTime == 0) {
                // Nếu giờ thi giống nhau, thì so sánh theo mã ca thi
                return code.compareTo(o.code);
            }
            return compareTime;
        }
        return compareDate;
    }
    
}

public class CA_THI {
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        Scanner sc = new Scanner (new File ("CATHI.in"));
        int n = Integer.parseInt(sc.nextLine());
        DS [] ds = new DS [n];
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm");
        
        for (int i=0; i<n; i++) {
            String code = "C" + String.format("%03d", i+1);
            Date ngay = sdf.parse(sc.nextLine());
            Date gio = sdf1.parse(sc.nextLine());
            String room_ID = sc.nextLine();
            
            ds[i] = new DS (code, ngay, gio, room_ID);
        }
        Arrays.sort(ds);
        for (DS x : ds) {
            System.out.println(x);
        }
    }
}