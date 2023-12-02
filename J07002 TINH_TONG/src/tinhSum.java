
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class tinhSum {

    public static void main(String[] args) throws FileNotFoundException {
//        String url = "C:\\Users\\User\\OneDrive\\Documents\\CODE\\CODE PTIT\\DATA.in";
//        FileInputStream inp = new FileInputStream(url);
//        Scanner sc = new Scanner(inp);
        Scanner sc = new Scanner (new File ("DATA.in"));
        long sum = 0;
        while (sc.hasNext()) {
            String s = sc.next();
            try {
                sum += Integer.parseInt(s);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println(sum);
    }
}
