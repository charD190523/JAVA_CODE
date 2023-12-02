
import java.util.Scanner;

public class BIEN_SO_DEP {

    public static boolean check1(char [] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] >= a[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean check2(char [] a) {
        return (a[0] == a[1] && a[0] == a[2] && a[3] == a[4]) ;
    }

    public static boolean check3 (char [] a) {
        for (int i=0; i<a.length; i++) {
            if (a[i] != '6' && a[i] != '8') return false; 
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            char [] a = new char [5];
            a[0] = s.charAt(5) ;
            a[1] = s.charAt(6) ;
            a[2] = s.charAt(7) ;
            a[3] = s.charAt(9) ;
            a[4] = s.charAt(10) ;
            if (check1(a) || check2(a) || check3(a)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
