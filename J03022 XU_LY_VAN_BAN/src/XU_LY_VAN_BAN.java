
import java.util.ArrayList;
import java.util.Scanner;

public class XU_LY_VAN_BAN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String tmp = "";
        while (sc.hasNext()) {
            String s = sc.next();
            if (s.isEmpty()) {
                break;
            }
            if (s.charAt(s.length() - 1) == '.' || s.charAt(s.length() - 1) == '?' || s.charAt(s.length() - 1) == '!') {
                tmp += s.substring(0, s.length() - 1);
                list.add(tmp.trim());
                tmp = "";
            } else {
                tmp += s + " ";
            }
        }
        for (String x : list) {
            x = x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase();
            System.out.println(x);
        }
    }
}
