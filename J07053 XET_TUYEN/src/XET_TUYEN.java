
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Profile {

    private String code, name, eva;
    private double lt, th, dtb;
    private int age;

    public Profile(String code, String name, int age, double lt, double th) {
        this.code = code;
        this.name = name;
        this.age = age - 2;
        this.lt = lt;
        this.th = th;
    }

    public void tinhDiem() {
        double thuong = 0;
        if (lt < 7.5 || th < 7.5) {
            thuong = 0;
        } else if (lt < 8 || th < 8) {
            thuong = 0.5;
        } else {
            thuong = 1;
        }

        dtb = (lt + th) / 2 + thuong;
        if (dtb > 10) dtb = 10;
        dtb = Math.round((dtb * 100) / 100);
//        String diem = String.format(".0f", dtb);
        if (dtb < 5) {
            eva = "Truot";
        } else if (dtb < 7) {
            eva = "Trung binh";
        } else if (dtb == 7) {
            eva = "Kha";
        } else if (dtb == 8) {
            eva = "Gioi";
        } else {
            eva = "Xuat sac";
        }
    }
    
    public void chuanHoa () {
        String [] ten = name.split("\\s++");
        String res = "";
        for (int i=0; i<ten.length; i++) {
            res += ten[i].substring(0,1).toUpperCase() + ten[i].substring(1).toLowerCase();
            res += " ";
        }
        res = res.trim();
        name = res;
    }

    public String Age() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        String time = sdf.format(date);
        System.out.println(time);
        return time;
    }

    public String toString() {
        return code + " " + name + " " + age + " " + String.format("%.0f", dtb) + " " + eva;
    }
}

public class XET_TUYEN {

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
        
        Profile[] profile = new Profile[n];
        for (int i = 1; i <= n; i++) {
            String code = "PH" + String.format("%02d", i);
            String name = sc.nextLine().trim();
            Date date = sdf.parse(sc.nextLine());
            String time0 = sdf1.format(date);
//            System.out.println(time0);
            Date now = new Date();
            String time = sdf1.format(now);
//            int age = (int) (now.getTime() - date.getTime());
            int age = (Integer.parseInt(time) - Integer.parseInt(time0));
            double lt = Double.parseDouble(sc.nextLine());
            double th = Double.parseDouble(sc.nextLine());

            profile[i - 1] = new Profile(code, name, age, lt, th);
            profile[i-1].tinhDiem();
            profile[i-1].chuanHoa();
        }
        for (Profile x : profile) {
            System.out.println(x);
        }
    }
}
