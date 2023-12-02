
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class ListSV {

    private String ma;
    private String name;
    private String lop;
    private String DoB;
    float gpa;

    public ListSV(String ma, String name, String lop, String DoB, float gpa)  {
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.DoB = DoB;
        this.gpa = gpa;
    }

    public String Format() {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date date = formatter.parse(DoB);
            return formatter.format(date);
        } catch (ParseException e) {
            System.out.println(e);
        }
        return "";
    }

    @Override
    public String toString() {
        return ma + " " + name + " " + lop + " " + Format() + " " + String.format("%.2f", gpa);
    }

}

public class J07010_DSSV {

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("SV.in"));
        int t = Integer.parseInt(sc.nextLine());
//        ListSV [] sv = new ListSV [t];
        for (int i=1; i<=t; i++) {
            String ma = "B20DCCN" + String.format("%03d", i);
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String DoB = sc.nextLine();
            float gpa = Float.parseFloat(sc.nextLine());
            
            ListSV sv = new ListSV (ma, name, lop, DoB, gpa);
            System.out.println(sv);
            System.out.println("");
        }
        
    }
}
