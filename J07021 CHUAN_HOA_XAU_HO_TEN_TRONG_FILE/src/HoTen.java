
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HoTen {

    public static String chuanHoa(String s) {
        if (s.length() == 1) {
            return s.toUpperCase();
        }
        if (s == "END") {
            return "";
        }
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s = "";
        while (sc.hasNext()) {
            s = sc.nextLine();
            if (s.equals("END")) break;
            s = s.trim().toLowerCase();
            String[] a = s.split("\\s++");
            for (String x : a) {
                System.out.print(chuanHoa(x) + " ");
            }
            System.out.println("");
        }

    }
}
