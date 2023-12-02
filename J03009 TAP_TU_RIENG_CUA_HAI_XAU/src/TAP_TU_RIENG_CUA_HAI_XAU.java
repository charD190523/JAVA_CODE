
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Set;
public class TAP_TU_RIENG_CUA_HAI_XAU {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String [] a = sc.nextLine().split("\\s");
            String b = sc.nextLine();
            Set <String> set = new TreeSet<> ();
            for (String i : a) {
                if (!b.contains(i)) {
                    set.add(i);
                }
            }
            
            for (String i : set) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
