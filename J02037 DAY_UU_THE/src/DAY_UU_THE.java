
import java.util.ArrayList;
import java.util.Scanner;


public class DAY_UU_THE {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            ArrayList <Integer> list = new ArrayList <>();
            String s = sc.nextLine();
            String [] num = s.split("\\s++");
            for (String x : num) {
                list.add(Integer.parseInt(x));
            }
            int chan = 0;
            int le = 0;
            int cnt = 0;
            for (Integer x : list) {
                cnt++;
                if (x % 2 == 0) chan++;
                else le++;
            }
            if (cnt % 2 ==0 && chan > le || cnt % 2 !=0 && le > chan) {
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
