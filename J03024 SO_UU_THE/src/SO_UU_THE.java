import java.util.Scanner;

public class SO_UU_THE {
    public static void checkUT (String s) {
        int n = s.length();
        int sumChan = 0;
        int sumLe = 0;
        for (int i=0; i<n; i++) {
            if (s.charAt(i) < 48 || s.charAt(i) > 57) {
                System.out.println("INVALID");
                return;
            }
            if ((s.charAt(i) - '0') % 2 == 0) sumChan ++;
            else sumLe ++;
        }
        if (n % 2 ==0 && sumChan > sumLe || n % 2 == 1 && sumLe > sumChan) 
            System.out.println("YES");
        else System.out.println("NO");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            checkUT (s);
        }
    }
}
