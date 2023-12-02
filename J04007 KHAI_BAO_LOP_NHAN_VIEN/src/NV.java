import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class NV {
    private 
        String mnv = "00001";
        String name;
        String gt;
        String DoB;
        String dc;
        String mst;
        String date;
    
    public String Format (String a) {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat ("dd/MM/yyyy");
            Date d = formatter.parse(a);
            return formatter.format(d);
        } catch (ParseException e) {
            System.out.println(e);
        }
        return "";
    }    
    public NV (String name, String gt, String DoB, String dc, String mst, String date) {
//        this.mnv = mnv;
        this.name = name;
        this.gt = gt;
        this.DoB = DoB;
        this.dc = dc;
        this.mst = mst;
        this.date = date;
    }
    
    @Override
    public String toString () {
        return mnv + " " + name + " " + gt + " " + Format(DoB) + " " + dc + " " + mst + " " + Format(date);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String name = sc.nextLine();
        String gt = sc.nextLine();
        String DoB = sc.nextLine();
        String dc = sc.nextLine();
        String mst = sc.nextLine();
        String date = sc.nextLine();
        
        NV p = new NV (name, gt, DoB, dc, mst, date);
        System.out.println(p);
    }
}
