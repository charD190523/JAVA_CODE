
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class XAU_DAY_DU {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            sc.nextLine();
            String s = sc.nextLine();
            int k = sc.nextInt();
            Set <Character> set = new TreeSet<>();
            for (Character x : s.toCharArray()) {
                set.add(x);
            }
            if (set.size() + k >= 26) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
