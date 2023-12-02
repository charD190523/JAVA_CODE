import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class MoveInt {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner (new File ("DATA.in"));
        ArrayList <String> list = new ArrayList <> ();
        while (sc.hasNext()) {
            String s = sc.next();
            try {
                int a = Integer.parseInt(s);
            }catch (NumberFormatException e) {
//                System.out.println(e);
                list.add(s);
            }
        }
        Collections.sort(list);
        for (String x : list ) {
            System.out.print(x + " ");
        }
    }
}
