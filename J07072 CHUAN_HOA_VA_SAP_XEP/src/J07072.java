
// Không thể hiểu nổi 2 hàm compare khác nhau chỗ nào, hàm đã // thì WA, còn hàm hiện tại thì AC

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class J07072 {
    
    public static String chuanHoa (String s) {
        String [] name = s.split("\\s++");
        String res = "";
        for (int i=0; i<name.length; i++) {
            res += name[i].substring(0,1).toUpperCase() + name[i].substring(1).toLowerCase();
            res += " "; 
        }
        res = res.trim();
        return res;
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner (new File ("DANHSACH.in"));
        List <String> list = new ArrayList <> ();
        while (sc.hasNextLine()) {
            String s = sc.nextLine().trim();
            s = chuanHoa(s);
            list.add(s);
        }
        Collections.sort(list, new nameCompare() );
        for (String x : list ) {
            System.out.println(x);
        }
    }
}
class nameCompare implements Comparator<String> {

    @Override
//    public int compare(String o1, String o2) {
//        String a =o1.split("\\s++")[2] + " " + o1.split("\\s++")[0] + " " + o1.split("\\s++")[1];
//        String b =o2.split("\\s++")[2] + " " + o2.split("\\s++")[0] + " " + o2.split("\\s++")[1];
//        return a.compareTo(b);
//    }
    public int compare(String o1, String o2) {
        String[] name1 = o1.split("\\s+");
        String[] name2 = o2.split("\\s+");

        String lastName1 = name1[name1.length - 1];
        String lastName2 = name2[name2.length - 1];

        int lastNameComparison = lastName1.compareTo(lastName2);

        if (lastNameComparison == 0) {
            // Tên giống nhau, sắp xếp theo họ và tên đệm
            String firstName1 = name1[0];
            String firstName2 = name2[0];
            String middleName1 = name1[1];
            String middleName2 = name2[1];

            int firstNameComparison = firstName1.compareTo(firstName2);
            if (firstNameComparison == 0) {
                return middleName1.compareTo(middleName2);
            } else {
                return firstNameComparison;
            }
        } else {
            return lastNameComparison;
        }
    }
}
