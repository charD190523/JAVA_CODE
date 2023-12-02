import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Xau {
    private String s;
    
    Xau () {
        s = "";
    }
    
    Xau (String s) {
        this.s = s;
    }
    
    private Scanner sc = new Scanner (System.in);
    
    public void inp () {
        s = sc.nextLine();
    }
    public void oup () {
        System.out.println(s);
    }
    
    public void kiemTra () {
        String res = "^(B)\\d(2)(DCAT)\\d(3)$";
//        Pattern pattern = Pattern.compile(res);
//        Matcher matcher = pattern.matcher(s);
//        
//        if (matcher.matches()) {
//            System.out.println("Dung dinh dang");
//        }
//        else {
//            System.out.println("Sai dinh dang");
//        }
        if (this.s.toUpperCase().matches(res)) {
            System.out.println("Dung dinh dang");
        }else {
            System.out.println("Sai dinh dang");
        }
//        return true;
    }
    
    public void chuanHoa () {
        
    }
    public void tachXau () {
        s = s.trim();
        String [] arr = s.split("\\s+");
        for (String x : arr) {
            try {
                int i = Integer.parseInt(x);
            }catch (Exception e) {
                System.out.println(x);
            }
        }
    }
}
