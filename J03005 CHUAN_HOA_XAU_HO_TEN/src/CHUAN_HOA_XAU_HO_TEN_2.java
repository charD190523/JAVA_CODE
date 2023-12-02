import java.util.Scanner ;
public class CHUAN_HOA_XAU_HO_TEN_2 {
    public static String ho (String s) {
        if (s.length()==1) {
            return s.toUpperCase();
        }
        return s.substring(0, 1).toUpperCase() + s.substring (1).toLowerCase();
    }
    public static String ten (String s) {
        return s.substring(0).toUpperCase();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine().trim();
            String [] a = s.split("\\s+");
            System.out.print(ho(a[1]));
            for (int i=2; i<a.length; i++) {
                a[i] = ho(a[i]);
                System.out.print(" " + a[i]);
            }
            System.out.println(", " + ten(a[0]));
        }
    }
}
