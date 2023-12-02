import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class TS {
    private 
        String  name;
        String birth;
        float gpa1;
        float gpa2;
        float gpa3;
    
    TS (String name, String birth, float gpa1, float gpa2, float gpa3) {
        this.name = name;
        this.birth = birth;
        this.gpa1 = gpa1;
        this.gpa2 = gpa2;
        this.gpa3 = gpa3;
    }
    
    public float sum () {
        return gpa1 + gpa2 + gpa3;
    }
    
    public String FormatBirth() {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date date = formatter .parse (birth);
            return formatter.format(date);
        } catch (ParseException e) {
            System.out.println(e);
        }
        return "";
    }
    
    public String toString () {
        return name + " " + FormatBirth() + " " + String.format("%.1"
                + ""
                + "f", gpa1 + gpa2 + gpa3);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String name = sc.nextLine();
        String birth = sc.nextLine();
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        
        TS p = new TS (name, birth, a, b, c);
        System.out.println(p);
    }
}
