import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Sv {
    private
        String msv = "B20DCCN001"; 
        String name;
        String lop;
        String DoB;
        float gpa;
    
    public Sv (String name, String lop, String DoB, float gpa) {
        this.name = name;
        this.lop = lop;
        this.DoB = DoB;
        this.gpa = gpa;
    }
    
    public String Format () {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat ("dd/MM/yyyy");
            Date date = formatter.parse(DoB);
            return formatter.format (date);
        } catch (ParseException e) {
            System.out.println(e);
        }
        return "";
    }
    
    @Override
    public String toString () {
        return msv + " " + name + " " + lop + " " + Format() + " " + String.format("%.2f", gpa);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String name = sc.nextLine();
        String lop = sc.nextLine();
        String DoB = sc.nextLine();
        float gpa = sc.nextFloat();
        Sv p = new Sv (name, lop, DoB, gpa);
        System.out.println(p);
    }
}
