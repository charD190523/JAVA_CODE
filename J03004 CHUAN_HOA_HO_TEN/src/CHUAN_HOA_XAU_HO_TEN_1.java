import java.util.Scanner;
public class CHUAN_HOA_XAU_HO_TEN_1 {
    public static String chuanHoa (String s) {
        if (s.length() == 1) {
            return s.toUpperCase();
        }
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine().trim();
            String [] a = s.split("\\s+");
            for (String i : a)  {
                System.out.print(chuanHoa(i) + " ");
            }
            System.out.println();
        }
    }
}
